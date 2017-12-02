package com.example.android.bluetoothchat;

/**
 * Created by oksana on 02.12.17.
 */

interface Storage {

    void addCocktail(Cocktail cocktail);
    void deleteCocktail(Cocktail cocktail);
    void getCocktail(Cocktail cocktail);
}
