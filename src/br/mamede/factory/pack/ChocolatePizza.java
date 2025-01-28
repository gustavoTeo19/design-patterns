package br.mamede.factory.pack;

import java.util.List;

public class ChocolatePizza extends Pizza{
    protected ChocolatePizza(){
        this.ingredients = List.of(
                new Ingredient("Chocolate"),
                new Ingredient("Creme de leite"),
                new Ingredient("Raspas de Chocolate Meio Amargo")
        );
    }

}
