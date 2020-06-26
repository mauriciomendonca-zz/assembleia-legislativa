package models;

public class Estadual extends Deputado {
    protected String uf;

    public Estadual(String nome, String partido, double salarioBruto, double salarioLiquido, int quantidadeFuncionarios, String uf) {
        super(nome, partido, salarioBruto, salarioLiquido, quantidadeFuncionarios);
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}