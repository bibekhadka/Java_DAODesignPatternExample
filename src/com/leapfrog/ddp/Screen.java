/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BBK
 */
public class Screen {
    public static int displayMenu(){
        
        int choice=7;       
        System.out.println("Welcome to Category Map System");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Show All");
        System.out.println("5. Search by Id");
        System.out.println("6. Search");
        System.out.println("7. Exit");
        System.out.println("Enter your choice[1-7]");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
        choice=Integer.parseInt(reader.readLine());
        }catch(IOException e){}
        return choice;
        
    }
}
