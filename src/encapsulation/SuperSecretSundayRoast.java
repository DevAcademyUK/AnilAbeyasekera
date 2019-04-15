package encapsulation;

import java.util.ArrayList;
class SuperSecretSundayRoast {

    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    private ArrayList<String> guestList = new ArrayList<String>();


    public void addIngredient(Ingredient i){
        if(guestList.contains(i.ingredientName)){
        this.ingredients.add(i);
    }
        else {
            System.out.println("Exterminate!");
        }
    }

    public ArrayList<Ingredient> getIngredients(String password){
        if(password.equals("strongpassword123")){
            return this.ingredients;
        }
        else
            return null;

    }


}
