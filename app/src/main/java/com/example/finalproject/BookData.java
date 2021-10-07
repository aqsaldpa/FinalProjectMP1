package com.example.finalproject;

import java.util.ArrayList;

public class BookData {
    private static String [] title = {
            "Catatan Juang",
            "5 CM",
            "Cara Dapat Panggilan Kerja",
            "1001 Jalan Bisnis Online ",
            "Kenali Agamamu ",
            "Kuliah Enggak Penting",
            "Tentang Kamu",
            "Kapal Van Der Wijck",
            "Laskar Pelangi",
            "Sebuah Seni Bodo Amat"
    };
    private static String[] category = {
            "Fiksi",
            "Adventure",
            "Tips & Trik",
            "Tips & Trik ",
            " Religi ",
            " Inspiratif ",
            " Romantis ",
            " Drama ",
            " Drama ",
            " Motivasi "
    };
    private static String[] deskripsi = {
            " ' Dan satu wajah itu muncul di malamku, diam di sela-sela berlian yang bertaburan di lautan angkasa ' ",
            " ' Dia mengajariku untuk menerima pemberianmu dengan rasa terimakasih '",
            " ' Semakin Anda bisa memandang sesuatu dari sudut pandang yang\n" +
                    "lebih luas (pikiran terbuka atau open minded) Anda akan menemukan kebenaran yang sesungguhnya. ' ",
            " ' Kemudahan informasi lewat internet yang kini berkembang ternyata bisa kita manfaatkan sebagai peluang usaha atau bisnis. " +
                    "Ya, bisnis online namanya'",
            " ' Maka dari itu sudah sepatutnya sebagai seorang muslim harus berusaha memahami Islam lebih dalam, mengenal Islam sebagai " +
                    "agama yang dianut nya dan yang diyakininya,agar tertanam sebuah akidah yang kokoh dalam beragama.'",
            " ' Saya menangkap nuansa demikian, karena hampir semua bagian dari buku ini mengungkapkan kegelisahan seorang anak muda," +
                    "anak bangsa yang menegaskan betapa penting arti sebuah pendidikan.' ",
            " ' Hati manusia persis seperti lautan, penuh misteri. Kita tidak pernah tahu kejadian menyakitkan apa yang telah dilewati seseorang.'",
            " ' Kata-kata yang lemah dan beradab dapat melembutkan hati dan manusia yang keras. '",
            " ' Bermimpilah, karena Tuhan akan memeluk mimpi-mimpi itu. '",
            " 'Untuk berbahagia, kita membutuhkan sesuatu untuk dipecahkan. Oleh karena itu, kebahagiaan adalah bentuk tindakan '"
    };
    private static int[] images = {
            R.drawable.catatan_juang,
            R.drawable.five_cm,
            R.drawable.sukses,
            R.drawable.jalan,
            R.drawable.kenali_agamamu,
            R.drawable.kuliah_penting,
            R.drawable.tentang_kamu,
            R.drawable.kapal_vanderwijck,
            R.drawable.laskar_pelangi,
            R.drawable.seni_bodoamat
    };
    private static String[] url = {
            "https://drive.google.com/file/d/1rshUBeDyo_WqWnP3ghEyKo9HYgHqZvW3/view",
            "https://drive.google.com/file/d/12SYCJZJh7aXUNo7_5DPLN9RRoVM8Ds6-/view",
            "https://drive.google.com/file/d/1do_ru9K15Y5H_Ed8VLYevSLttQQYFSeF/view",
            "https://drive.google.com/file/d/1_7TdMPv3yk8Q_WZDop-c9e7oCPIdnHuy/view",
            "https://drive.google.com/file/d/1R3r20J-3lB9oM_QG4JZYKgYUpRdf675u/view",
            "https://drive.google.com/file/d/1GeModQBmJSy_cnOqCgqSCfT6J7fyrWhf/view",
            "https://drive.google.com/file/d/1m7H4nCyVqZlNw9Jy323WV2p1KgHL-6FK/view",
            "https://drive.google.com/file/d/1DGFI4BzyRTI4iELnPUggyBivbnMX4jE4/view",
            "https://drive.google.com/file/d/18RfpAbCKy306tvwqJsB5Gz2r4LTlEWO4/view",
            "https://drive.google.com/file/d/1O0w1XIPxrcXSmNZKm4drXR8r7f2EXeWO/view"
    };

    public static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < images.length; position++) {
            Book book = new Book();
            book.setTitle(title[position]);
            book.setCategory(category[position]);
            book.setDeskripsi(deskripsi[position]);
            book.setImages(images[position]);
            book.setUrl(url[position]);
            list.add(book);
        }
        return list;
    }

}
