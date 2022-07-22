package guru.springframework.controllers;

import guru.springframework.services.RecipeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeServiceImpl recipeService;

    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/","index","index.html"})
    public String getIndex(Model model){

        return "index";
    }

    @RequestMapping("/recipes")
    public String getRecipes(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }



}
