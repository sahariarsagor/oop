class Car {
    private String model;
    private String brand;
    private int modelYear;
    private double price;
    private String color;

    // Constructor to initialize car details
    public Car(String model, String brand, int modelYear, double price, String color) {
        this.model = model;
        this.brand = brand;
        this.modelYear = modelYear;
        this.price = price;
        this.color = color;
    }

    // Getter method to display car details
    @Override
    public String toString() {
        return "Model: " + model + ", Brand: " + brand + ", Model Year: " + modelYear +
               ", Price: $" + price + ", Color: " + color;
    }
}

class CarShowroom {
    private Car[] cars;      // Array to store cars
    private int carCount;    // Number of cars initially available

    // Constructor to initialize the car showroom with a specific number of cars
    public CarShowroom(int numberOfCars) {
        cars = new Car[numberOfCars];
        carCount = numberOfCars;
    }

    // Method to add a car to the showroom
    public void addCar(int index, Car car) {
        if (index < carCount) {
            cars[index] = car;
        }
    }

    // Method to sell a car from the showroom (reduce quantity)
    public void sellCar() {
        if (carCount > 0) {
            carCount--;
            System.out.println("Car sold! Cars remaining: " + carCount);
        } else {
            System.out.println("No more cars available to sell!");
        }
    }

    // Method to display the last updated information of all cars in the showroom
    public void showInventory() {
        System.out.println("Current Inventory of Cars:");
        for (int i = 0; i < carCount; i++) {
            System.out.println(cars[i].toString());
        }
        System.out.println("Total cars remaining: " + carCount);
    }
}

public class problem4 {
    public static void main(String[] args) {
        // Initialize the showroom with 6 cars
        CarShowroom showroom = new CarShowroom(6);

        // Add car details to the showroom
        showroom.addCar(0, new Car("Model S", "Tesla", 2022, 79999.99, "Red"));
        showroom.addCar(1, new Car("Mustang", "Ford", 2021, 55999.99, "Blue"));
        showroom.addCar(2, new Car("Civic", "Honda", 2020, 23999.99, "Black"));
        showroom.addCar(3, new Car("Camry", "Toyota", 2021, 27999.99, "White"));
        showroom.addCar(4, new Car("A4", "Audi", 2022, 42999.99, "Gray"));
        showroom.addCar(5, new Car("X5", "BMW", 2021, 60999.99, "Silver"));

        // Selling cars within the limit of available quantity
        showroom.sellCar();
        showroom.sellCar();
        showroom.sellCar();

        // Display the last updated inventory
        showroom.showInventory();
    }
}

