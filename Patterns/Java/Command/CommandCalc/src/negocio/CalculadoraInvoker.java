/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import interfaces.ICommand;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alison
 */
public class CalculadoraInvoker {

    private int index = 0;
    private final Calculadora calc;
    private final List<ICommand> commands = new ArrayList<>();
    private static CalculadoraInvoker instance = null;
    
    private CalculadoraInvoker(Calculadora calc){
        this.calc = calc;
    }
    
    public static CalculadoraInvoker getInstance() {
        if(instance==null)
            instance=new CalculadoraInvoker(Calculadora.getInstance());
        
        return instance;
    }

    public int calcular(ICommand command) {
                
        if(index<commands.size())
            removeItems(index);
        
        commands.add(command);
        index++;
        
        return command.execute();
    }

    public int refazer() {
        
        if(index >= commands.size()){
            System.out.println("Não pode mais refazer nenhuma operacao");
            return calc.current();
        }
        
        ICommand calcCmd = commands.get(index);
        index++;
        return calcCmd.execute();
    }

    public int desfazer() {
        if(index == 0){
            System.out.println("Não pode mais desfazer nenhuma operacao");
            return calc.current();
        }                        
        int result;
        index--;
        ICommand calcCmd = commands.get(index);
        result = calcCmd.unExecute();
        return result;
    }
    
    private void removeItems(int posicao) {
        for(int i = posicao ; i<commands.size() ; i++)
            commands.remove(posicao);
    }

}
