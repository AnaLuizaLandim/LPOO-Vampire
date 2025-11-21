/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Humano;
import model.VampiroCriador;

/**
 *
 * @author @Ana
 */
public class HumanoDAO extends PersistenciaJPA {
    public List<Humano> listaHumanos(){
    EntityManager em = getEntityManager();
       try {
            TypedQuery<Humano> query
                     = em.createQuery("SELECT v FROM Humano v", Humano.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
