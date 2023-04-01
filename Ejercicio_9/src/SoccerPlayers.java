import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SoccerPlayers {
    public static void main(String[] args) {
        java.util.List<String>lsp = new ArrayList<>(Arrays.asList("Cristiano Ronaldo","Portugues", "Al Nassr"));
        for (int i =0; i< lsp.size();i++){
            System.out.println(lsp.get(i) + "-----");
        }
        System.out.println();

        for (String string : lsp){
            System.out.println(string);
            Iterator<String> iterator = lsp.iterator();
            while (iterator.hasNext()){
                String elemento = iterator.next();
                System.out.println(elemento + "-----");
            }
        }
    }
}
