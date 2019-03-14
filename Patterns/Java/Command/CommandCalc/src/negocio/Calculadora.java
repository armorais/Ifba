/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alison
 */
public class Calculadora {
    private int current = 0;
    private static Calculadora instance = null;
    
    private Calculadora(){
    }
    
    public static Calculadora getInstance(){
        if(instance==null){
            instance = new Calculadora();
        }
        
        return instance;    
    }

    public int operacao(char operador, int operando) {
        switch (operador) {
            case '+':
                return current += operando;
            case '-':
                return current -= operando;
            case '*':
                return current *= operando;
            case '/':
                return current /= operando;
        }
        return 0;
    }
    
    public int current() {
        return current;
    }
    
    protected void setCurrent(int valor) {
        current = valor;
    }
}
