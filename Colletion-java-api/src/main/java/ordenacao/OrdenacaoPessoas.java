/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eduar
 */
public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas = new ArrayList<>();

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(Pessoa pessoa){
        listaPessoas.add(new Pessoa(pessoa));
    }
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    
    public List<Pessoa>compararPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorAltura, new comparetoPorAltura() );
        return pessoaPorAltura;
    }
        public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPoessoa = new OrdenacaoPessoas();
        Pessoa Edurdo = new Pessoa("Eduardo", 26, 1.80);
        Pessoa Carlos = new Pessoa("Carlos", 15, 1.50);
        Pessoa SYNC = new Pessoa("SYNC", 12, 1.87);
        ordenacaoPoessoa.adicionarPessoa(SYNC);
        ordenacaoPoessoa.adicionarPessoa(Edurdo);
        ordenacaoPoessoa.adicionarPessoa(Carlos);
            System.out.println(ordenacaoPoessoa.ordenadoPorIdade());
    }
}
