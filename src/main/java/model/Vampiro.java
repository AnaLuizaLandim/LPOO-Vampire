/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Ana Luiza
 */
@MappedSuperclass
public class Vampiro {
    
    @Column(name = "vamp_name")
     String nome;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "clan")
    Clan clan;

    public String getNome() {
        return nome;
    }

    public Clan getClan() {
        return clan;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }
    
    
    public String exibirDados(){
        // Define o mesmo formatador usado para a criação da string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String aux = "Vampiro cadastrada: \n";
        aux += "Nome: " + nome+ "\n";
        aux += "Clã: " + clan +"\n";
        return aux;
    }
            
}
