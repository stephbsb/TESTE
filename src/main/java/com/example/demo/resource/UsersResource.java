/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.resource;

import com.example.demo.entities.EnderecoEntity;
import com.example.demo.repository.UsersRepository;
import com.example.demo.entities.UserEntity;
import com.example.demo.repository.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stephany
 */
@Service
public class UsersResource {

    @Autowired
    private UsersRepository repository;
    
    @Autowired
    private EnderecoRepository endrepository;
    
    UserEntity u = new UserEntity();

    public void listarUsuarios() {
        this.repository.findAll().forEach(u -> {
            System.out.println(u);
        });
    }

    public void cadastrarUsuario(String nome, String email) {
        u.setNome(nome);
        u.setEmail(email);
        repository.save(u);
    }

    public void cadastrarEndereco(String rua, String bairro, String cidade, String estado){
        EnderecoEntity e = new EnderecoEntity();
        e.setRua(rua);
        e.setBairro(bairro);
        e.setCidade(cidade);
        e.setEstado(estado);
        e.setIduser_fk(u.getIduser());
                
        endrepository.save(e);        
    }

}
