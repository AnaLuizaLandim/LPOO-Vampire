/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import model.Clan;
import model.Estado;
import model.Humano;
import model.VampiroCriador;
import model.dao.PersistenciaJPA;

/**
 *
 * @author @Ana
 */
public class TesteVampiroCriadorPersiste {
    public static void main(String[] args) {
        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {
            System.out.println("✅ Conexão aberta com sucesso!");
            
            VampiroCriador v = new VampiroCriador();
            v.setNome("Robson");
            v.setClan(Clan.BRUJA);
            v.setEstado(Estado.Morto);
            
            try {
                jpa.persist(v);
                System.out.println("🚗 Vampiro Criador salvo no banco!");
            } catch (Exception e) {
                System.out.println("❌ Erro ao salvar: " + e.getMessage());
            }

            jpa.fecharConexao();
        } else {
            System.out.println("❌ Falha ao abrir conexão.");
        }
    }
}
