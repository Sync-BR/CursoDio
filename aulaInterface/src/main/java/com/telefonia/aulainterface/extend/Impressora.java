/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telefonia.aulainterface.extend;

import com.telefonia.aulainterface.interfaces.inpressoraINT;

/**
 *
 * @author Eduar
 */
public class Impressora implements inpressoraINT {
    @Override
    public void imprimir(){
        System.out.println("Imprimindo");
    }
    @Override
    public void salvar(){
        System.out.println("Salvando");
    }
    
    
}
