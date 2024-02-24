package teste_interface1;

import javax.swing.JOptionPane;

public class Teste_interface1 {

    public static void main(String[] args) {

        Double peso, altura, imc;
        String nome, mensagem="";

        JOptionPane.showMessageDialog(null, "Olá\nVamos calcular a melhor dieta para você!!");
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso(Kg):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua atura: "));

        imc = peso / (altura * altura);
        if (imc < 18.5) {
            mensagem = nome + " você está muito magro.\nPrecisa de uma dieta para engordar";
        } else if (imc < 24.9) {
            mensagem = nome + " você está com peso ideal.\nNão precisa de dieta";
        } else if (imc < 29.9) {
            mensagem = nome + " você está com sobrepeso.\nPrecisa de uma dieta para emagrecer";
        } else if (imc < 30) {
            mensagem = nome + " você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        } else {
            mensagem = nome + " você está com obesidade grave.\nPrecisa procurar um médico";
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }

}
