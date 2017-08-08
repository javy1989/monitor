/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.portal.ejb.servicios;

import com.geo.portal.ejb.modelo.Parada;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ricardo.Bravo
 */
@Stateless
public class ParadaFacade extends AbstractFacade<Parada> {
    @PersistenceContext(unitName = "GeoPortal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParadaFacade() {
        super(Parada.class);
    }
    
}
