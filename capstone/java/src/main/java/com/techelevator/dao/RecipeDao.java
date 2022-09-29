package com.techelevator.dao;

import com.techelevator.model.Recipe;

import java.security.Principal;
import java.util.List;

public interface RecipeDao {

    Recipe getRecipeByRecipeId(int id);

    List<Recipe> getAllRecipes();

    Recipe getRecipeByName(String name);

    List<Recipe> getAllSavedRecipesByUserId(int id);

    List<Recipe> getAllRecipesByCreatedBy(int createdBy);

    //getrecipebytag .. array of tags

    List<Recipe> getLatestRecipes();

    Recipe createObjectCalledRecipe(int recipeId);

    Recipe putARecipeIntoSavedRecipes( Principal principal, Recipe recipe, int user_id);

    Recipe deleteRecipeById(int recipeId);

}
