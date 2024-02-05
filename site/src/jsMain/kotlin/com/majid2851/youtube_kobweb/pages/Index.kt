package com.majid2851.youtube_kobweb.pages

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.components.home.home_content.HomeContent
import com.majid2851.youtube_kobweb.components.home.home_header.HeaderContent
import com.majid2851.youtube_kobweb.components.home.home_header.HomeHeader
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage()
{

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
                .background(color = WebColors.heatherBackground)
        )
        {

            HomeHeader()

            HeaderContent()

            HomeContent()

        }



    }

}

