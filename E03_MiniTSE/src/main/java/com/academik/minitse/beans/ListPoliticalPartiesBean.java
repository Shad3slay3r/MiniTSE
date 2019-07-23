/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academik.minitse.beans;

import com.academik.minitse.dao.PoliticalPartyDao;
import com.academik.minitse.dao.VoterDAO;
import com.academik.minitse.model.PoliticalParty;
import com.academik.minitse.model.Voter;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author DATA_1
 */
@ManagedBean(name= "listPoliticalPartiesBean")
@RequestScoped
public class ListPoliticalPartiesBean {
  
    @Inject
    PoliticalPartyDao dao;
    
    List<PoliticalParty> politicalp;

    public List<PoliticalParty> getPoliticalp() {
        politicalp = dao.findAll();
        return politicalp;
    }

    public void setPoliticalp(List<PoliticalParty> politicalp) {
        this.politicalp = politicalp;
    }
}
