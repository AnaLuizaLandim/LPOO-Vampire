/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author @Ana
 */
@Entity
@Table(name = "Personagens")
public class PersonagemVamp extends Vampiro implements Serializable {

    @Id
    @Column(name = "vamp_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "vamp_idade")
    private int idade;

    @Column(name = "vamp_conceito")
    private String conceito;

    @ManyToOne(optional = true)
    @JoinColumn(name = "vamp_criador")
    private VampiroCriador criador;

    @ManyToOne(optional = true)
    @JoinColumn(name = "vamp_humano")
    private Humano humano;

    @Enumerated(EnumType.STRING)
    @Column(name = "vamp_tppredador")
    private TPPredador predador;

    @Enumerated(EnumType.STRING)
    @Column(name = "vamp_caracteristicas")
    private VantDesv caracteristicas;

    @Column(name = "vamp_cronica")
    private String cronica;

    @Column(name = "vamp_imagem")
    private byte[] imagem;

    public int getIdade() {
        return idade;
    }

    public String getConceito() {
        return conceito;
    }

    public VampiroCriador getCriador() {
        return criador;
    }

    public Humano getHumano() {
        return humano;
    }

    public TPPredador getPredador() {
        return predador;
    }

    public VantDesv getCaracteristicas() {
        return caracteristicas;
    }

    public String getCronica() {
        return cronica;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }

    public void setCriador(VampiroCriador criador) {
        this.criador = criador;
    }

    public void setHumano(Humano humano) {
        this.humano = humano;
    }

    public void setPredador(TPPredador predador) {
        this.predador = predador;
    }

    public void setCaracteristicas(VantDesv caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void setCronica(String Cronica) {
        this.cronica = Cronica;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return this.nome; // ou getNome() dependendo de como está o atributo
    }

    public String exibirDados() {
        // Define o mesmo formatador usado para a criação da string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String aux = "Vampiro cadastrada: \n";
        aux += "Nome: " + nome + "\n";
        aux += "Clã: " + clan + "\n";
        aux += "Idade: " + idade + "\n";
        aux += "Conceito: " + conceito + "\n";
        aux += "Criador: " + criador + "\n";
        aux += "Tipo de Predador: " + predador + "\n";
        aux += "Humano conhecido: " + humano + "\n";

        return aux;
    }

}
