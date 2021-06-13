package KFC;

public class MealBuilder {
    protected Meal meal;

    public void buildFood(){
    	meal.getFood();
    }

    public void buildDrink(){
    	meal.getDrink();
    }

    public Meal getMeal(){
        return this.meal;
    }

}
