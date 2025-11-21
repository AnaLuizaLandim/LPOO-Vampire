/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Ana Luiza
 */


public enum Clan {
    Selecionar("Sem disciplina","Sem disciplina","Sem disciplina"),
    BRUJA("Potência", "Rapidez", "Presença"),
    GANGREL("Fortitude", "Metamorfose", "Animalismo"),
    MALKAVIAN("Auspícios", "Dominação", "Ofuscação"),
    NOSFERATU("Potência", "Ofuscação", "Animalismo"),
    TREMERE("Feitiçaria do Sangue", "Auspícios", "Dominação"),
    VENTRUE("Fortitude", "Dominação", "Presença"),
    BANU_HAQIM("Feitiçaria do Sangue", "Rapidez", "Ofuscação"),
    LASOMBRA("Oblivion", "Potência", "Dominação"),
    HECATA("Vitam/Oblivion (Necromancia)", "Fortitude", "Feitiçaria do Sangue"),
    RAVNOS("Ofuscação", "Rapidez", "Animalismo"),
    SALUBRI("Auspícios", "Fortitude", "Presença"),
    TZIMISCE("Metamorfose", "Dominação", "Animalismo"),
    CAITIFF("Livre", "Livre", "Livre");

    private final String disciplina1;
    private final String disciplina2;
    private final String disciplina3;

    Clan(String disciplina1, String disciplina2, String disciplina3) {
        this.disciplina1 = disciplina1;
        this.disciplina2 = disciplina2;
        this.disciplina3 = disciplina3;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public List<String> getDisciplinas() {
        return List.of(disciplina1, disciplina2, disciplina3);
    }
}
