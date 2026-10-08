package state;

public class ApoliceEstadoCancelada extends ApoliceEstado {

    private ApoliceEstadoCancelada() {};
    private static ApoliceEstadoCancelada instance = new ApoliceEstadoCancelada();
    public static ApoliceEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }

}
