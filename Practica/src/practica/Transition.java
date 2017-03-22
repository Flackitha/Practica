/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Amayrani
 */
public class Transition {
     public enum Action {MOVER_CANIBAL1, MOVER_CANIBAL2, MOVER_CANIBAL3, MOVER_MISIONERO1,MOVER_MISIONERO2,
    MOVER_MISIONERO3, MOVER_BOTE
    } 
    public State initial;
    public Action action;
    public State doTransition(){
        State result = new State();
        if (action == Action.MOVER_BOTE){
             result.Canibal1 = initial.Canibal1;
            result.Canibal2 = initial.Canibal2;
            result.Canibal3 = initial.Canibal3;
            result.Misionero1 = initial.Misionero1;
            result.Misionero2 = initial.Misionero2;
            result.Misionero3 = initial.Misionero3;
            if (initial.Bote == State.Position.DERECHA)
                result.Bote = State.Position.IZQUIERDA;
            else
                result.Bote = State.Position.DERECHA;
        }
        if (action == Action.MOVER_CANIBAL1){
            result.Canibal2 = initial.Canibal2;
            result.Canibal3 = initial.Canibal3;
            result.Misionero1 = initial.Misionero1;
            result.Misionero2 = initial.Misionero2;
            result.Misionero3 = initial.Misionero3;
            result.Bote = initial.Bote;
            if (initial.Canibal1 == State.Position.DERECHA)
                result.Canibal1 = State.Position.IZQUIERDA;
            else
                result.Canibal1 = State.Position.DERECHA;
        }
         if (action == Action.MOVER_CANIBAL2){
            result.Canibal2 = initial.Canibal1;
            result.Canibal3 = initial.Canibal3;
            result.Misionero1 = initial.Misionero1;
            result.Misionero2 = initial.Misionero2;
            result.Misionero3 = initial.Misionero3;
            result.Bote = initial.Bote;
            if (initial.Canibal2 == State.Position.DERECHA)
                result.Canibal2 = State.Position.IZQUIERDA;
            else
                result.Canibal2 = State.Position.DERECHA;
         }
          if (action == Action.MOVER_CANIBAL3){
            result.Canibal1 = initial.Canibal1;
            result.Canibal2 = initial.Canibal2;
            result.Misionero1 = initial.Misionero1;
            result.Misionero2 = initial.Misionero2;
            result.Misionero3 = initial.Misionero3;
            result.Bote = initial.Bote;
            if (initial.Canibal3 == State.Position.DERECHA)
                result.Canibal3 = State.Position.IZQUIERDA;
            else
                result.Canibal3 = State.Position.DERECHA;
          }
           if (action == Action.MOVER_MISIONERO1){
            result.Canibal1 = initial.Canibal1;
            result.Canibal2 = initial.Canibal2;
            result.Canibal3 = initial.Canibal3;
            result.Misionero2 = initial.Misionero2;
            result.Misionero3 = initial.Misionero3;
            result.Bote = initial.Bote;
            if (initial.Misionero1 == State.Position.DERECHA)
                result.Misionero1 = State.Position.IZQUIERDA;
            else
                result.Misionero1 = State.Position.DERECHA;
           }
           if (action == Action.MOVER_MISIONERO2){
            result.Canibal1 = initial.Canibal1;
            result.Canibal2 = initial.Canibal2;
            result.Canibal3 = initial.Canibal3;
            result.Misionero1 = initial.Misionero1;
            result.Misionero3 = initial.Misionero3;
            result.Bote = initial.Bote;
            if (initial.Misionero2 == State.Position.DERECHA)
                result.Misionero2 = State.Position.IZQUIERDA;
            else
                result.Misionero2 = State.Position.DERECHA;
           }
            if (action == Action.MOVER_MISIONERO3){
            result.Canibal1 = initial.Canibal1;
            result.Canibal2 = initial.Canibal2;
            result.Canibal3 = initial.Canibal3;
            result.Misionero1 = initial.Misionero1;
            result.Misionero3 = initial.Misionero2;
            result.Bote = initial.Bote;
            if (initial.Misionero3 == State.Position.DERECHA)
                result.Misionero3 = State.Position.IZQUIERDA;
            else
                result.Misionero3 = State.Position.DERECHA;
            
            
            }
            return result;
    }
     public Transition(State initial, Action action){
        this.initial = initial;
        this.action = action;
}
    
}
