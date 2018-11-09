/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author tiago.lucas
 */
@Stateless
public class EJBLocal implements EJBLocalLocal {

    @Override
    public String recuperarMsg() {
        return "Testando o EJB Local";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
