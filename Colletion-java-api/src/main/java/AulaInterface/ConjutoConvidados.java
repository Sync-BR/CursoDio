package AulaInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjutoConvidados {

    private static Set<Convidade> convidados = new HashSet<>();
    ConjutoConvidados(){
        convidados = new HashSet<>();
    }
    public static void   adicionarConvidade(String nome, int codigo){
        convidados.add(new Convidade(nome, codigo));

    }

    public static void removerCodigoConvite(String codigo){
        int cod = Integer.parseInt(codigo);
        for(Convidade conv : convidados){
            if(conv.getCodigoConvite() == cod){
                convidados.remove(conv);
                break;
            }
        }
    }

    public static int contarTotalConvidade(){
        return convidados.size();
    }
    public static void exibirConvidade(){
        System.out.println(convidados);
    }
    
    /*Pesquisar todos nomes que começem com a palavra digitada.*/
    public Set<Convidade> PesquisarName(String nome){
        Set<Convidade> c1 = new HashSet<>();
        for(Convidade convidado: c1){
            if(convidado.getNome().startsWith(nome)){
                c1.add(convidado);
                System.out.println(convidado);
                return c1;
            }
        }
        return c1;
        
    }


    public static void main(String[] args) {
        adicionarConvidade("Teste", 12);
        adicionarConvidade("sync", 11);
        adicionarConvidade("br", 13);
        exibirConvidade();
        removerCodigoConvite("11");
        exibirConvidade();


    }
}
