/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Excepciones;

/**
 *
 * @author Berserker
 */
public class ExceptionRegla01 extends Exception{
    public String getMessage(){
        return "ERROR!!! El array no puede contener más de 5 elementos enteros";
    }
}
