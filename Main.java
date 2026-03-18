import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Java marche!");

        System.out.println("--------- J'éssaye Java avec les liste et les boucles -----------");
        List<String> listeDeCourse = Arrays.asList("Pomme", "Carotte", "Pain");

        // System.out.println(listeDeCourse);

        for (String produit : listeDeCourse) {
            System.out.println(produit);
        }

        // une autre liste

        List<String> MaStack = new ArrayList<>(Arrays.asList("Symfony", "Javascript", "C#"));
        System.out.println("Ancienne liste");
        System.out.println(MaStack);

        List<String> OtherStacks = new ArrayList<>(Arrays.asList("bla", "bla", "bla", "ospvjpvs"));
        for (String other : OtherStacks) {

            MaStack.add(other);
            System.out.println("Ajout dynamique des autres stacks à la list MaStack, nouvelle liste");

            for (String item : MaStack) {
                System.out.println(item);
            }

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

        // ---------- user hub ----------

        List<String> UsersHub = new ArrayList<>(Arrays.asList("Paul", "Franc", "Marc", "François"));
        List<Integer> UsersAges = new ArrayList<>(Arrays.asList(20, 12, 30, 56));
        List<String> UsersDescriptions = new ArrayList<>(Arrays.asList("Je suis techicien de surface",
                "Administrateur Système et réseau", "DevOps chez Onepoint", "DevSecOps chez CapGemini"));

        System.out.println(UsersHub.size());

        for (int i = 0; i < UsersHub.size(); i++) {
            User user = new User(UsersHub.get(i), UsersAges.get(i), UsersDescriptions.get(i));
            user.sayHello();
        }

        /*
         * // -- Compte à rebours --
         * 
         * System.out.println("Le compte à rebours");
         * 
         * for (int c = 0; c < 10; c++) {
         * System.out.println(c);
         * }
         */
    }
}