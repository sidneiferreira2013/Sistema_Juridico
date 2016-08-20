
package br.com.sistemajuridico.service;

import br.com.sistemajuridico.repository.Clientes;
import br.com.sistemajuridico.model.Cliente;
import br.com.sistemajuridico.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Sidnei
 */

public class CadastroClienteService implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Clientes clientes;
    
    
    @Transactional
   public Cliente salvar(Cliente cliente){
       return clientes.guardar(cliente);
   }
}
