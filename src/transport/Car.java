package transport;

import fuel.Fuel;
import utilits.Util;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;

    public class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = Util.isDefine(remoteEngineStart) ? remoteEngineStart : "default";
            this.keylessAccess = Util.isDefine(keylessAccess) ? keylessAccess : "default";
        }
    }

    public class Insurance {
        private final LocalDate duration;
        private final double cost;
        private final String serialNumber;

        public Insurance(LocalDate duration, double cost, String serialNumber) {
            this.duration = duration;
            this.cost = cost;
            this.serialNumber = Util.isValidSerialNumber(serialNumber) ? serialNumber : null;
        }


        public void checkDuration() {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Страховка просрочена. Оформите новую");
            }
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
        this.transmission = Util.isDefine(transmission) ? transmission : "автомат";
        this.bodyType = Util.isDefine(bodyType) ? bodyType : "седан";
        this.registrationNumber = Util.isValidRegistrationNumber(registrationNumber) ? registrationNumber : "x000xx000";
        this.numberOfSeats = numberOfSeats <= 0 ? 4 : numberOfSeats;
    }


    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    @Override
    public void refill(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + "]" + super.toString() + ", объем двигателя: " + getEngineVolume()
                + ", коробка передач: " + getTransmission()
                + ", тип кузова: " + getBodyType() + ", регистрационный номер: " + getRegistrationNumber()
                + ", количество мест: " + getNumberOfSeats() + ", резина: " + (isSummerTires() ? "летняя" : "зимняя");
    }
}
