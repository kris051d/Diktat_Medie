package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("TV2 ØST mediehåndtering");

        Video video1 = new Video(17.3, "Kristoffer Hansen");

        Video video2 = new Video("Ged angriber Marc", "En ged går til angreb på Marc", LocalDate.now(), 17.3, "Kristoffer Hansen");

        Artikler artikler1 = new Artikler("En ged har begået mord", "Kristoffer Hansen");

        Billede billede1 = new Billede(74,42,"Kristoffer Hansen");

        Medie medie1 = new Medie("Hestelokkeren på Nordfalster", "Denne Historie hander om dyr", LocalDate.now());



        for (int i = 0; i < 50; i++) {
            Medie medie = new Medie();
        }

        Pause etMedieSomKanPauses;
        etMedieSomKanPauses = new Video();
        etMedieSomKanPauses = new Audio();

    }
}
