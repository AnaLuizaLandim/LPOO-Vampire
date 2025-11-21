/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.PersonagemVamp;
import model.VampiroCriador;

/**
 *
 * @author @Ana
 */
public class PersonagemDAO extends PersistenciaJPA{
    public List<PersonagemVamp> listaPersonagemVamp(){
    EntityManager em = getEntityManager();
       try {
            TypedQuery<PersonagemVamp> query
                     = em.createQuery("SELECT v FROM PersonagemVamp v", PersonagemVamp.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
