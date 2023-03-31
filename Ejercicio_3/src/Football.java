 enum Teams {
    REAL_MADRID,
     ARSENAL,
     LIVERPOOL,
     BAYERN,
     NAPOLI;
}
public class Football{
    public static void main(String[] args) {
        Teams arr[] = Teams.values();
        for (Teams teams : arr){
            System.out.println(teams + "at index" + teams.ordinal());
        }
    }
}
