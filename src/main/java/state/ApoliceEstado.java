package state;

public abstract class ApoliceEstado {

    public abstract String getEstado();

    public boolean aprovar(Apolice apolice) {
        return false;
    }

    public boolean recusar(Apolice apolice) {
        return false;
    }

    public boolean suspender(Apolice apolice) {
        return false;
    }

    public boolean reativar(Apolice apolice) {
        return false;
    }

    public boolean cancelar(Apolice apolice) {
        return false;
    }

    public boolean encerrar(Apolice apolice) {
        return false;
    }

}
