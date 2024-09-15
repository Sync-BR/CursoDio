/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.telefonia.aulaenum;

import java.awt.BorderLayout;

/**
 *
 * @author Eduar
 */
public class AulaEnum {

    public static void main(String[] args) {

        
        for(Estados estados : Estados.values())
            System.out.println("Sigla: " +estados.getSigla()+ " Estado: " +estados.getEstado());
        
    }
}
