/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telefonia.aulaabastratopolimofismo;

/**
 *
 * @author Eduar
 */
public class msn extends ServicoMensagemInstatanio{

    @Override
    public void enviarMensagem() {
        
        System.out.println("Mensagem Enviada");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem Recebida");
    }


    
}
