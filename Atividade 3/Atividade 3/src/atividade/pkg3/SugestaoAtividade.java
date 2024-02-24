package atividade.pkg3;

public class SugestaoAtividade {

    private Corrida corrida;
    private Musculacao musculacao;
    private Modelo fabricaModelo;

    public SugestaoAtividade(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Corrida getCorrida() {
        return corrida;
    }

    public Musculacao getMusculacao() {
        return musculacao;
    }

    public void gerar() {
        corrida = fabricaModelo.getCorrida();
        musculacao = fabricaModelo.getMusculacao();
    }

}
