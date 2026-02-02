package Basics;

public class DataTypeDemo {
    public static void main(String[] args) {

        // -------- Primitive Data Types --------
        int age = 22;
        float price = 99.9f;
        double salary = 45000.75;
        char grade = 'A';
        boolean isPassed = true;
        byte b = 100;
        short s = 2000;
        long population = 9000000000L;

        System.out.println("Primitive Data Types:");
        System.out.println(age);
        System.out.println(price);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isPassed);
        System.out.println(b);
        System.out.println(s);
        System.out.println(population);

        // -------- Non-Primitive Data Types --------
        String name = "Hemanth";
        int[] numbers = {1, 2, 3, 4};

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
    }
}

