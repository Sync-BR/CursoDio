/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colletion.colletion.java.api;

/**
 *
 * @author Eduar
 */
public class Tarefa {
    private String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     @Override
    public String toString(){
        return titulo;
    }
    /*
    @Override
    public String toString(){
        return "Tarefa{"
                + "titulo'"+titulo+ '\''+
                '}';
    }
*/
}
