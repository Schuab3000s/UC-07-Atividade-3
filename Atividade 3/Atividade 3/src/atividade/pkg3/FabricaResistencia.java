package atividade.pkg3;

class FabricaResistencia implements Modelo{

    public Corrida getCorrida() {
        return new Atividade_A();
    }

    public Musculacao getMusculacao() {
        return new Atividade_C();
    }
}
