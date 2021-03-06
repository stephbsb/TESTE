package com.example.demo;

import com.example.demo.entities.EnderecoEntity;
import com.example.demo.entities.UserEntity;
import com.example.demo.resource.UsersResource;
import com.example.demo.resource.EnderecoResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UsersResource userService;
    
    @Autowired
    private EnderecoResource enderecoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");

        UserEntity novo = new UserEntity();
        novo.setNome("Adilina");
        novo.setEmail("adilina@gmail.com");
        userService.cadastrarUsuario(novo);
        
        EnderecoEntity novoEnd = new EnderecoEntity();
        novoEnd.setBairro("asa sul");
        novoEnd.setRua("quadra 207");
        novoEnd.setCidade("Brasilia");
        novoEnd.setEstado("DF");
                
        enderecoService.cadastrarEndereco(novo,novoEnd);
   
        userService.listarUsuarios();
        enderecoService.listarEnderecos();       
       
    }

}
