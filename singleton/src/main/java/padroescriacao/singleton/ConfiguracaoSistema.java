package padroescriacao.singleton;

public class ConfiguracaoSistema {

    private ConfiguracaoSistema() {}
    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();
    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    private String nomeAplicacao;
    private String versao;
    private String ambienteExecucao;

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getAmbienteExecucao() {
        return ambienteExecucao;
    }

    public void setAmbienteExecucao(String ambienteExecucao) {
        this.ambienteExecucao = ambienteExecucao;
    }
}
