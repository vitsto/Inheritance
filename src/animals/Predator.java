package animals;

import animals.meal.Meal;
import animals.meal.Meat;

import java.util.Objects;

public class Predator extends Mammal {
    private Meal meal;

    public Predator(String name, int age, String areal, double speed, Meal meal) {
        super(name, age, areal, speed);
        setMeal(meal);
    }

    public void setMeal(Meal meal) {
        if (isSuitableFood(meal)) {
            this.meal = meal;
        } else {
            System.out.println("Я не ем: " + meal + ". Жду другую еду");
        }
    }

    public Meal getMeal() {
        return meal;
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    public boolean isSuitableFood(Meal meal) {
        return meal instanceof Meat;
    }

    @Override
    public void eat() {
        if (meal != null) {
            System.out.println("я кушаю " + meal + "...чавк чавк чавк");
        } else {
            System.out.println("я голодный...дай еду");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", meal='" + getMeal() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator that = (Predator) o;
        return Objects.equals(meal, that.meal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meal);
    }
}
