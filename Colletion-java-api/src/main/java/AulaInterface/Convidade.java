package AulaInterface;

import java.util.Objects;

public class Convidade {
    private String nome;
    private int codigoConvite;

    Convidade(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidade{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidade convidade = (Convidade) o;
        return codigoConvite == convidade.codigoConvite && Objects.equals(nome, convidade.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigoConvite);
    }
}
