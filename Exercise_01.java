package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      --1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
class enum1{
    public enum Colors{
        PURPLE,
        RED,
        GREEN
    }
}
class enum2{
    public enum Buildings{
        //Number of floors in a particular building
        HOUSE(2),
        RESTAURANT(1),
        UNIVERSITY(3),
        SKYSCRAPER(100);

        private final int floors;
        Buildings(int floors){
            this.floors = floors;
        }

        public int fCount(){
            return floors;
        }
    }
}


