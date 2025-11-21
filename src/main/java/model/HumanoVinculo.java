/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author @Ana
 */
@Entity
@Table(name = "Vinculos")
public class HumanoVinculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vampiro_id")
    private PersonagemVamp vampiro;

    @ManyToOne
    @JoinColumn(name = "humano_id")
    private Humano humano;

    @Enumerated(EnumType.STRING)
    private Ligacao ligacao;

    public HumanoVinculo() {}

    public HumanoVinculo(PersonagemVamp vampiro, Humano humano, Ligacao ligacao) {
        this.vampiro = vampiro;
        this.humano = humano;
        this.ligacao = ligacao;
    }

    public Long getId() {
        return id;
    }

    public PersonagemVamp getVampiro() {
        return vampiro;
    }

    public Humano getHumano() {
        return humano;
    }

    public Ligacao getLigacao() {
        return ligacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVampiro(PersonagemVamp vampiro) {
        this.vampiro = vampiro;
    }

    public void setHumano(Humano humano) {
        this.humano = humano;
    }

    public void setLigacao(Ligacao ligacao) {
        this.ligacao = ligacao;
    }

    
}

