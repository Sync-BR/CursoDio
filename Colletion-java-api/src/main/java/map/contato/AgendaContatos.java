package map.contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private static Map<String, Integer> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashMap<>();
    }
    public void update(String key, int newTelefone){
        if(listaContatos.containsKey(key)){
            listaContatos.put(key,newTelefone);
        }else{
            System.out.println("Erro ao atualizar Key não encontrado");
        }
    }

    public void adicionarContato(String nome, int telefone){
        listaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!listaContatos.isEmpty()){
            listaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Integer pesquisarContato(String nome){
        int numero = 0;
        if(!listaContatos.isEmpty()){
            numero = listaContatos.get(nome);

        }
        return numero;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Eduardo", 1554);
        agenda.adicionarContato("SYNC", 2244);
        agenda.adicionarContato("DARKZIN", 81545);
        agenda.adicionarContato("Carlos", 22144);
        agenda.exibirContatos();
        agenda.update("SYNCs", 123);
        agenda.exibirContatos();
        agenda.removerContato("SYNC");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarContato("DARKZIN"));
    }
}
