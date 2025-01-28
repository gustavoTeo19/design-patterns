package br.mamede.factory;

import br.mamede.factory.pack.PizzaFactory;

public class Factory {
    //No padrão Factory nós criamos objetos sem expor a lógica de programação
    //e os objetos recem criados utilizam uma interface em comum
    public static void main(String[] args) {
        var pizza = PizzaFactory.getInstance(true);
        var pizza2 = PizzaFactory.getInstance(false);

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
