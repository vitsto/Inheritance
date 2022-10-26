package animals;

import utilits.Util;
import java.util.Objects;

public abstract class Bird extends Animal{
    protected String areal;

    public Bird(String name, int age, String areal) {
        super(name, age);
        this.areal = Util.isDefine(areal) ? areal : "undefined";
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = Util.isDefine(areal) ? areal : "undefined";
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public void eat() {
        System.out.println("Я ем птичью еду");
    }
    @Override
    public String toString() {
        return super.toString() + ", areal='" + getAreal() + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird mammal = (Bird) o;
        return Objects.equals(areal, mammal.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areal);
    }
}
