package models;

public class Deputado {
    private String nome;
    private String partido;
    private double salarioBruto;
    private double salarioLiquido;
    private Funcionario[] funcionarios;

    public Deputado(String nome, String partido, double salarioBruto, double salarioLiquido, Funcionario[] funcionarios) {
        this.nome = nome;
        this.partido = partido;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}