/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import model.Clan;
import model.Estado;
import model.PersonagemVamp;
import model.VampiroCriador;
import model.VantDesv;
import model.dao.PersistenciaJPA;

/**
 *
 * @author @Ana
 */
public class TesteVampiroPersonagem {
    public static void main(String[] args) {
        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {
            System.out.println("✅ Conexão aberta com sucesso!");
            
            PersonagemVamp v = new PersonagemVamp();
            v.setNome("Trevore");
            v.setClan(Clan.BRUJA);
            v.setCaracteristicas(VantDesv.ARCAICO);
            v.setCaracteristicas(VantDesv.DESLUMBRANTE);
            v.setCaracteristicas(VantDesv.LINGUISTICA_ADICIONAL);
            v.setConceito("Professor de História");
            v.setCronica("Criado nos anos 1980");
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
