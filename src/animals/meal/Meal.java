package animals.meal;

import java.util.Objects;

public abstract class Meal {
    String kind;

    public abstract String getKind();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(kind, meal.kind);
    }
}
