package state;

public class ApoliceEstadoRecusada extends ApoliceEstado {

    private ApoliceEstadoRecusada() {};
    private static ApoliceEstadoRecusada instance = new ApoliceEstadoRecusada();
    public static ApoliceEstadoRecusada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recusada";
    }

}
