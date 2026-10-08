package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApoliceTest {

    Apolice apolice;

    @BeforeEach
    public void setUp() {
        apolice = new Apolice();
    }

    @Test
    public void deveIniciarApoliceEmAnalise() {
        assertEquals(ApoliceEstadoEmAnalise.getInstance(), apolice.getEstado());
        assertEquals("Em Análise", apolice.getNomeEstado());
    }

    @Test
    public void deveAprovarApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertTrue(apolice.aprovar());
        assertEquals(ApoliceEstadoAtiva.getInstance(), apolice.getEstado());
    }

    @Test
    public void deveRecusarApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertTrue(apolice.recusar());
        assertEquals(ApoliceEstadoRecusada.getInstance(), apolice.getEstado());
    }

    @Test
    public void naoDeveSuspenderApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertFalse(apolice.suspender());
    }

    @Test
    public void naoDeveReativarApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertFalse(apolice.reativar());
    }

    @Test
    public void naoDeveCancelarApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertFalse(apolice.cancelar());
    }

    @Test
    public void naoDeveEncerrarApoliceEmAnalise() {
        apolice.setEstado(ApoliceEstadoEmAnalise.getInstance());
        assertFalse(apolice.encerrar());
    }

    @Test
    public void naoDeveAprovarApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertFalse(apolice.aprovar());
    }

    @Test
    public void naoDeveRecusarApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertFalse(apolice.recusar());
    }

    @Test
    public void deveSuspenderApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertTrue(apolice.suspender());
        assertEquals(ApoliceEstadoSuspensa.getInstance(), apolice.getEstado());
    }

    @Test
    public void naoDeveReativarApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertFalse(apolice.reativar());
    }

    @Test
    public void deveCancelarApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertTrue(apolice.cancelar());
        assertEquals(ApoliceEstadoCancelada.getInstance(), apolice.getEstado());
    }

    @Test
    public void deveEncerrarApoliceAtiva() {
        apolice.setEstado(ApoliceEstadoAtiva.getInstance());
        assertTrue(apolice.encerrar());
        assertEquals(ApoliceEstadoEncerrada.getInstance(), apolice.getEstado());
    }

    @Test
    public void naoDeveAprovarApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertFalse(apolice.aprovar());
    }

    @Test
    public void naoDeveRecusarApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertFalse(apolice.recusar());
    }

    @Test
    public void naoDeveSuspenderApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertFalse(apolice.suspender());
    }

    @Test
    public void deveReativarApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertTrue(apolice.reativar());
        assertEquals(ApoliceEstadoAtiva.getInstance(), apolice.getEstado());
    }

    @Test
    public void deveCancelarApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertTrue(apolice.cancelar());
        assertEquals(ApoliceEstadoCancelada.getInstance(), apolice.getEstado());
    }

    @Test
    public void naoDeveEncerrarApoliceSuspensa() {
        apolice.setEstado(ApoliceEstadoSuspensa.getInstance());
        assertFalse(apolice.encerrar());
    }

    @Test
    public void naoDeveAprovarApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.aprovar());
    }

    @Test
    public void naoDeveRecusarApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.recusar());
    }

    @Test
    public void naoDeveSuspenderApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.suspender());
    }

    @Test
    public void naoDeveReativarApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.reativar());
    }

    @Test
    public void naoDeveCancelarApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.cancelar());
    }

    @Test
    public void naoDeveEncerrarApoliceRecusada() {
        apolice.setEstado(ApoliceEstadoRecusada.getInstance());
        assertFalse(apolice.encerrar());
    }

    @Test
    public void naoDeveAprovarApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.aprovar());
    }

    @Test
    public void naoDeveRecusarApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.recusar());
    }

    @Test
    public void naoDeveSuspenderApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.suspender());
    }

    @Test
    public void naoDeveReativarApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.reativar());
    }

    @Test
    public void naoDeveCancelarApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.cancelar());
    }

    @Test
    public void naoDeveEncerrarApoliceCancelada() {
        apolice.setEstado(ApoliceEstadoCancelada.getInstance());
        assertFalse(apolice.encerrar());
    }

    @Test
    public void naoDeveAprovarApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.aprovar());
    }

    @Test
    public void naoDeveRecusarApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.recusar());
    }

    @Test
    public void naoDeveSuspenderApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.suspender());
    }

    @Test
    public void naoDeveReativarApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.reativar());
    }

    @Test
    public void naoDeveCancelarApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.cancelar());
    }

    @Test
    public void naoDeveEncerrarApoliceEncerrada() {
        apolice.setEstado(ApoliceEstadoEncerrada.getInstance());
        assertFalse(apolice.encerrar());
    }

}
