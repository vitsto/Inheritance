package animals;

import java.util.Objects;

public class FlyingBird extends Bird{
    private  MovementType movementType;

    public FlyingBird(String name, int age, String areal, MovementType movementType) {
        super(name, age, areal);
        this.movementType = movementType;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void go() {
        System.out.println("Хожу по земле");
    }

    @Override
    public String toString() {
        return super.toString() + ", тип перемещения='" + getMovementType() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return movementType == that.movementType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
