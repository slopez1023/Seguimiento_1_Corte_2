enum Seasons{SPRING, SUMMER, FALL, WINTER;
private Seasons(){
    System.out.println("The season lasts 91 days: " + this.toString());
}
}
public class World {
    public static void main(String[] args) {
        Seasons seasons = Seasons.WINTER;
        System.out.println(seasons);
    }
}
