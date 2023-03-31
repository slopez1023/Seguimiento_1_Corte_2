enum Food{
    ICE_CREAM("The flavour is sweet"),LEMON("The flavour is acid"), STEAK("The flavour is salt");

    private String Flavour;

    private Food(String Flavour){
        this.Flavour = Flavour;
    }

    public String getFlavour() {
        return Flavour;
    }
}
public class example {
    public static void main(String[] args) {
        Food food = Food.ICE_CREAM;
        System.out.println(food.getFlavour());
    }
}
