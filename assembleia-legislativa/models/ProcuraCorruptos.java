package models;

public class ProcuraCorruptos {
    protected Deputado[] deputados;

    public ProcuraCorruptos(Deputado[] deputados) {
        this.deputados = deputados;
    }

    public Deputado[] getDeputados() {
        return deputados;
    }

    public void setDeputados(Deputado[] deputados) {
        this.deputados = deputados;
    }

    public Deputado[] deputadosComMaisFuncionarios() {
        int i = 0;
        Deputado[] deputadosComMaisFuncionarios = new Deputado[deputados.length];
        for (Deputado deputado : deputados) {
            if (deputado.getFuncionarios().length > 10) {
                deputadosComMaisFuncionarios[i] = deputado;
                i++;
            }
        }
        return deputadosComMaisFuncionarios;
    }

    public Deputado[] deputadosQueRecebemValores() {
        int i = 0;
        Deputado[] deputadosQueRecebemValores = new Deputado[deputados.length];
        for (Deputado deputado : deputados) {
            for (Funcionario funcionario : deputado.getFuncionarios()) {
                if (funcionario.getSalarioLiquido() < ((funcionario.getSalarioBruto() * 70) / 100)) {
                    deputadosQueRecebemValores[i] = deputado;
                    i++;
                }
            }
        }
        return deputadosQueRecebemValores;
    }

    public Deputado[] deputadosQueDesviamVerbas() {
        int i = 0;
        Deputado[] deputadosQueDesviamVerbas = new Deputado[deputados.length];
        for (Deputado deputado : deputados) {
            if (deputado.getSalarioLiquido() > ((deputado.getSalarioBruto() * 80) / 100)) {
                deputadosQueDesviamVerbas[i] = deputado;
                i++;
            }
        }
        return deputadosQueDesviamVerbas;
    }
}