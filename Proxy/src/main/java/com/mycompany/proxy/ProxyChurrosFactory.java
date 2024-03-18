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
public class ProxyChurrosFactory implements Factory{
    
    private Factory realFactory;
    
    public ProxyChurrosFactory(){
        System.out.println("Creating Proxy Factory");
    }
    
    @Override
    public List<String> initializeFactory() {
        if (realFactory == null) {
            realFactory = new RealChurrosFactory();
        }
        
        return realFactory.initializeFactory();
    }
    
}
