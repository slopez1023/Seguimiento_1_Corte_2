package ejemplo2;

class Example1 {
    public enum Colors {RED, BLUE, YELLOW, GREEN}

    public static void main(String[] args) {
        for (Colors colors : Colors.values()){
            System.out.println(colors);
        }
        System.out.println("Value of RED is: " + Colors.valueOf("RED"));

    }
}
