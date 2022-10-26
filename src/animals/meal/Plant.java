package animals.meal;

public class Plant extends Meal{
    public Plant() {
        this.kind = "Растение";
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return getKind();
    }
}
