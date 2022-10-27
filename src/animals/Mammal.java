package animals;

import utilits.Util;

import java.util.Objects;

public abstract class Mammal extends Animal {
    protected String areal;
    protected double speed;

    public Mammal(String name, int age, String areal, double speed) {
        super(name, age);
        this.areal = Util.isDefine(areal) ? areal : "undefined";
        this.speed = Math.max(speed, 1);
    }

    public String getAreal() {
        return areal;
    }

    public double getSpeed() {
        return speed;
    }

    public void setAreal(String areal) {
        this.areal = Util.isDefine(areal) ? areal : "undefined";
    }

    public void setSpeed(double speed) {
        this.speed = Math.max(speed, 1);
    }


    public void walk() {
        System.out.println("Я просто так гуляю...");
    }

    @Override
    public void go() {
        System.out.println("Хожу по земле");
    }

    @Override
    public String toString() {
        return super.toString() + ", areal='" + getAreal() + '\'' +
                ", speed=" + getSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.speed, speed) == 0 && Objects.equals(areal, mammal.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areal, speed);
    }
}
