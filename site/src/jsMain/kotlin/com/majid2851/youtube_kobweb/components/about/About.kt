package com.majid2851.youtube_kobweb.components.about

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.components.home.home_header.HomeHeader
import com.majid2851.youtube_kobweb.config.NavPaths
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page(NavPaths.ABOUT)
@Composable
fun About()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HomeHeader()



    }

}