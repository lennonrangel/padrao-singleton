package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoSistemaTest {

    @Test
    public void deveRetornarNomeAplicacao() {
        ConfiguracaoSistema.getInstance().setNomeAplicacao("Meu Sistema");
        assertEquals("Meu Sistema", ConfiguracaoSistema.getInstance().getNomeAplicacao());
    }

    @Test
    public void deveRetornarVersao() {
        ConfiguracaoSistema.getInstance().setVersao("1.0.0");
        assertEquals("1.0.0", ConfiguracaoSistema.getInstance().getVersao());
    }

    @Test
    public void deveRetornarAmbienteExecucao() {
        ConfiguracaoSistema.getInstance().setAmbienteExecucao("producao");
        assertEquals("producao", ConfiguracaoSistema.getInstance().getAmbienteExecucao());
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        ConfiguracaoSistema instancia1 = ConfiguracaoSistema.getInstance();
        ConfiguracaoSistema instancia2 = ConfiguracaoSistema.getInstance();
        assertSame(instancia1, instancia2);
    }
}
