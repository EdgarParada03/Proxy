/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

import java.util.List;

/**
 *
 * @author edgar
 */
public class ChurrosCompany {
    private Factory churrosFactory;
    private int churros;
    
    public ChurrosCompany(){
        churrosFactory = new ProxyChurrosFactory();
        churros = 100;
    }
    
    public void sellChurros(){
        churros = -1;
    }
    
    public int getChurrosQuantity(){
        return churros;
    }
    
    public List<String> startChurrosFactory(){
        return churrosFactory.initializeFactory();
    }
}
