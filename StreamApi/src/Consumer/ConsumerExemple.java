package Consumer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExemple {

    private  List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);

    private void numerosPares(){
         numeros.stream().forEach(new Consumer<Integer>() {
             @Override
             public void accept(Integer numero) {
                if(numero % 2 == 0){
                    System.out.println(numero);
                }
             }
         });
    }

    public static void main(String[] args) {
        ConsumerExemple consumer = new ConsumerExemple();
        consumer.numerosPares();
    }


}
