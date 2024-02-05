package com.majid2851.youtube_kobweb.pages

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.components.MainHeader
import com.majid2851.youtube_kobweb.components.home.home_content.HomeContent
import com.majid2851.youtube_kobweb.components.home.home_header.HeaderContent
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage()
{

    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = WebColors.heatherBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        MainHeader()

        HeaderContent()

        HomeContent()

    }



}

