package models;

public class Deputado {
    private String nome;
    private String partido;
    private double salarioBruto;
    private double salarioLiquido;
    private Funcionario[] funcionarios;

    public Deputado(String nome, String partido, double salarioBruto, double salarioLiquido, int quantidadeFuncionarios) {
        this.nome = nome;
        this.partido = partido;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;

        this.funcionarios = new Funcionario[quantidadeFuncionarios];
        for (int i = 0; i < funcionarios.length; i++) {
            double bruto = geraFuncionarios()[0];
            double liquido = geraFuncionarios()[1];
            funcionarios[i] = new Funcionario(bruto, liquido);
        }
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

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    private double[] geraFuncionarios() {
        double salarioBrutoFuncionario;
        double salarioLiquidoFuncionario;

        salarioBrutoFuncionario = 3000 + Math.random() * (5000 - 3000 + 1);
        salarioLiquidoFuncionario = salarioBruto + ((-2000) + Math.random() * (3000 - (-2000) + 1));

        double[] arraySalarios = {salarioBrutoFuncionario, salarioLiquidoFuncionario};
        return arraySalarios;
    }
}