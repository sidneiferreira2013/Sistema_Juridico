/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemajuridico.controller;

import br.com.sistemajuridico.model.Cliente;
import br.com.sistemajuridico.service.CadastroClienteService;
import br.com.sistemajuridico.util.FacesUtil;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cliente cliente;

    @Inject
    private CadastroClienteService cadastroClienteService;

    
    
    public CadastroClienteBean() {
        cliente = new Cliente();
    }

    
    public void salvar() {
        this.cliente = cadastroClienteService.salvar(this.cliente);
        FacesUtil.addInfoMessage("Cliente salvo com sucesso!");
    }

    public Cliente getCliente() {
        return cliente;
    }

}
