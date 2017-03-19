/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Services;

/**
 *
 * @author padrao
 */
@ManagedBean
@RequestScoped
public class Requisitions {
    
    private List<model.Requisitions> lst = new ArrayList<>();
    private List<model.Services> lstServices = new ArrayList<>();
    private int idService;
    private String description;

    public List<model.Requisitions> getLst() {
        return lst;
    }

    public void setLst(List<model.Requisitions> lst) {
        this.lst = lst;
    }

    public List<Services> getLstServices() {
        return lstServices;
    }

    public void setLstServices(List<Services> lstServices) {
        this.lstServices = lstServices;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @PostConstruct
    public void init(){
        lst = new controller.RequisitionsController().getAll();
    }
    
    public void save(){
        model.Requisitions r = new model.Requisitions();
        r.setDescription(description);
        model.Services s = new model.Services();
        s.setId(idService);
        r.setIdService(s);
        
        new controller.RequisitionsController().persist(r);
    }
}
