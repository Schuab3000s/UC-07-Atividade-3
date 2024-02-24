package atividade.pkg3;

class FabricaVelocidade implements Modelo {
    
    public Corrida getCorrida(){
        return new Atividade_B();
    }
    
    public Musculacao getMusculacao(){
        return new Atividade_D();
    }

    
}
