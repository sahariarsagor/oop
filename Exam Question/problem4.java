class myCar{
    private String model;
    private String brand;
    private int modelYear;
    private double price;
    private String color;

    public myCar(String model, String brand, int modelYear, double price, String color){
        this.model = model;
        this.brand = brand;
        this.modelYear = modelYear;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString(){
        return "model: " + model + ", brand: " + brand + ", modelYear: " + modelYear + ", price: " + price + ", color: " + color; 
    }
}

class carShowroom{
   private myCar[] cars;
   private int carCount;
   
   public carShowroom(int numberOfCars){
        cars = new myCar[numberOfCars];
        carCount = numberOfCars;
   }

   public void addCar(int index, myCar car){
        if(index < carCount){
            cars[index] = car;
        }
   }

   public void sellCar(){
        if(carCount > 0){
            carCount --;
            System.out.println("Car Sold ! Car remaining: " + carCount);
        } else{
            System.out.println("No more car available. ");
        }
   }

   public void showInventory(){
        System.out.println("Current Inventory of cars: ");
        for(int i = 0; i< carCount; i++){
            System.out.println(cars[i].toString());
        }
        System.out.println("Car remaining: " + carCount);
   }
}

public class problem4{
    public static void main(String[] args) {
        carShowroom showroom = new carShowroom(5);

        showroom.addCar(0, new myCar("model01", "toyota", 2020, 25000, "red"));
        showroom.addCar(1, new myCar("model02", "volvo", 2021, 25000, "green"));
        showroom.addCar(2, new myCar("model03", "hyundai", 2022, 25000, "yellow"));
        showroom.addCar(3, new myCar("model04", "rangerover", 2023, 25000, "blue"));
        showroom.addCar(4, new myCar("model05", "tesla", 2024, 25000, "orange"));

        showroom.sellCar();
        showroom.sellCar();
        showroom.sellCar();

        showroom.showInventory();
    }
}