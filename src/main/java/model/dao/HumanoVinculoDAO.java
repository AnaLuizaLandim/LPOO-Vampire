/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Humano;
import model.HumanoVinculo;

/**
 *
 * @author @Ana
 */
public class HumanoVinculoDAO extends PersistenciaJPA {
    public List<HumanoVinculo> listaHumanos(){
    EntityManager em = getEntityManager();
       try {
            TypedQuery<HumanoVinculo> query = em.createQuery("SELECT v FROM HumanoVinculo v", HumanoVinculo.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
