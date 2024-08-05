public class Recipe {
    private String name;

    public Recipe(String name) {
        this.name = name;
    }

    public void getReady() {
        System.out.println("Getting the ingredients ready for " + name + "...");
    }

    public void doTheDish() {
        System.out.println("Cooking " + name + "...");
    }

    public void cleanup() {
        System.out.println("Cleaning up the kitchen after making " + name + "...");
    }
}

class MicroOven {
    public void cookRecipe(Recipe recipe) {
        recipe.getReady();
        recipe.doTheDish();
        recipe.cleanup();
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe("biryani");
        MicroOven oven = new MicroOven();
        oven.cookRecipe(recipe);
    }
}
