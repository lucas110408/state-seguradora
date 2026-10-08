package state;

public class ApoliceEstadoAtiva extends ApoliceEstado {

    private ApoliceEstadoAtiva() {};
    private static ApoliceEstadoAtiva instance = new ApoliceEstadoAtiva();
    public static ApoliceEstadoAtiva getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativa";
    }

    public boolean suspender(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        return true;
    }

    public boolean cancelar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        return true;
    }

    public boolean encerrar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        return true;
    }
}
