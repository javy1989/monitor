/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geo.portal.web.bean;

import com.geo.portal.ejb.modelo.Parada;
import com.geo.portal.ejb.servicios.ParadaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ricardo.Bravo
 */
@ManagedBean(name = "manejador")
@ViewScoped
public class ManejadorBean {

    @EJB
    private ParadaFacade ejbParada;

    public ManejadorBean() {
    }

    public void listar() {
        List<Parada> list = ejbParada.findAll();
        list.forEach((p) -> {
            System.out.println(p);
        });
    }
}
