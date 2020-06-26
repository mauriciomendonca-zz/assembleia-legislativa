package models;

public class Federal extends Deputado {
    protected int numeroCadastro;

    public Federal(String nome, String partido, double salarioBruto, double salarioLiquido, Funcionario[] funcionarios, int numeroCadastro) {
        super(nome, partido, salarioBruto, salarioLiquido, funcionarios);
        this.numeroCadastro = numeroCadastro;
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}