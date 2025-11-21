/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author @Ana
 */
public enum VantDesv {

    // --------- DEFEITOS ---------
    ANALFABETO("Defeito", 2),
    FEIO("Defeito", 1),
    REPULSIVO("Defeito", 2),
    VICIO_INCURAVEL("Defeito", 2),
    DEPENDENCIA("Defeito", 1),
    ARCAICO("Defeito", 2),
    VIVENDO_NO_PASSADO("Defeito", 1),
    DIVIDA("Defeito", 2),
    SEM_REFUGIO("Defeito", 1),

    // --------- QUALIDADES ---------
    BELO("Qualidade", 2),
    DESLUMBRANTE("Qualidade", 3),
    LINGUISTICA_ADICIONAL("Qualidade", 1),
    RESISTENTE_AO_LACO("Qualidade", 1),
    LACO_CURTO("Qualidade", 2),
    A_PROVA_DO_LACO("Qualidade", 3),
    INGERIR_COMIDA("Qualidade", 2),
    CELEBRIDADE("Qualidade", 3),
    INFLUENTE("Qualidade", 2),
    REFUGIO("Qualidade", 2);

    private final String tipo;
    private final int pontos;

    VantDesv(String tipo, int pontos) {
        this.tipo = tipo;
        this.pontos = pontos;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPontos() {
        return pontos;
    }
}

