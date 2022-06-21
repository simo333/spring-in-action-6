package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}