package com.bridgelabz.mealplangenerator;

public class Meal<T extends MealPlan> {
    private T mealDetails;

    public Meal(T mealDetails) {
        this.mealDetails = mealDetails;
    }

    public T getMealDetails() {
        return mealDetails;
    }

    public void display() {
        mealDetails.displayMeal();
    }
}

