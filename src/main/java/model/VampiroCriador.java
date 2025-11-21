/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
@Table(name = "Criadores")
public class VampiroCriador extends Vampiro implements Serializable {

    @Id
    @Column(name = "criador_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "criador_estado")
    private Estado estado;
    
    @OneToMany(mappedBy = "criador")
    private List<PersonagemVamp> personagens;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

   
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome; // ou getNome()
    }
}
