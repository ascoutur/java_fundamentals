package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main(String[] args) {

        Engines myEngine = new Engines(400);
        Radio myRadio = new Radio("Yaesu FTA750L");
        Seats mySeats = new Seats(200);
        Airplane myAirplane = new Airplane(myEngine, myRadio, mySeats);

        System.out.println("I pilot an airplane with two " + myAirplane.engines.horsePower + " horsepower engines. "
         + "I use a handheld radio called the " + myAirplane.radio.brand + ", and I can carry about " + myAirplane.seats.count
         + " passengers.");

    }
}

class Engines{

    double horsePower;

    public Engines(double horsePower){

        this.horsePower = horsePower;

        //400hp per engine
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Radio{

    String brand;

    public Radio(String brand){

        this.brand = brand;

        //Yaesu FTA750L
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Seats{

    double count;

    public Seats(double count){

        this.count = count;

        //200 seats needed
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Airplane{

    Engines engines;

    Radio radio;

    Seats seats;

    double fuelCapacity;

    double currentFuelLevel;

    public Airplane(Engines engines, Radio radio, Seats seats){

        this.engines = engines;
        this.radio = radio;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}