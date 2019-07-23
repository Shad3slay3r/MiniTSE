/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academik.minitse.dao;

import com.academik.minitse.model.PoliticalParty;
import com.academik.minitse.model.Voter;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author DATA_1
 */
@RequestScoped
public class PoliticalPartyDao {
    
        @PersistenceContext(unitName = "MiniTSE_PU")
    EntityManager em;

    @Transactional
    public void register(PoliticalParty newPP){
        em.persist(newPP);
    }

    @Transactional
    public List<PoliticalParty> findAll() {
        //JPQL
        TypedQuery<PoliticalParty> query = em.createQuery(


                //Equivalente a SELECT * FROM votante

                "SELECT v FROM PoliticalParty v",
                PoliticalParty.class
        );
        List<PoliticalParty> result = query.getResultList();
        return result;
    }
}
