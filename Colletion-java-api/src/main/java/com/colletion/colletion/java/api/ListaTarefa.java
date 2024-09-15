/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colletion.colletion.java.api;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduar
 */
public class ListaTarefa {
    private List<Tarefa> tarefaList;
 
    public ListaTarefa() {
        tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String tarefa){
        tarefaList.add(new Tarefa(tarefa));
    }
    
    public void removerTarefa(String tarefa){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefas : tarefaList){
            if(tarefas.getTitulo().equalsIgnoreCase(tarefa)){
                tarefasParaRemover.add(tarefas);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }
    
    public void obterTitulosTarefas(){
        System.out.println(tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        System.out.println(lista.obterNumeroTotalDeTarefas());
        
        lista.obterTitulosTarefas();
    }
    
}
