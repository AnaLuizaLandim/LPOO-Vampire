/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import javax.persistence.EntityManager;
import model.Clan;
import model.Estado;
import model.Humano;
import model.HumanoVinculo;
import model.Ligacao;
import model.PersonagemVamp;
import model.VampiroCriador;
import model.VantDesv;
import model.dao.PersistenciaJPA;

/**
 *
 * @author @Ana
 */
public class TestePersisteRelacao {
     public static void main(String[] args) {
        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {
            System.out.println("✅ Conexão aberta com sucesso!");
            
            EntityManager em = jpa.getEntityManager();
             PersonagemVamp v = em.createQuery(
                "SELECT v FROM PersonagemVamp v WHERE v.nome = :nome", PersonagemVamp.class
            )
            .setParameter("nome", "Trevore")
            .getSingleResult();
             
            Humano humano = em.createQuery(
                "SELECT h FROM Humano h WHERE h.nome = :nome", Humano.class
            )
            .setParameter("nome", "Roberto")
            .getSingleResult();

            // 3️⃣ Criar vínculo
            HumanoVinculo vinculo = new HumanoVinculo(v, humano, Ligacao.Avó);

            try {
                jpa.persist(vinculo);
                System.out.println("Vinculo salvo no banco!");
            } catch (Exception e) {
                System.out.println("❌ Erro ao salvar: " + e.getMessage());
            }

            jpa.fecharConexao();
        } else {
            System.out.println("❌ Falha ao abrir conexão.");
        }
    }
    }

