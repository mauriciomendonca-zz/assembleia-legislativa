package models;

public class Federal extends Deputado {
    protected int numeroCadastro;

    public Federal(String nome, String partido, double salarioBruto, double salarioLiquido, Funcionario[] funcionarios, int numeroCadastro) {
        super(nome, partido, salarioBruto, salarioLiquido, funcionarios);
        this.numeroCadastro = numeroCadastro;
    }
}