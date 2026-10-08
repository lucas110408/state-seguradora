package state;

public class ApoliceEstadoEncerrada extends ApoliceEstado {

    private ApoliceEstadoEncerrada() {};
    private static ApoliceEstadoEncerrada instance = new ApoliceEstadoEncerrada();
    public static ApoliceEstadoEncerrada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Encerrada";
    }

}
