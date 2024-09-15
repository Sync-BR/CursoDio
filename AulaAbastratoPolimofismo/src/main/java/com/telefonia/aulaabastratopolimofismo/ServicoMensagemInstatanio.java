/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telefonia.aulaabastratopolimofismo;

/**
 *
 * @author Eduar
 */
public abstract class ServicoMensagemInstatanio {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    
    protected void validarConexao(){
        System.out.println("Conexão valida!");
    }
}
