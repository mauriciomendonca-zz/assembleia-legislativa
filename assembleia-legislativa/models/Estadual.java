package models;

public class Estadual extends Deputado {
    protected String uf;

    public Estadual(String nome, String partido, double salarioBruto, double salarioLiquido, Funcionario[] funcionarios, int numeroCadastro) {
        super(nome, partido, salarioBruto, salarioLiquido, funcionarios);
        this.uf = uf;
    }
}