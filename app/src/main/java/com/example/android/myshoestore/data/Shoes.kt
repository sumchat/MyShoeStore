package com.example.android.myshoestore.data

import android.content.res.Resources
import com.example.android.myshoestore.R

/* Returns list of shoes */
fun shoeList(resources: Resources):List<Shoe> {
    return listOf(
        Shoe(id = 1,
        name = resources.getString(R.string.shoe1_name),
        companyName = "X",
        size = 5,
        image=R.mipmap.shoeicon_foreground,//R.drawable.shoeicon_background,
        description = resources.getString(R.string.shoe1_desc)

        ), Shoe(id = 2,
            name = resources.getString(R.string.shoe2_name),
            companyName = "Y",
            size = 6,
            image=R.mipmap.shoeicon_foreground,
            description = resources.getString(R.string.shoe2_desc)

        ),
        Shoe(id = 3,
            name = resources.getString(R.string.shoe3_name),
            companyName = "A",
            size = 5,
            image=R.mipmap.shoeicon_foreground,
            description = resources.getString(R.string.shoe3_desc)

        ),
        Shoe(id = 4,
            name = resources.getString(R.string.shoe4_name),
            companyName = "A",
            size = 7,
            image=R.mipmap.shoeicon_foreground,
            description = resources.getString(R.string.shoe4_desc)

        ),




    )
}