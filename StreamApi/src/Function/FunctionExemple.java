package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemple {
    //Exemple com lambda
    private static void lambda(){
        List<Integer> numero = Arrays.asList(10,20,30,40);
        List<Integer> numerosDobrados = numero.stream().map(n -> n*2).toList();
        numerosDobrados.forEach(System.out::println);

    }

    //Exemple com function
    public static void function(){
        List<Integer> numero = Arrays.asList(10,20,30,40);
        Function<Integer, Integer> dobrar = valor -> valor*2;
        List<Integer> numerosDobrados = numero.stream().map(dobrar).toList();
        numerosDobrados.forEach(System.out::println);
    }

    public static void main(String[] args) {
        lambda();
        function();

    }
}
