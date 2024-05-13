package com.frondend.Data

import android.graphics.Movie
import com.frondend.Model.About
import com.frondend.Model.Home
import com.frondend.Model.ListMovie
import com.frondend.R


object AllData {
    val listFilmRow = listOf(
        Home(
            id = 1,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 2,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 3,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 4,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 5,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 6,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 7,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 8,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 9,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 10,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
    )
    val listFilmColumn = listOf(
        Home(
            id = 1,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 2,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 3,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 4,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 5,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 6,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 7,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 8,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
        Home(
            id = 9,
            image = R.drawable.img1,
            judul = "The Invisible Guest ",
            tahun = "2016",
        ),
        Home(
            id = 10,
            image = R.drawable.img2,
            judul = "Parasite ",
            tahun = "2019",
        ),
    )
    val listMovie = listOf(
        ListMovie(
            id = 1,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 2,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 3,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 4,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 5,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 6,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 7,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 8,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 9,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 10,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 11,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 12,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 13,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 14,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 15,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 16,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 17,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 18,
            photo = R.drawable.img2,
        ),
        ListMovie(
            id = 19,
            photo = R.drawable.img1,
        ),
        ListMovie(
            id = 20,
            photo = R.drawable.img2,
        ),

    )
    fun getAboutData(): List<About> {
        return listOf(
            About(
                image = R.drawable.man_4140052,
                nama = "Wahyu Hendra Octavian",
                email = "Wahhy384@gmail.com",
                apt = "Universitas 17 Agustus 1945 Surabaya",
                jurusan = "Teknik Informatika"
            )

        )
    }
}