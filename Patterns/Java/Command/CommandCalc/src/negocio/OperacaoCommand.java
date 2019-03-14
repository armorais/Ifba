/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import interfaces.ICommand;

/**
 *
 * @author alison
 */
public class OperacaoCommand implements ICommand {
    
    private final Calculadora calc;
    private final String descricao;
    private final char operador;
    private final int operando;
    private final int valorOriginal;    
    
    public OperacaoCommand(char operador, int operando, Calculadora calc) {
        this.operando = operando;
        this.operador=operador;
        this.calc=calc;
        this.valorOriginal = calc.current();
        descricao = (valorOriginal + " " + operador + " " + operando);
    }
    
    @Override
    public int execute() {
        System.out.println("Executando : " + descricao);
        return calc.operacao(operador, operando);
    }

    @Override
    public int unExecute() {
        System.out.println("Revertendo a operacao : " + descricao);
        calc.setCurrent(valorOriginal);
        return valorOriginal;
    }
    
}
