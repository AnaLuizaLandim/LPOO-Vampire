/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author @Ana
 */
@Entity
@Table(name = "Humanos")
public class Humano {
    @Id
    @Column(name = "human_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
   @Column(name = "human_nome")
    private String nome;
   
    
    @Enumerated(EnumType.STRING)
    @Column(name = "human_estado")
    private Estado estado;
    
   
    
    public Long getId() {
        return id;
    }

 

    public Humano() {}

   
   
    

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

  

    public Estado getEstado() {
        return estado;
    }

    public Humano(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
       
    }
    
     @Override
    public String toString() {
        return nome; // ou getNome()
    }
    
}
