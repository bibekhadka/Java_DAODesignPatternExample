/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp.dao.impl;

import com.leapfrog.ddp.dao.CategoryDAO;

/**
 *
 * @author Anil
 */
public class CategoryDAOFactory {
    
    public static CategoryDAO get(String type){
        
        if(type.equalsIgnoreCase("array")){
            return new CategoryArrayImpl();
        }
        else if(type.equalsIgnoreCase("db")){
            return new CategoryDBImpl();
        }
        return null;
    }
    
}
