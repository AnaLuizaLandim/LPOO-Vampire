/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.VampiroCriador;

/**
 *
 * @author @Ana
 */
public class VampiroCriadorDAO extends PersistenciaJPA{
    public List<VampiroCriador> listaVampirosCriadores(){
    EntityManager em = getEntityManager();
       try {
            TypedQuery<VampiroCriador> query
                     = em.createQuery("SELECT v FROM VampiroCriador v", VampiroCriador.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
