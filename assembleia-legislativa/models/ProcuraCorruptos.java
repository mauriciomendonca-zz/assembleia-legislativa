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
}