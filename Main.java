import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Java marche!");

        System.out.println("--------- J'éssaye Java avec les liste et les boucles -----------");
        List<String> listeDeCourse = Arrays.asList("Pomme", "Carotte", "Pain");

        // System.out.println(listeDeCourse);

        for (String produit : listeDeCourse) {
            System.out.println(produit);
        }

        System.out.println("-------- La boucle FOR -------");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}