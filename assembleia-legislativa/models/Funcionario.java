package models;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double salarioLiquido;

    public Funcionario(String nome, double salarioBruto, double salarioLiquido) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}