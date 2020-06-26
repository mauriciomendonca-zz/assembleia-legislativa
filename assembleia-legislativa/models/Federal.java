package models;

public class Federal extends Deputado {
    protected int numeroCadastro;

    public Federal(String nome, String partido, double salarioBruto, double salarioLiquido, int quantidadeFuncionarios, int numeroCadastro) {
        super(nome, partido, salarioBruto, salarioLiquido, quantidadeFuncionarios);
        this.numeroCadastro = numeroCadastro;
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }
}