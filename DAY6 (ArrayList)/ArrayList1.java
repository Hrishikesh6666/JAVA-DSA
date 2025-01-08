import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        // ADDING ELEMENTS
        name.add("Hrishikesh");
        name.add("ShivLal");
        name.add("Mahesh");
        name.add("Sourabh");
        name.add("Aviraj");

        System.out.println(name);

        name.add(2,"Prasad");
        System.out.println(name);

        name.set(1,"Pranav");
        System.out.println(name);
        System.out.println(name.get(0));

        System.out.println("Size of Array :"+name.size());

        name.remove(4);
        System.out.println("Remove element :"+name);
        System.out.println("Size of Array :"+name.size());

        name.clear();
        System.out.println(name);

    }
}
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//
//        // Adding elements
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");
//
//        System.out.println("ArrayList: " + names);
//
//        // Accessing elements
//        System.out.println("Element at index 1: " + names.get(1));
//
//        // Updating an element
//        names.set(1, "Robert");
//        System.out.println("Updated ArrayList: " + names);
//
//        // Removing an element
//        names.remove(0);
//        System.out.println("After Removal: " + names);
//
//        // Size of ArrayList
//        System.out.println("Size of ArrayList: " + names.size());
//    }
//}
