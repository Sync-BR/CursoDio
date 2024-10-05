package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemple {



    public static void main(String[] args) {
        //Usar o Supplier com expressão lambda.
        Supplier<String> saudacao = () -> "Olá, me chamo Eduardo e seja bem vindos";

        //Usar o Supplier para obter uma lista com saudações definida no limit do código.
        List<String> listaSaudacao = Stream.generate(saudacao).limit(1).toList();
        listaSaudacao.forEach(System.out::println);
    }
}
