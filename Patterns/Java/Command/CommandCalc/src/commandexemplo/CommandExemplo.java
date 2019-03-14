/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandexemplo;

import java.util.Scanner;
import negocio.OperacaoCommand;
import negocio.Calculadora;
import negocio.CalculadoraInvoker;
/**
 *
 * @author alison
 */
public class CommandExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        CalculadoraInvoker invoker = CalculadoraInvoker.getInstance();
        char o = 0;
        while(o != 's') {
            {
                System.out.println("Digite o sinal da operação (+, -, * ou /), 'u' para undo, 'r' para redo e 's' para sair:");
                o = s.next().charAt(0);
                
                switch (o){
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        System.out.println(operacao(o));
                        break;
                    case 'r':
                        System.out.println(invoker.refazer());
                        break;
                    case 'u':
                        System.out.println(invoker.desfazer());
                        break;
                    case 's':
                        break;
                }   
            }
        }
    }
    
    public static int operacao(char operacao) {
        int operando;
        Scanner s = new Scanner(System.in);
        Calculadora calc = Calculadora.getInstance();
        CalculadoraInvoker invoker = CalculadoraInvoker.getInstance();
        
        System.out.println("Esolha um numero para a operação (" + operacao + ") :");
        operando = s.nextInt();
        return invoker.calcular(new OperacaoCommand(operacao, operando, calc));
    }    
    
}
