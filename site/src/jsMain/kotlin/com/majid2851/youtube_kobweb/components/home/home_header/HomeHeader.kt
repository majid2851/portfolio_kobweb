package com.majid2851.youtube_kobweb.components.home.home_header

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun HomeHeader()
{
    Row(
        modifier = Modifier.fillMaxWidth().
        padding(leftRight = 16.px, bottom = 16.px, top = 16.px),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Img(src = "/logo.png", alt = "Logo", attrs = {
            style {
                property("height", "50.px")
            }
        })

        // Navigation links
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.weight(1f).padding(leftRight = 32.px)
        ) {
            NavLink(Strings.about)
            NavLink(Strings.services)
            NavLink(Strings.pricing)
            NavLink(Strings.blog)
        }
    }
}

@Composable
private fun NavLink(text: String) {
    Span(
        attrs = {
            style {
                padding(0.px, 8.px)
                color(Color.white)
                fontSize(1.25.em)
                cursor("pointer")
                property("text-decoration", "none")

            }
        }
    ) {
        Text(text)
    }
}