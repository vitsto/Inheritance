package animals;

import utilits.Util;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = Util.isDefine(name) ? name : "undefined";
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public void sleep() {
        System.out.println("Zzz..");
    }

    public abstract void eat();

    public abstract void go();

    @Override
    public String toString() {
        return "Animal: {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }
}
