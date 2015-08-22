/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp;

/**
 *
 * @author Anil
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menuChoice=0;
        menuChoice = Screen.displayMenu();
        System.out.println(""+menuChoice);
        if (menuChoice == 1) {
            AddCategory a = new AddCategory();
            a.add();

        }
    }
}
