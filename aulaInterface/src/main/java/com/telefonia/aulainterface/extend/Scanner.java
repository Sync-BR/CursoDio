/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telefonia.aulainterface.extend;

import com.telefonia.aulainterface.interfaces.ScanerINT;

/**
 *
 * @author Eduar
 */
public class Scanner implements ScanerINT {
    
    @Override
    public void Scannear(){
        System.out.println("Scanneando...");
    }
    
}
