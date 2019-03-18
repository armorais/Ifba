/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.HashMap;

/**
 *
 * @author alison
 */
public class FrutaFactory {
    private final HashMap<String, IClonavel> frutas = new HashMap<>();
    
    public Componente getFruta(String nome) {
        if(frutas.containsKey(nome))
            return frutas.get(nome).clonar();
        return null;
    }
    
    public void addFruta(Componente fruta) {
        frutas.put(fruta.toString(), (IClonavel) fruta);
    }
    
    public void removerFruta(String nome) {
        frutas.remove(nome);
    }
    
    public void limpar() {
        frutas.clear();
    }
    
}
