package binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        //Usar BinaryOperator para somar todos numeros
        int resultado = numeros.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
