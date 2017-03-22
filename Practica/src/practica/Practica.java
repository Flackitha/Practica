/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author guadalupe
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          State initial = new State();
        initial.Misionero1 = State.Position.DERECHA;
        initial.Misionero2 = State.Position.DERECHA;
        initial.Misionero3 = State.Position.DERECHA;
        initial.Canibal1 = State.Position.DERECHA;
        initial.Canibal2 = State.Position.DERECHA;
        initial.Canibal3 = State.Position.DERECHA;
        initial.Bote = State.Position.DERECHA;
        System.out.println("Estado inicial:"+ initial);
        ArrayList<Transition> next = initial.validTransitions();
        System.out.println("Transiciones" + next.size());
        
        for (Transition t: next){
            System.out.println("Acción:"+ t.action);
            System.out.println("Resultado:"+ t.doTransition());
        }
    }
    }
    

