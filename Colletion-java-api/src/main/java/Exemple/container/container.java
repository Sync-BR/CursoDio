package Exemple.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class container {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<String>();
        frutas.add("Banana");
        frutas.add("Limão");
        frutas.add("Mango");

        boolean existe = frutas.contains("Banana");

        if(existe) {
            System.out.println("Existe");
        } else {
            System.out.println("Not Existe");
        }

        //Exemplo de interetor
        Iterator<String> it = frutas.iterator();
        while(it.hasNext()){
            String f = it.next();
            if(f == "Banana"){
                //Remover lista atual.
                it.remove();
           //Imprimir linha por linha     System.out.println(it.next());
            }
        }
        System.out.println(frutas);
    }
}
