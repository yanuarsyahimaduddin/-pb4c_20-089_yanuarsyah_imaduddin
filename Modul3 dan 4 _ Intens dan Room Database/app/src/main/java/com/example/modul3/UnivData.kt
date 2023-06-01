package com.example.modul3

object UnivData {
    private var data = arrayOf(
        arrayOf(
            "smp airlangga puncu"

        ),
        arrayOf(
            "smp aisyiyah boarding school 1 plemahan"

        ),
        arrayOf(
            "smp al-ikhlas tarokan"
        ),
        arrayOf(
            "smp bhakti nusa plosoklaten"
        ),
        arrayOf(
            "smp brawijaya kepung"

        ),
        arrayOf(
            "smp diponegoro kandangan"
        ),
        arrayOf(
            "smp fatahilah kepung"
        ),
        arrayOf(
            "smp islam grogol"
        ),
        arrayOf(
            "smp islam khoirul iman kepung"
        ),
        arrayOf(
            "smp islam sejahtera badas"
        ),
        arrayOf(
            "smp kristen ybpk grogol"
        ),
        arrayOf(
            "smp negeri 1 banyakan"
        ),
        arrayOf(
            "smp kristen ybpk grogol"
        ),
        arrayOf(
            "smp negeri 1 grogol"
        ),
        arrayOf(
            "smp negeri 1 gurah"
        ),
        arrayOf(
            "smp negeri 1 kandangan"
        ),
        arrayOf(
            "smp negeri 1 kandat"
        ),
        arrayOf(
            "smp negeri 1 kepung"
        ),
        arrayOf(
            "smp negeri 1 kras"
        ),
        arrayOf(
            "smp negeri 1 kunjang"
        ),
        arrayOf(
            "smp negeri 1 ngadiluwih"
        ),
        arrayOf(
            "smp negeri 1 ngancar"
        ),
        arrayOf(
            "smp negeri 1 ngasem"
        ),
        arrayOf(
            "smp negeri 1 papar"
        ),
        arrayOf(
            "smp negeri 1 plemahan"
        ),
        arrayOf(
            "smp negeri 1 plosoklaten"
        ),
        arrayOf(
            "smp negeri 1 puncu"
        ),
        arrayOf(
            "smp negeri 1 purwoasri"
        ),
        arrayOf(
            "smp negeri 1 tarokan"
        ),
        arrayOf(
            "smp negeri 1 wates"
        )

    )

    val listData: ArrayList<Univ>
    get() {
        val list = ArrayList<Univ>()
        for (aData in data) {
            val univ = Univ()
            univ.name = aData[0]


            list.add(univ)
        }
        return list
    }
}