package com.kel15.soloheritage;

import java.util.ArrayList;
import java.util.List;

public class DataHeritage {

    public static List<Heritage> getDummyHeritageList() {
        List<Heritage> heritageList = new ArrayList<>();

        heritageList.add(new Heritage("Museum Lokananta", "Museum Lokananta adalah sebuah studio rekaman yang bersejarah di Indonesia. ", R.drawable.lokananta, -7.2754, 112.7688));
        heritageList.add(new Heritage("Museum XYZ", "Museum XYZ adalah museum seni yang menampilkan karya seniman lokal dan internasional.", R.drawable.menu2, -6.2088, 106.8456));
        heritageList.add(new Heritage("Museum ABC", "Museum ABC adalah museum sejarah yang menyimpan artefak bersejarah.", R.drawable.menu3, -6.9175, 107.6191));
        heritageList.add(new Heritage("Museum DEF", "Museum DEF adalah museum alam yang menampilkan kekayaan flora dan fauna.", R.drawable.menu4, -8.4095, 115.1889));
        heritageList.add(new Heritage("Museum GHI", "Museum GHI adalah museum teknologi dengan koleksi inovatif.", R.drawable.menu2, -7.8031, 110.3398));
        return heritageList;
    }

    public static List<Heritage> getMuseumList() {
        List<Heritage> museumList = new ArrayList<>();
        museumList.add(new Heritage("Museum Lokananta", "Museum Lokananta adalah sebuah studio rekaman yang bersejarah di Indonesia. Didirikan pada tahun 1956, Lokananta merupakan studio rekaman " +
                "pertama di Indonesia dan menjadi tonggak penting dalam sejarah perkembangan industri musik di Nusantara. " +
                "Studio rekaman ini terletak di Jl. Ahmad Yani no. 379, Kerten, Laweyan, Solo.", R.drawable.lokananta, -7.557465842318016, 110.79556075520473));
        museumList.add(new Heritage("Museum Tumurun", "Museum Tumurun adalah sebuah museum pribadi yang terletak di tengah kota Surakarta, Jawa Tengah. Museum ini memiliki koleksi karya seni yang beragam " +
                "mulai dari maestro berpengalaman hingga seniman muda pemula. Beberapa karya seni yang dipajang di museum ini antara lain lukisan, patung, dan keramik.", R.drawable.tumurun, -7.5702575979223825, 110.81647592532923));
        museumList.add(new Heritage("Museum Keris", "Museum Keris Nusantara memiliki koleksi keris sebanyak 409 buah dari berbagai jenis dan ukuran, serta 38 tombak dan benda-benda pusaka bersejarah lainnya. " +
                "Selain itu, museum ini juga dilengkapi dengan video visual mengenai perjalanan keris di Indonesia dan ruangan sebagai pusat pembelajaran keris bagi pengunjung.", R.drawable.keris, -7.56880784993706 , 110.8107756081287));
        museumList.add(new Heritage("Museum Radya Pustaka", "Museum ini memiliki koleksi yang terdiri dari berbagai macam arca, pusaka adat, wayang kulit, dan buku-buku kuno.", R.drawable.radyapustaka, -7.568511149783672, 110.8144027234743));
        museumList.add(new Heritage("Museum Batik Danar Hadi", "Museum Batik Danar Hadi adalah sebuah museum yang terletak di Jl. Slamet Riyadi No. 261, Laweyan, Solo. Museum ini memiliki koleksi batik yang sangat beragam, " +
                "mulai dari batik kuno hingga batik modern. Selain itu, museum ini juga memiliki koleksi tekstil lainnya seperti kain songket, kain lurik, dan kain tenun.", R.drawable.danarhadi, -7.568442625408151, 110.81644668300208));
        museumList.add(new Heritage("Museum Keraton Kasunanan Surakarta", " Museum Keraton Kasunanan Surakarta adalah sebuah museum khusus yang mengoleksi benda-benda budaya peninggalan Karaton Paku Buwono Solo. " +
                "Museum ini terbagi menjadi dua bangunan utama di bagian barat dan timur. Kedua bangunan memiliki ruangan-ruangan yang memuat hasil kriya Keraton Surakarta.", R.drawable.keraton, -7.577690330210225, 110.82878217929243));

        return museumList;
    }

    public static List<Heritage> getCulturalHeritageList() {
        List<Heritage> culturalHeritageList = new ArrayList<>();

        culturalHeritageList.add(new Heritage("Taman Sriwedari", "Taman Sriwedari adalah sebuah kompleks taman yang terletak di Kecamatan Laweyan, Kota Surakarta. " +
                "Sejak era Pakubuwana X, Taman Sriwedari menjadi tempat diselenggarakannya tradisi hiburan Malam Selikuran. Sriwedari juga pernah menjadi lokasi penyelenggaraan PON I pada tahun 1948.", R.drawable.sriwedari, -7.568373655809427, 110.81296320831082));
        culturalHeritageList.add(new Heritage("Kepatihan Mangkunegaran", "Kepatihan Mangkunegaran adalah istana tempat kediaman para raja atau adipati Mangkunegaran. Istana ini dibangun oleh Raden Mas Said atau Pangeran Sambernyawa, pendiri Mangkunegaran " +
                "yang bergelar Kanjeng Gusti Pangeran Adipati Arya (KGPAA) Mangkunegara I.", R.drawable.mangkunegaran, -7.565377512726155, 110.81749010831086));
        culturalHeritageList.add(new Heritage("Tugu Kebangkitan Nasional (Tugu Lilin)", "Tugu ini dibangun pada tahun 1933 dengan tujuan untuk memperingati 25 tahun lahirnya hari kebangkitan nasional. Tugu Lilin memiliki bentuk yang mirip seperti lilin " +
                "dengan api yang menyala di bagian puncaknya..", R.drawable.tugulilin, -7.568583450975907, 110.80560735063968));
        culturalHeritageList.add(new Heritage("Loji Gandrung", " Loji Gandrung adalah sebuah rumah dinas Wali Kota Solo, bangunan ini memiliki sejarah yang panjang dan keterikatan khusus dengan Presiden Republik Indonesia yang pertama, Soekarno. " +
                "Loji Gandrung sendiri sudah berusia lebih dari 100 tahun dan merupakan salah satu cagar budaya di Indonesia", R.drawable.lojigandrung, -7.566880861357047, 110.80957959666621));
        culturalHeritageList.add(new Heritage("Masjid Laweyan", "Masjid ini sudah ada sebelum Masjid Agung Surakarta. Masjid ini dibangun pada tahun 1546 pada masa Sultan Hadiwijaya, salah satu sultan Kesultanan Pajang, yang merupakan cikal bakal " +
                "dari Kasunanan Surakarta dan Kasultanan Yogyakarta. Menurut sejarah lisan, Masjid Laweyan dianggap sebagai masjid tertua di Surakarta dan berdiri pada tahun 1546", R.drawable.masjidlaweyan, -7.571197921764783, 110.79257853714633));
        culturalHeritageList.add(new Heritage("Gedung RRI Surakarta", "DGedung RRI Surakarta dibangun pada tahun 1935 oleh Kantor Teknik Tee Bing Koen dari Yogyakarta. Gedung RRI Surakarta sampai saat ini masih difungsikan sebagai tempat penyiaran dan dalam kondisi " +
                "yang baik dan terawat.", R.drawable.rri, -7.558623066652876, 110.8218118083105));

        return culturalHeritageList;
    }

}
