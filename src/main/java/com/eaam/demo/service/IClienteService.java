/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eaam.demo.service;

import com.eaam.demo.domain.Cliente;
import java.util.List;

/**
 *
 * @author poke
 */
public interface IClienteService {
    public List<Cliente> findAll();
    
    public Cliente findById(int id);
    
    public Cliente save(Cliente cliente);
    
    public void delete(int id);
    
}
