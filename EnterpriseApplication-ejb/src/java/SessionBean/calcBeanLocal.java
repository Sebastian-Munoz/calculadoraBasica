/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface calcBeanLocal {

    Integer addition(int a, int b);

    Integer restar(int a, int b);

    Integer multiplicar(int a, int b);

    Integer dividir(int a, int b);
    
}
