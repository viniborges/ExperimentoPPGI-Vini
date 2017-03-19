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

@ManagedBean
@RequestScoped
public class index {
    private List<Users> lst = new ArrayList<>();
    private String name;
    
    public List<Users> getLst() {
        return lst;
    }

    public void setLst(List<Users> lst) {
        this.lst = lst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
    @PostConstruct
    public void init(){
        lst = new controller.UsersController().getAll();
    }
    
    public boolean save(){
        Users u = new Users();
        u.setName(name);
        
        try {
            new controller.UsersController().persist(u);            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
