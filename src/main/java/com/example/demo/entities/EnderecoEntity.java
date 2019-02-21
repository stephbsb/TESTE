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
@Table(name="endereco")
@Data
public class EnderecoEntity {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idendereco;
    
    @Column(name="rua")
    private String rua;
    
    @Column(name="bairro")
    private String bairro;  
    
    @Column(name="cidade")
    private String cidade; 
    
    @Column(name="estado")
    private String estado; 
    
    @Column(name="iduser")
    private Integer iduser;
    
}
