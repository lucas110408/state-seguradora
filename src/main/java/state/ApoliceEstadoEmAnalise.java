package state;

public class ApoliceEstadoEmAnalise extends ApoliceEstado {

    private ApoliceEstadoEmAnalise() {};
    private static ApoliceEstadoEmAnalise instance = new ApoliceEstadoEmAnalise();
    public static ApoliceEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Análise";
    }

    public boolean aprovar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        return true;
    }

    public boolean recusar(Apolice apolice) {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        return true;
    }
}
