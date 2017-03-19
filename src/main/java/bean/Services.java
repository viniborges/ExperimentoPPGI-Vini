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
import model.Users;

/**
 *
 * @author padrao
 */
@ManagedBean
@RequestScoped
public class Services {
    
    private int idUser;
    private String name;
    private List<model.Services> lst = new ArrayList<>();

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<model.Services> getLst() {
        return lst;
    }

    public void setLst(List<model.Services> lst) {
        this.lst = lst;
    }
    
    @PostConstruct
    public void init(){
        lst = new controller.ServicesController().getAll();
    }
    
    public void save(){
        model.Services s = new model.Services();
        s.setName(name);
        Users u = new Users();
        u.setId(idUser);
        s.setIdUser(u);
        
        new controller.ServicesController().persist(s);
    }
    
}
