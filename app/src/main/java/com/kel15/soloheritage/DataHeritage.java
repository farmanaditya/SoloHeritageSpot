package com.kel15.soloheritage;

import java.util.ArrayList;
import java.util.List;

public class DataHeritage {

    public static List<Heritage> getDummyHeritageList() {
        List<Heritage> heritageList = new ArrayList<>();

        heritageList.add(new Heritage("Museum Lokananta", "Museum Lokananta adalah sebuah studio rekaman yang bersejarah di Indonesia.", R.drawable.menu1, -7.2754, 112.7688));
        heritageList.add(new Heritage("Museum XYZ", "Museum XYZ adalah museum seni yang menampilkan karya seniman lokal dan internasional.", R.drawable.menu2, -6.2088, 106.8456));
        heritageList.add(new Heritage("Museum ABC", "Museum ABC adalah museum sejarah yang menyimpan artefak bersejarah.", R.drawable.menu3, -6.9175, 107.6191));
        heritageList.add(new Heritage("Museum DEF", "Museum DEF adalah museum alam yang menampilkan kekayaan flora dan fauna.", R.drawable.menu4, -8.4095, 115.1889));
        heritageList.add(new Heritage("Museum GHI", "Museum GHI adalah museum teknologi dengan koleksi inovatif.", R.drawable.menu2, -7.8031, 110.3398));
        return heritageList;
    }

    public static List<Heritage> getMuseumList() {
        List<Heritage> museumList = new ArrayList<>();

        museumList.add(new Heritage("Museum Lokananta", "Museum Lokananta adalah sebuah studio rekaman yang bersejarah di Indonesia.", R.drawable.menu1, -7.2754, 112.7688));
        museumList.add(new Heritage("Museum XYZ", "Museum XYZ adalah museum seni yang menampilkan karya seniman lokal dan internasional.", R.drawable.menu2, -6.2088, 106.8456));
        museumList.add(new Heritage("Museum ABC", "Museum ABC adalah museum sejarah yang menyimpan artefak bersejarah.", R.drawable.menu3, -6.9175, 107.6191));
        museumList.add(new Heritage("Museum DEF", "Museum DEF adalah museum alam yang menampilkan kekayaan flora dan fauna.", R.drawable.menu4, -8.4095, 115.1889));

        return museumList;
    }

    public static List<Heritage> getCulturalHeritageList() {
        List<Heritage> culturalHeritageList = new ArrayList<>();

        culturalHeritageList.add(new Heritage("Cagar Budaya 1", "Deskripsi Cagar Budaya 1.", R.drawable.menu1, -7.8031, 110.3398));
        culturalHeritageList.add(new Heritage("Cagar Budaya 2", "Deskripsi Cagar Budaya 2.", R.drawable.menu2, -6.2088, 106.8456));
        culturalHeritageList.add(new Heritage("Cagar Budaya 3", "Deskripsi Cagar Budaya 3.", R.drawable.menu3, -6.9175, 107.6191));
        culturalHeritageList.add(new Heritage("Cagar Budaya 4", "Deskripsi Cagar Budaya 4.", R.drawable.menu4, -8.4095, 115.1889));

        return culturalHeritageList;
    }

}
