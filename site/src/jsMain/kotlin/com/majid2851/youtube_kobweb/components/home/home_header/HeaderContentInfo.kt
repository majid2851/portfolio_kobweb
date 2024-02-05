package com.majid2851.youtube_kobweb.components.home.home_header


import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun HeaderContentInfo() {
    Column(
        modifier = Modifier.width(800.px).padding(32.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P({
            style {
                fontSize(1.1.em)
                fontWeight("bold")
                color(WebColors.red)
                marginBottom(12.px)
            }
        }) {
            Text(Strings.modernStudio)
        }

        P({
            style {
                fontSize(3.em)
                fontWeight("bold")
                color(Color.white)
                marginBottom(16.px)
            }
        }) {
            Text(Strings.contentTitle1)
        }

        P({
            style {
                fontSize(1.25.em)
                color(Color.white)
                marginBottom(32.px)
            }
        }) {
            Text(Strings.contentTitle2)
        }

        Row()
        {
            Button(attrs = {
                style {
                    backgroundColor(WebColors.red)
                    color(Color.white)
                    padding(8.px, 16.px)
                    border(2.px, LineStyle.Solid, WebColors.red)
                    borderRadius(4.px)
                    cursor("pointer")
                    marginBottom(16.px)
                }
            }) {
                Text(Strings.howWeWork)
            }

            Box(modifier = Modifier.width(16.px))

            Button(attrs = {
                style {
                    backgroundColor(Color.transparent)
                    color(Color.white)
                    padding(8.px, 16.px)
                    border(2.px, LineStyle.Solid, Color.white)
                    borderRadius(4.px)
                    cursor("pointer")
                    marginBottom(32.px)
                }
            }) {
                Text(Strings.contactUs)
            }

        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Img(src = "/for_test.png", alt = "", attrs = {
                style {
                    height(60.px)
//                    width(20.px)
                }
            })

            Box(modifier = Modifier.width(16.px))


            P({
                style {
                    display(DisplayStyle.Flex)
                    alignItems(AlignItems.Center)
                    justifyContent(JustifyContent.Center)
                    color(Color.white)
                    fontSize(1.em)
                    fontWeight("bold")
                }
            }) {
                Text(Strings.name)
            }
        }



    }
}