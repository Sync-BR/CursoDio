/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.telefonia.aulaabastratopolimofismo;

/**
 *
 * @author Eduar
 */
public class AulaAbastratoPolimofismo {

    public static void main(String[] args) {
        ServicoMensagemInstatanio servico = null; 

        msn Msn =  new msn();
        Msn.validarConexao();
        Msn.enviarMensagem();
    }
}
