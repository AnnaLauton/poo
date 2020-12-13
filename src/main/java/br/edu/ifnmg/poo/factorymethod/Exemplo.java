/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod;

/**
 * Classe responsável pelos testes
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class Exemplo {

    public static void main(String[] args) {

        FabricaCarros fabrica = new FabricaCarros();
        Carro carro = fabrica.criarCarro("gol");
        if (carro == null) {
            System.out.println("Carro nao cadastrado");
        } else {
            carro.exibirInformacao();
        }
    }
}
