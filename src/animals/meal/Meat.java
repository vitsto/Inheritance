package animals.meal;

public class Meat extends Meal{
    public Meat() {
        this.kind = "Мясо";
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
