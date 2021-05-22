package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Ksiaz Wielki");
        lista.add("Rzedowice");
        lista.add("Antolka ");
        lista.add("Mianocice");
        lista.add("Miechow");

        System.out.println();

        for( String e : lista )
        {
            System.out.println( e );
        }


        System.out.println();

        Collections.sort(lista);

        for( String e : lista )
        {
            System.out.println( e );
        }

        System.out.println();

        System.out.println(Collections.max(lista));

        System.out.println();

        Collections.reverse(lista);
        for( String e : lista )
        {
            System.out.println( e );
        }

        System.out.println();

        Collections.shuffle(lista);

        for( String e : lista )
        {
            System.out.println( e );
        }

        List<Animal> koty = new ArrayList<>();

        Animal kot1  = new Animal("burek");
        Animal kot2  = new Animal("bialy");
        Animal kot3  = new Animal("czarny");
        Animal kot4  = new Animal("burek");
        kot4.wiek = 10 ;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);

        System.out.println("________");
        for( Animal kot : koty )
        {
            System.out.println( kot.name + " " + kot.wiek + " lat. " );
        }

        Collections.sort(koty);

        System.out.println("________");
        for( Animal kot : koty )
        {
            System.out.println( kot.name + " " + kot.wiek + " lat. " );
        }



    }
}
