/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod;

/**
 * Classe FabricaCarros que retorna um novo modelo que implementa carro
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class FabricaCarros {

    public Carro criarCarro(String modelo) {
        if (modelo.equals("palio")) {
            return new Palio();
        } else if (modelo.equals("celta")) {
            return new Celta();
        } else if (modelo.equals("gol")) {
            return new Gol();
        } else if (modelo.equals("civic")) {
            return new Civic();
        } else if (modelo.equals("ka")) {
            return new Ka();
        } else {
            return null;
        }
    }
}
