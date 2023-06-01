package com.example.modul2new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val babyList = listOf(
            Baby(
                R.drawable.h,
                nameBaby = "Harimau",
                descBaby = "Harimau adalah salah satu jenis kucing besar yang dapat ditemukan di Asia, terutama di wilayah India, Indonesia, dan sekitarnya. Mereka memiliki bulu berwarna coklat atau oranye dengan corak garis-garis hitam yang khas, dan memiliki tubuh yang besar, kuat, dan lincah. Harimau adalah predator puncak di hutan dan terutama memakan hewan seperti rusa, babi hutan, dan sapi liar. "
            ),
            Baby(
                R.drawable.buaya,
                nameBaby = "Buaya",
                descBaby = "Buaya adalah reptil yang biasa ditemukan di perairan tawar atau payau di berbagai belahan dunia, termasuk di Amerika, Afrika, dan Asia. Mereka memiliki tubuh besar, lebar, dan berduri, serta memiliki moncong yang panjang dan tajam dengan gigi yang tajam. "
            ),
            Baby(
                R.drawable.burung_elang,
                nameBaby = "Burung Elang",
                descBaby = "Elang adalah burung pemangsa besar yang tersebar luas di seluruh dunia. Mereka memiliki sayap yang lebar dan kuat, dengan bulu berwarna coklat atau hitam, dan paruh yang besar dan tajam. Elang terkenal karena kemampuannya yang luar biasa dalam terbang, termasuk terbang tinggi dan jauh dengan kecepatan tinggi. Mereka juga memiliki penglihatan tajam yang memungkinkan mereka untuk melihat mangsa dari jarak jauh. Mangsa elang terutama adalah mamalia seperti kelinci, tupai, dan bahkan rusa kecil."
            ),
            Baby(
                R.drawable.burung_hantu,
                nameBaby = "Burung Hantu",
                descBaby = "Burung hantu adalah jenis burung malam yang biasa ditemukan di berbagai belahan dunia. Mereka memiliki bentuk tubuh yang khas dengan kepala besar, mata besar dan tajam, serta sayap lebar dan bulu yang lembut. Burung hantu memiliki kemampuan untuk terbang dengan sangat tenang dan mengintai mangsa mereka dengan ketajaman penglihatan yang luar biasa."
            ),
            Baby(
                R.drawable.kelinci,
                nameBaby = "Kelinci",
                descBaby = "Kelinci adalah hewan mamalia kecil yang biasanya ditemukan di banyak belahan dunia. Mereka memiliki tubuh yang kecil dan bulu yang lembut dengan berbagai warna dan pola. Kelinci biasanya tinggal di hutan, padang rumput, dan lingkungan yang terbuka lainnya. Mereka biasanya adalah hewan herbivora dan memakan rumput, daun, dan tanaman lainnya."
            ),
            Baby(
                R.drawable.landak,
                nameBaby = "Landak",
                descBaby = "Landak adalah hewan kecil yang biasanya ditemukan di Asia dan Afrika. Mereka memiliki tubuh yang berduri, yang terdiri dari ribuan bulu keras yang melindungi mereka dari predator. Landak memiliki moncong yang panjang dan telinga yang besar, serta kaki yang pendek dan kuat yang memungkinkan mereka untuk berjalan, merangkak, atau berenang dengan baik. Mereka biasanya adalah hewan herbivora dan memakan buah-buahan, akar, dan tumbuhan lainnya."
            ),
            Baby(
                R.drawable.monyet,
                nameBaby = "Monyet",
                descBaby = "Monyet adalah hewan mamalia yang ditemukan di banyak bagian dunia, termasuk Asia, Afrika, dan Amerika Selatan. Mereka memiliki tubuh yang kecil hingga sedang, dengan lengan dan kaki yang panjang dan lincah. Monyet memiliki otak yang sangat berkembang, yang memungkinkan mereka untuk belajar dan menggunakan alat untuk memecahkan masalah. Mereka biasanya adalah hewan omnivora dan memakan buah-buahan, daun, serangga, dan bahkan daging kecil."
            ),
            Baby(
                R.drawable.singa,
                nameBaby = "Singa",
                descBaby = "Singa adalah hewan mamalia besar yang ditemukan di Afrika dan sebagian wilayah Asia. Mereka memiliki tubuh yang besar dan kuat, dengan bulu berwarna coklat keemasan dan kepala yang besar dengan rahang yang kuat. Singa jantan biasanya lebih besar dan lebih berat dari singa betina. Singa dikenal sebagai pemangsa top di savana, memangsa hewan seperti zebra, rusa, dan bahkan gajah muda."
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_baby)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BabyAdapter(this, babyList){

        }

    }
}