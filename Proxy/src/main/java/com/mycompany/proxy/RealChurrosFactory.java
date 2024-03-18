/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class RealChurrosFactory implements Factory{
    
    List<String> churrosMachine;
    
    @Override
    public List<String> initializeFactory() {
        churrosMachine = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Machine "+i+ " initialized");
            churrosMachine.add("Machine " +i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return churrosMachine;
    }
    
}
