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
            }
        }
        return deputadosComMaisFuncionarios;
    }
}