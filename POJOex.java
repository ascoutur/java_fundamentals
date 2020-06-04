package labs_examples.objects_classes_methods.labs.objects;

public class POJOex {
    public static void main(String[] args) {
        Shoes s = new Shoes("Nikes");
        Man m = new Man("Austin");
        System.out.println(m.name + " prefers to wear " + s.brand);
    }

}

