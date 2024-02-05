package com.majid2851.youtube_kobweb.components.home.home_content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Img


@Composable
fun Brand(img:String)
{
    Img(src = "/$img.png", alt = "", attrs = {
        style {

        }
    })


}