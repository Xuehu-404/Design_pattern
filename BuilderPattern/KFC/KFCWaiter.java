package KFC;

public class KFCWaiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mb){
    	this.mealBuilder = mb;
    }

    public Meal construct(){
    	mealBuilder.buildDrink();
    	mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }

}
