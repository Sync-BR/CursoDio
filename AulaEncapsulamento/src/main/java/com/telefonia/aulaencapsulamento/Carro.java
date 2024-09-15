
package com.telefonia.aulaencapsulamento;

public class Carro {
    
     
    
    public void Ligar(){
        boolean checkCombustivel = conferirCombustivel();
        boolean checkCambio = conferirCambio();
        if(checkCombustivel && checkCambio){
            System.out.println("Carro ligado ...");
        } else if( checkCombustivel && !checkCambio){
            System.out.println("Você está com valor na marcha");
        } else if(!checkCombustivel && checkCambio){
            System.out.println("Você está sem combustivel");
        } else {
            System.out.println("Leve o carro para oficina.");
        }
    }
    
    private boolean conferirCombustivel(){
        boolean check = false;
        int combustivel = 1;
        if(combustivel >= 2){
            check = true;
        } else {
            check = false;
        }
        return check;
    }
    
    private boolean conferirCambio(){
        boolean check = true;
        int cambio = 0;
        if(cambio != 0 ){
            check = false;
        } 
        
        return  check;
    }
}
