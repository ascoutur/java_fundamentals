package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main(String[] args) {
        
        Engines myEngines = new Engines();
        myEngines.setHorsePower(400);
        Radio myRadio = new Radio();
        myRadio.setBrand("Yaesu FTA750L");
        Seats mySeats = new Seats();
        mySeats.setCount(200);
        Airplane myAirplane = new Airplane(myEngines, myRadio, mySeats);

        System.out.println("I pilot an airplane with two " + myAirplane.myEngines.getHorsePower() + " horsepower engines. "
         + "I use a handheld radio called the " + myAirplane.myRadio.getBrand() + ", and I can carry about " + myAirplane.mySeats.getCount()
         + " passengers.");

    }

}

class Engines{

    private double horsePower;

    public double getHorsePower(){
        return horsePower;
    }
    public void setHorsePower(double hP){
        this.horsePower = hP;

    }

        //400hp per engine


    @Override
    public String toString() {
        return "Engine{" + "horsePower = " + horsePower + '}';
    }
}

class Radio{

    private String brand;

    public String getBrand(){
        return brand;
    }
     public void setBrand(String b){
        this.brand = b;
     }

        //Yaesu FTA750L


    @Override
    public String toString() {
        return "Radio{" + "brand = " + brand + "}";
    }
}

class Seats{

    private double count;

    public double getCount(){
        return count;
    }
    public void setCount(double cnt){
        this.count = cnt;
    }

        //200 seats needed

    @Override
    public String toString() {
        return "Seats{" + "count = " + count + "}";
    }
}

class Airplane {

    Engines myEngines;

    Radio myRadio;

    Seats mySeats;

    private double fuelCapacity;

    private double currentFuelLevel;

    public Airplane(Engines myEngines, Radio myRadio, Seats mySeats){
        this.myEngines = myEngines;
        this.myRadio = myRadio;
        this.mySeats = mySeats;
    }

    public double getFuelCapacity(){
       return fuelCapacity;
   }
   public void setFuelCapacity(double fc){
       this.fuelCapacity = fc;
   }
   public double getCurrentFuelLevel(){
       return fuelCapacity;
   }
   public void setCurrentFuelLevel(double cfl){
       this.currentFuelLevel = cfl;
   }

    @Override
    public String toString() {
        return "Airplane{" + "myEngine, myRadio, mySeats = " + myEngines + ", " +
                myRadio + ", " + mySeats + "}";
    }
}