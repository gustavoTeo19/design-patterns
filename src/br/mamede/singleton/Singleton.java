package br.mamede.singleton;

import br.mamede.singleton.pack.ConfigurationApi;

public class Singleton {

    //garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto
    public static void main(String[] args) {
        var configuration = ConfigurationApi.getInstance();
        var configuration2 = ConfigurationApi.getInstance();
        System.out.println(configuration);
        System.out.println(configuration2);
    }
}
