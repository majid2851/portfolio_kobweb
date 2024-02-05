package com.majid2851.youtube_kobweb.pages

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.components.MainHeader
import com.majid2851.youtube_kobweb.components.about.AboutContent
import com.majid2851.youtube_kobweb.components.about.AboutTopInfo
import com.majid2851.youtube_kobweb.config.NavPaths
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page(NavPaths.ABOUT)
@Composable
fun About()
{
    Column(
        modifier = Modifier.fillMaxSize().background(WebColors.heatherBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        MainHeader()

        AboutTopInfo()

        AboutContent()




    }

}