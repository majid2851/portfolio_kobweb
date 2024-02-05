package com.majid2851.youtube_kobweb.components.home.home_header

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.WebColors.heatherContentBackground
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import org.jetbrains.compose.web.dom.Img

@Composable
fun HeaderContent()
{
    Row(
        modifier = Modifier.background(heatherContentBackground)
            .fillMaxWidth()
    )
    {
        HeaderContentInfo()


        Img(src = "/heather_img.png", alt = "", attrs = {
            style {

            }
        })



    }


}