package com.abuzar.daftarfilm.utils

import com.abuzar.daftarfilm.R
import com.abuzar.daftarfilm.data.DataEntity

object DataDummy {

    fun generateDummyMovie(): List<DataEntity> {

        val movies = ArrayList<DataEntity>()

        movies.add(DataEntity("abe14",
            "Alita: Batlle Angel",
            "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu...",
            "31 Januari 2019",
            "Aksi, Cerita Fiksi, Petualangan",
            false,
            R.drawable.poster_alita))
        movies.add(DataEntity("abe15",
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "7 Desember 2018",
            "Aksi, Fantasi, Petualangan",
            false,
            R.drawable.poster_aquaman))
        movies.add(DataEntity("abe16",
            "Spider Man : Far From Home",
            "Peter Parker dan teman-temannya melakukan perjalanan musim panas ke Eropa. Namun, mereka hampir tidak dapat beristirahat - Peter harus setuju untuk membantu Nick Fury mengungkap misteri makhluk yang menyebabkan bencana alam dan kehancuran di seluruh benua.",
            "28 Juli 2019",
            "Aksi, Cerita Fiksi, Petualangan",
            false,
            R.drawable.poster_spiderman))
        movies.add(DataEntity("abe17",
            "Bohemian Rhapsody",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "24 Oktober 2018",
            "Musik, Drama, Sejarah",
            false,
            R.drawable.poster_bohemian))
        movies.add(DataEntity("abe18",
            "Wreck-it Ralph",
            "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started",
            "1 Januari 2012",
            "Keluarga, Animasi, Komedi, Petualangan",
            false,
            R.drawable.poster_ralph))
        movies.add(DataEntity("abe19",
            "Avengers: Infinity War",
            "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "25 April 2018",
            "Aksi, Cerita Fiksi, Petualangan",
            false,
            R.drawable.poster_infinity_war))
        movies.add(DataEntity("abe20",
            "Serenity",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "24 Januari 2019",
            "Cerita Seru, Misteri, Drama",
            false,
            R.drawable.poster_serenity))
        movies.add(DataEntity("abe21",
            "Creed II",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "21 November 2018",
            "Drama",
            false,
            R.drawable.poster_creed))
        movies.add(DataEntity("abe22",
            "Robin Hood",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "21 November 2018",
            "Petualangan, Cerita Seru, Aksi",
            false,
            R.drawable.poster_robin_hood))
        movies.add(DataEntity("abe23",
            "Mortal Engines",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "27 Nevember 2018",
            "Cerita Fiksi, Petualangan",
            false,
            R.drawable.poster_mortal_engines))

        return movies
    }

    fun generateDummyTvShow(): List<DataEntity> {

        val tvShow = ArrayList<DataEntity>()

        tvShow.add(DataEntity("tv14",
            "Family Guy",
            "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
            "31 Januari 1999",
            "Animasi, Komedi",
            false,
            R.drawable.poster_family_guy))
        tvShow.add(DataEntity("tv15",
            "Dragon Ball Absalon",
            "The series begins twelve years after Goku is seen leaving on Shenron not at the end of Dragon Ball GT, and diverges entirely into its own plot from there, on an alternate timeline from the one which shows Goku Jr. fighting Vegeta Jr. at the World Martial Arts Tournament. In this series, Majuub has reached new levels of power, and has honed the techniques taught to him by Goku. We also see Gotenks finally mature, and Vegeta more powerful than ever.Each character will bring forth their own set of capabilities and purpose, winning fights and being relevant, in order to create an environment that emphasizes teamwork as well as individual worth for each character. In this series, the main set of villains are Saiyans, with abilities highly similar to the Saiyans that we are familiar with. These new Saiyans are more powerful than any threat the Z Fighters have ever faced, but after twelve years of intensive training, our heroes will not be easily defeated .",
            "30 November 2012",
            "Animasi",
            false,
            R.drawable.poster_dragon_ball))
        tvShow.add(DataEntity("tv16",
            "Simpsons",
            "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
            "17 Desember 1989",
            "Keluarga, Animasi, Komedi, Drama, Realitas",
            false,
            R.drawable.poster_the_simpson))
        tvShow.add(DataEntity("tv17",
            "Naruto Shippuden",
            "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki",
            "15 Februari 2007",
            "Animasi, Aksi",
            false,
            R.drawable.poster_naruto_shipudden))
        tvShow.add(DataEntity("tv18",
            "The Arrow",
            "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
            "10 Oktober 2012",
            "Kejahatan, Drama, Misteri, Aksi, Petualangan",
            false,
            R.drawable.poster_arrow))
        tvShow.add(DataEntity("tv19",
            "Hanna",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            "28 Maret 2018",
            "Aksi,Drama, Petualangan",
            false,
            R.drawable.poster_hanna))
        tvShow.add(DataEntity("tv20",
            "Supergirl",
            "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
            "26 Oktober 2015",
            "Aksi, Petualangan, Drama",
            false,
            R.drawable.poster_supergirl))
        tvShow.add(DataEntity("tv21",
            "Gotham ",
            "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
            "22 September 2014",
            "Drama, Kejahatan",
            false,
            R.drawable.poster_gotham))
        tvShow.add(DataEntity("tv22",
            "The Flash",
            "The Flash travels back in time to prevent the murder of his mother, an act which disrupts time significantly.",
            "3 November 2022",
            "Petualangan, Fantasi, Aksi",
            false,
            R.drawable.poster_flash))
        tvShow.add(DataEntity("tv23",
            "Fairy Tail",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "12 Oktober 2009",
            "Cerita Fiksi, Petualangan",
            false,
            R.drawable.poster_fairytail))
        return tvShow
    }

}

