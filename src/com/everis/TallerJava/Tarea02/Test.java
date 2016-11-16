/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Tarea02;

import com.everis.TallerJava.Excepciones.ExceptionRegla01;
import com.everis.TallerJava.Excepciones.ExceptionRegla02;
import com.everis.TallerJava.Excepciones.ExceptionRegla03;

/**
 *
 * @author Berserker
 */
public class Test {
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,1,5};
        try {
            if (arreglo.length >5) {
                ExceptionRegla01 eR01 = new ExceptionRegla01();
                throw eR01;
            }else{
                for (int i = 0; i < arreglo.length; i++) {
                    if (arreglo[i] > 9) {
                        ExceptionRegla02 eR02 = new ExceptionRegla02();
                        throw eR02;
                    }else if (arreglo[i]<0) {
                        ExceptionRegla03 eR03 = new ExceptionRegla03();
                        throw eR03;
                    }
                }
                
                System.out.println("Arreglo\n");
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println(arreglo[i]);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
