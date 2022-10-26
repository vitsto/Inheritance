package transport;

import fuel.Fuel;
import utilits.Util;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maxSpeed;
    protected Fuel fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = Util.isDefine(brand) ? brand : "undefined";
        this.model = Util.isDefine(model) ? model : "undefined";
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = Util.isDefine(color) ? color : "undefined";
        this.maxSpeed = Math.max(0, maxSpeed);
    }

    public void setBrand(String brand) {
        this.brand = Util.isDefine(brand) ? brand : "undefined";
    }

    public void setModel(String model) {
        this.model = Util.isDefine(model) ? model : "undefined";
    }

    public void setColor(String color) {
        this.color = Util.isDefine(color) ? color : "undefined";
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(0, maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void refill(Fuel fuel);

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel()
                + ", цвет: " + getColor() + ", год выпуска: " + getProductionYear()
                + ", страна выпуска: " + getProductionCountry() + ", заправлен: " + fuel;
    }
}
