package state;

public class ApoliceEstadoSuspensa extends ApoliceEstado {

    private ApoliceEstadoSuspensa() {};
    private static ApoliceEstadoSuspensa instance = new ApoliceEstadoSuspensa();
    public static ApoliceEstadoSuspensa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspensa";
    }

    public boolean reativar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        return true;
    }

    public boolean cancelar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        return true;
    }
}
