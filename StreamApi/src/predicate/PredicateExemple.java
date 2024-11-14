package predicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExemple {

    private void predicateFuction(Predicate<String> palavras){
        Predicate<String> palavra = a -> a.length() > 5;
        System.out.println(palavra);
    }
    private void filterStream(List<String> lista){
        lista.stream().filter(a -> a.length() > 5).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Eduardo", "Carlos", "Celia", "Batata", "Pão");
        PredicateExemple predicate = new PredicateExemple();
        predicate.filterStream(palavras);

//        //Criar um predicate que verificar se possuir 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        System.out.println(maisDeCincoCaracteres);
//        //Usar o Sreeam para filtrar as palavras com mais de 5 caracteres.
//        palavras.stream().filter(a -> a.length() < 5)
//                .forEach(System.out::println);
    }

}
