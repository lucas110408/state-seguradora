package state;

public class Apolice {

    private String numero;
    private ApoliceEstado estado;

    public Apolice() {
        this.estado = ApoliceEstadoEmAnalise.getInstance();
    }

    public void setEstado(ApoliceEstado estado) {
        this.estado = estado;
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean recusar() {
        return estado.recusar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean reativar() {
        return estado.reativar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ApoliceEstado getEstado() {
        return estado;
    }
}
