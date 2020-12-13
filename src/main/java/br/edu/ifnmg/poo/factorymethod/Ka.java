/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod;

/**
 * Classe Ka que implementa a interface Carro
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class Ka implements Carro {

    @Override
    public void exibirInformacao() {
        System.out.println("Fabricante: Ford");
        System.out.println("Ano de instalação: 1919");
    }
}
