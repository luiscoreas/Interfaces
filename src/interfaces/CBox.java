/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author CT7-PC49
 */
public class CBox implements IBox {
    private Object Objeto;
    
    public CBox(){
        Objeto = null;
    }

    public void put(Object objeto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Objeto = objeto;
    }

    public Object get() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return Objeto;
    }

    public void ObtenerClase(CBox cbox) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
