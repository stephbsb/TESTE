/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import javax.persistence.*;
import lombok.*;

/**
 *
 * @author stephany
 */

@Entity
@Table(name="user")
@Data
public class UserEntity {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iduser;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="email")
    private String email;    
    
}
