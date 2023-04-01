import java.util.ArrayList;

public class ejemplo_8 {
        public static void main(String[] args) {
            java.util.List<String>al = new ArrayList<>();
            al.add("Nike");
            al.add("Adidas");
            al.add("Puma");

            boolean isPresent  =al.contains("Adidas");
            System.out.println("Is adidas present in the list " + isPresent);
        }
    }

