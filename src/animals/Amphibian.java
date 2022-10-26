package animals;

import utilits.Util;

import java.util.Objects;

public class Amphibian extends Animal{
    protected String areal;

    public Amphibian(String name, int age, String areal) {
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
        System.out.println("Я что-то ем");
    }

    @Override
    public void go() {
        System.out.println("Я плыву");
    }

    @Override
    public String toString() {
        return super.toString() + ", areal='" + getAreal() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(areal, amphibian.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areal);
    }
}
