import java.util.List;
import java.util.jar.Attributes.Name;
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

        class User {
            String Name;
            int Age;
            String Biographie;

            public User(String name, int age, String bio) {
                this.Name = name;
                this.Age = age;
                this.Biographie = bio;
            }

            public void sayHello() {
                System.out.println("Bonjour, je suis " + Name + ", j'ai " + Age + " ans" + " et " + Biographie);
            }
        }

        User u1 = new User("Steeven", 21, "Je suis développeur");
        u1.sayHello();

        User u2 = new User("Chris", 30, "Je suis achitècte cloud chez AWS(Amazone Web Service)");
        u2.sayHello();

    }
}