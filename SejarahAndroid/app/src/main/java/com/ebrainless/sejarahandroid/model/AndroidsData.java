package com.ebrainless.sejarahandroid.model;

import com.ebrainless.sejarahandroid.R;

import java.util.ArrayList;

public class AndroidsData {
    private static String[] androidNames = {
            "Android 1.1",
            "Android 1.5 (Cupcake)",
            "Android 1.6 (Donut)",
            "Android 2.0 - 2.1 (Eclair)",
            "Android 2.2.3 (Froyo)",
            "Android 2.3 - 2.3.7 (GingerBread)",
            "Android 3.0 - 3.2.6 (Honeycomb)",
            "Android 4.0 - 4.0.4 (Ice Cream Sandwich)",
            "Android 4.1 - 4.3.1 (Jelly Bean)",
            "Android 4.4 (Kitkat)"
    };

    private static String[] androidHistories = {
            "Pertama kali platform Android diluncurkan pada tahun 2009, setahun sebelumnya Google telah merilis versi beta yang diperkenalkan kepada khalayak ramai. Android versi pertama dikenal dengan Android 1.1. Fitur-fitur android 1.1 Mampu menyimpan attachment dalam pesan, waktu default screen in-call lebih lama bila menggunakan speakerphone plus kemampuan untuk menampilkan atau menyembunyikan dialpad.",
            "Pada tanggal 27 April 2009 Google juga merilis Android versi Cupcake. Cupcake adalah versi Android yang memulai tradisi penamaan kue untuk rilis Android. Ini dapat menambahkan beberapa fitur dan peningkatan baru dibanding versi sebelumnya. Fitur-fitur baru yang dimilikinya adalah dukungan untuk tampilan aplikasi widget-miniatur yang bisa disematkan di aplikasi lain seperti home screen dan menerima update berkala dan rekaman video ditambahkan ke kamera bersamaan dengan kemampuan untuk langsung mengupload video ke YouTube.",
            "Google merilis Android 1.6 Donut pada bulan September tahun 2009. Penambahan fitur terbesar adalah dukungan untuk CDMA yang memperluas pasar pengguna baru ke Android. Berikut adalah fitur yang dimilikinya: Navigasi Google Maps ditambahkan bersamaan dengan dukungan navigasi satelit.\n" +
                    "Donut menyertakan fitur gallery untuk memperlancara penangkapan media\n" +
                    "Pengenalan Search Box\n" +
                    "Toggling cepat antara kamera",
            "Pada bulan Oktober 2009, sekitar setahun setelah peluncuran Android 1.0, Google merilis versi 2.0 dari OS, dengan nama Android Eclair. Versi ini adalah pertama yang menambahkan dukungan Text-to-Speech. Berikut adalah fitur yang menyertainya. Dukungan multi-touch ditambahkan ke Android.\n" +
                    "Dukungan untuk mencari di dalam pesan teks.\n" +
                    "Eclair membawa kotak masuk terpadu ke Android. Dukungan untuk beberapa akun Google telah ditambahkan.",
            "Android versi terbaru kembali dirilis pada 20 Mei 2010. Google menamainya dengan Froyo. Nama Froyo ini diambil dari singkatan frozen yogurt. Smartphone pertama yang membawa merek Google Nexus, Nexus One, dirilis dengan Android 2.1 dari kotak pada awal tahun 2010, namun dengan cepat menerima update over-the-air ke Froyo akhir tahun. Pada android versi ini mulai dilengkapi dengan fitur friendly user seperti opsi untuk mematikan akses data pada jaringan seluler. Berikut adalah fitur yang menyertainya: Hotspot WiFi portabel untuk berbagi koneksi 3G perangkat dengan gadget lainnya.\n" +
                    "Setelan bergabung dengan kontak dan email untuk memback up ke server Google yang memungkinkan pemnbaca mengembalikan segalanya secara otomatis ke perangkat baru.\n" +
                    "flash telepon juga bisa digunakan dalam video.",
            "Gingerbread dirilis pada tahun 2010 . Pada 13 September 2017, Google menunjukkan bahwa hanya 0,6 persen dari semua perangkat Android yang saat ini menjalankan beberapa versi Gingerbread. Fitur utama termasuk dukungan NFC, SIP untuk panggilan Internet. Berikut adalah fitur yang menyertainya. UI overhaul untuk menghindari screen burn-in dan meningkatkan daya tahan baterai.\n" +
                    "Dukungan kamera menghadap depan untuk panggilan video.\n" +
                    "Download manager untuk mengawasi download Pembaca.\n" +
                    "Peningkatan pada keyboard layar dengan cara pintas dan kursor untuk membantu copy paste.",
            "Honeycomb diluncurkan pada bulan Mei 2011 pada dasarnya untuk memperluas Android untuk mendukung layar tablet. Versi Android ini paling diabaikan dari semua. Karena dirilis khusus untuk tablet dan tidak pernah sampai ke ponsel. Berikut adalah fitur yang menyertainya: Beberapa perbaikan UI memanfaatkan layar besar.\n" +
                    "Tombol perangkat keras dijatuhkan untuk mendukung tombol di layar.\n" +
                    "Browser web mengenalkan tabbed browsing.\n" +
                    "Widget yang lebih besar.\n" +
                    "Aplikasi seperti Gmail dan YouTube dirancang ulang untuk menggunakan layar besar.",
            "Android Ice Cream Sandwich dirilis pada bulan Oktober 2011, versi Android Ice Cream Sandwich menghadirkan sejumlah fitur baru bagi pengguna. Ini menggabungkan banyak fitur versi Honeycomb tablet saja dengan smartphone yang berorientasi pada Gingerbread. Berikut ini adalah fiturnya. Desain ulang terbesar ke Android dengan tema Holo.\n" +
                    "Pengalaman browsing lebih cepat.\n" +
                    "Ruang penyimpanan multi untuk aplikasi.\n" +
                    "Pengenalan wajah untuk membuka kunci telepon",
            "Jellybean dimulai pada bulan Juni 2012 dengan merilis Android 4.1. Google dengan cepat merilis versi 4.2 dan 4.3, keduanya berada di bawah label Jelly Bean, masing-masing pada bulan Oktober 2012 dan Juli 2013. Berikut adalah fitur yang menyertainya : Google Now, tool bantu yang menampilkan informasi yang relevan berdasarkan riwayat pencarian.\n" +
                    "Project Butter untuk mendukung frame rate yang lebih tinggi saat menggesek menu dan layar rumah.\n" +
                    "Mampu melihat foto dengan menggesek dari kamera untuk menuju ke filmstrip.\n" +
                    "Widget menyetel ulang diri mereka untuk menambahkan yang baru.\n" +
                    "Pemberitahuan fitur yang lebih banyak\n" +
                    "Fitur gerak dan aksesibilitas baru.",
            "Android KitKat dirilis pada November 2013 ,Android 4.4 adalah satu-satunya versi OS yang benar-benar menggunakan nama sepotong permen.dan menjadi salah satu versi Android yang paling disukai oleh pengguna Smartphone di dunia. KitKat memiliki fitur yang istimewa dari OS Android sebelumnya. Berikut adalah fitur yang menyertainya: Immersive mode untuk konsumsi konten yang lebih baik.\n" +
                    "Bar navigasi yang lebih baik untuk masuk dan keluar dari mode Immersive.\n" +
                    "Dukungan widget layar kunci.\n" +
                    "Dialer baru dengan fitur Caller ID.\n" +
                    "Wallpaper layar penuh.\n" +
                    "Emoji keyboard untuk emoticon.\n" +
                    "Aplikasi Hangouts dan perpesanan terpadu\n" +
                    "Dukungan cloud print yang lebih baik.\n" +
                    "Integrasi Google Now yang lebih cerdas dan handsfree."
    };

    private static int[] androidsImages = {
            R.drawable.pertama,
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecreamsandwich,
            R.drawable.jellybean,
            R.drawable.kitkat
    };

    public static ArrayList<Androids> getListData() {
        ArrayList<Androids> list = new ArrayList<>();
        for (int position = 0; position < androidNames.length; position++) {
            Androids androids = new Androids();
            androids.setName(androidNames[position]);
            androids.setHistory(androidHistories[position]);
            androids.setPhoto(androidsImages[position]);
            list.add(androids);
        }
        return list;
    }
}
