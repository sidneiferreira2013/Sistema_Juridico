package br.com.sistemajuridico.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidnei
 */
public class NegocioException  extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioException(String msg) {
		super(msg);
	}
	
}