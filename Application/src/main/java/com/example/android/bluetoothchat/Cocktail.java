package com.example.android.bluetoothchat;

import java.util.List;
import java.util.Map;

/**
 * Created by oksana on 02.12.17.
 */

public class Cocktail {
    int i;
    Map<Ingredient, Integer> ingredients;
    public Cocktail(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }
    void addIngridient(Ingredient ingr, Integer quantity){
        this.ingredients.put(ingr, quantity);
    }
    void deleteIngr(Ingredient ingr){
        this.ingredients.remove(ingr);
    }
}
