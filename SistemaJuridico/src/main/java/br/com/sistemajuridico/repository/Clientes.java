/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemajuridico.repository;

import br.com.sistemajuridico.model.Cliente;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Sidnei
 */
public class Clientes implements Serializable {
    
       private static final long serialVersionUID = 1L;
       
       @Inject
       private EntityManager manager;

    public Cliente guardar(Cliente cliente) {
        
        return manager.merge(cliente);
        
    }
}
