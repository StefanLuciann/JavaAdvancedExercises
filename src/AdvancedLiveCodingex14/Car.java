package AdvancedLiveCodingex14;

public class Car {
        private String name;
        private String description;
        private CarType carType;

        public Car(String name, String description, CarType carType) {
            this.name = name;
            this.description = description;
            this.carType = carType;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", carType=" + carType +
                '}';
    }
}
