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

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}