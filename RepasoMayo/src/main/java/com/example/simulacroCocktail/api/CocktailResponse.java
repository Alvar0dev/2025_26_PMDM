package com.example.simulacroCocktail.api;

import java.util.List;
import com.example.simulacroCocktail.models.Cocktail;
import com.google.gson.annotations.SerializedName;

public class CocktailResponse {
    
    @SerializedName("drinks")
    private List<Cocktail> drinks;

    public List<Cocktail> getListaCocktail() {
        return drinks;
    }

    public void setListaElementos(List<Cocktail> drinks) {
        this.drinks = drinks;
    }
}