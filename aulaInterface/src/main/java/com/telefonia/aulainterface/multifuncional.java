/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telefonia.aulainterface;

import com.telefonia.aulainterface.interfaces.ScanerINT;
import com.telefonia.aulainterface.interfaces.inpressoraINT;

/**
 *
 * @author Eduar
 */
public class multifuncional implements  ScanerINT, inpressoraINT{

    @Override
    public void Scannear() {
        System.out.println("Scanneando");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo");
    }

    @Override
    public void salvar() {
        System.out.println("Salvar");
    }
    
}
