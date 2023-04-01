import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        class ejemplo_8 {
            class Brands{
                public static void main(String[] args) {
                    java.util.List<String>al = new ArrayList<>();
                    al.add("Nike");
                    al.add("Adidas");
                    al.add("Puma");

                    boolean isPresent  =al.contains("Adidas");
                    System.out.println("Is adidas present in the list " + isPresent);
                }
            }
        }
    }
}