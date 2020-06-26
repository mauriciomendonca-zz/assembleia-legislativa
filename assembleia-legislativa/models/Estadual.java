package models;

public class Estadual extends Deputado {
    protected String uf;

    public Estadual(String nome, String partido, double salarioBruto, double salarioLiquido, Funcionario[] funcionarios, String uf) {
        super(nome, partido, salarioBruto, salarioLiquido, funcionarios);
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}