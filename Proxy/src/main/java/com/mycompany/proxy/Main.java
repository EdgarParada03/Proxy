/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        ChurrosCompany churrosCompany = new ChurrosCompany();
        
        //Get and sell churros
        System.out.println("Selling churros");
        System.out.println(churrosCompany.getChurrosQuantity());
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        System.out.println(churrosCompany.getChurrosQuantity());
        System.out.println("---------------------------------");
        
        //Prepare churros
        System.out.println("Preparing Churros");
        churrosCompany.startChurrosFactory();
    }
    
    //FROM: https://www.youtube.com/watch?v=FUUfQUp7Z54&list=PL5tXq8kBFh7HTnOQeXRy8zJqWw_4Ed-GT&index=8
}
