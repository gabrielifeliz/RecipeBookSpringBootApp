package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/recipe_gallery")
    public String recipeGallery(){
        return "recipe_gallery";
    }

    @GetMapping("/crabcake_recipe")
    public String crabCakeRecipe(){
        return "crabcake_recipe";
    }

    @GetMapping("/wings_recipe")
    public String wingsRecipe(){
        return "wings_recipe";
    }

    @GetMapping("/gimbap_recipe")
    public String gimbapRecipe(){
        return "gimbap_recipe";
    }

    @GetMapping("/pumpkin_rice_noodles_recipe")
    public String pumpkinRiceNoodlesRecipe(){
        return "pumpkin_rice_noodles_recipe";
    }

    @GetMapping("/egg_sauce_recipe")
    public String eggSauceRecipe(){
        return "egg_sauce_recipe";
    }

    @GetMapping("/injera_recipe")
    public String injeraRecipe(){
        return "injera_recipe";
    }
}
