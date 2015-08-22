/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp;

import com.leapfrog.ddp.entity.Category;
import com.leapfrog.ddp.service.CategoryService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BBK
 */
public class AddCategory {
    public void add(){
         CategoryService cs=new CategoryService();
         String choice="Y";
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
            while(choice.equalsIgnoreCase("Y")){           
            try{
            Category category=new Category();
            System.out.println("Enter Id:");
            category.setId(Integer.parseInt(reader.readLine()));
            System.out.println("Enter Category Name:");
            category.setName(reader.readLine());
            
            cs.insert(category);
            System.out.println("Do you want to continue:[Y/N]");
            choice=reader.readLine();
            
            }catch(IOException ioe){
                
            }
            
    }
        for(Category c : cs.getAll()){
            System.out.println(c.toString());
        }
}
}
