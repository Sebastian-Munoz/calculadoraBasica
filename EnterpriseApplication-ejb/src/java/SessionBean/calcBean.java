/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author usuario
 */
@Stateless
public class calcBean implements calcBeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer restar(int a, int b) {
        return (a-b);
    }
    
    @Override
    public Integer multiplicar(int a, int b) {
        return (a*b);
    }
    
    @Override
    public Integer dividir(int a, int b) {
        return (a/b);
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    

    

    
}
