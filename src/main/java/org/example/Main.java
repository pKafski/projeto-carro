
package org.example;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setAno(2000);
        carro.setCor("azul");
        carro.setMarca("fiat");
        carro.setModelo("uno");
        System.out.println("Cor " +carro.getCor());
        System.out.println("Marca "+ carro.getMarca());
        System.out.println("Modelo " + carro.getModelo());
        System.out.println("Ano " + carro.getAno());

    }
}