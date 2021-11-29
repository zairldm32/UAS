package com.example.uts;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.uts.model.Anjing;
import com.example.uts.model.Kucing;
import com.example.uts.model.Harimau;
import com.example.uts.model.Hewan;

public class DataProvider {
    private static List<Kucing> kucings = new ArrayList<>();
    private static List<Anjing> anjings = new ArrayList<>();
    private static List<Harimau> harimaus = new ArrayList<>();
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
   return kucings;
    }

    private static List<Anjing>initDataAnjing(Context ctx) {
       List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Harimau>initDataHarimau(Context ctx) {
        List<Harimau> harimaus = new ArrayList<>();
        harimaus.add(new Harimau("Siberian", "Rusia",
                "Harimau siberia adalah subspesies harimau terbesar di dunia.National Geographic menyebut bahwa panjang mereka bisa mencapai 3,2 meter dan berat 300 kg.", R.drawable.tiger_siberia));
        harimaus.add(new Harimau("Benggala", "India",
                "Subspesies harimau yang satu ini hidup di India.Menurut laman Tigers World,harimau India memiliki populasi terbesar di antara semua jenis harimau.", R.drawable.tiger_benggala));
        harimaus.add(new Harimau("Amoyensis", "China Selatan",
                "Harimau ini adalah subspesies harimau terkecil kedua di dunia.Mereka adalah salah satu jenis hewan yang paling terancam punah.", R.drawable.tiger_chinese));
        harimaus.add(new Harimau("Indochinese", "Asia Tenggara",
                "Harimau indocina adalah salah satu subspesies harimau yang habitatnya di Kamboja, Tiongkok, Laos, Burma, Thailand, dan Vietnam", R.drawable.tiger_indochinese));
        harimaus.add(new Harimau("Malayan", "Malaysia",
                "Harimau malaya adalah subspesies harimau yang dapat ditemui di bagian pantai timur Semenanjung Malaysia.Subspesies harimau ini kini terdapat 600-800 ekor", R.drawable.tiger_malayan));
        harimaus.add(new Harimau("Sumatran", "Indonesia",
                "Harimau sumatra merupakan endemik Pulau Sumatra. Mereka adalah subspesies terkecil di antara semua harimau dengan ukuran maksimal hanya 2,4 meter dan berat 120 kg.", R.drawable.tiger_sumatran));
        return harimaus;
    }
    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataHarimau(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}


