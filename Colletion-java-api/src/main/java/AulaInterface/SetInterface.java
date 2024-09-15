package AulaInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Morango");
        for(String Frutas : frutas){
            System.out.println(Frutas);
        }
    }
}
