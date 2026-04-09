import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("==================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nBogies Sorted by Capacity:");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}