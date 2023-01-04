
package org.example;

public class Main {
    public static void main(String[] args) {

        //Criando um novo carro
        Carro carro = new Carro();

        /**
         * Atribuindo valores através  dos métodos
         *
         */
        carro.setAno(2000);
        carro.setCor("azul");
        carro.setMarca("fiat");
        carro.setModelo("uno");

        //Apresentando os valores armazenados, utiliando o método get
        System.out.println("Cor " +carro.getCor());
        System.out.println("Marca "+ carro.getMarca());
        System.out.println("Modelo " + carro.getModelo());
        System.out.println("Ano " + carro.getAno());

        //Criando um novo carro
        Carro carro2 = new Carro();

        /**
         * Atribuindo valores através  dos métodos
         *
         */
        carro2.setAno(2000);
        carro2.setCor("vermelho");
        carro2.setMarca("ford");
        carro2.setModelo("Ka");

        //Apresentando os valores armazenados, utiliando o método get
        System.out.println("Cor " +carro2.getCor());
        System.out.println("Marca "+ carro2.getMarca());
        System.out.println("Modelo " + carro2.getModelo());
        System.out.println("Ano " + carro2.getAno());

    }
}