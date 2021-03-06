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

   
    public void listarUsuarios() {
        this.repository.findAll().forEach(u -> {
            System.out.println(u);
        });
    }

    public void cadastrarUsuario(UserEntity user) {
        repository.save(user);
    }
}
