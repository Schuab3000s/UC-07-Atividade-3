package atividade.pkg3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 1-Atividade de Resistência ou 2-Atividade de Velocidade");
        byte opc = scan.nextByte();

        Modelo modelo = null;
        switch (opc) {
            case 1:
                modelo = new FabricaResistencia();
                break;
            case 2:
                modelo = new FabricaVelocidade();
                break;
        }
        SugestaoAtividade sugestao = new SugestaoAtividade(modelo);
        sugestao.gerar();

        System.out.println("Corrida: " + sugestao.getCorrida().toString());
        System.out.println("Musculação: " + sugestao.getMusculacao().toString());
        
    }

}
