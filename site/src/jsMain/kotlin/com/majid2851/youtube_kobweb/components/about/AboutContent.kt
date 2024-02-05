package com.majid2851.youtube_kobweb.components.about

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.components.home.home_content.StatItem
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutContent()
{
    Column(
       modifier =  Modifier.fillMaxWidth()
            .padding(
                leftRight = 48.px,
                top = 8.px,
                bottom = 8.px).background(WebColors.light),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Img(src = "/img.jpg", attrs = {
            style {
                width(300.px)
            }
        })


        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.width(600.px)
        ) {

            Box(modifier = Modifier.height(24.px))

            H4(attrs = {
                style {
                    fontSize(1.5.em)
                    fontWeight("bold")
                    color(WebColors.red)
                    margin(0.px)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.name)
            }
            H2(attrs = {
                style {
                    fontSize(2.2.em)
                    color(Color.black)
                    marginTop(0.5.em)
                    marginBottom(0.5.em)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.carear)
            }


            H4(attrs = {
                style {
                    fontSize(1.em)
                    fontWeight("bold")
                    color(WebColors.black)
                    margin(0.px)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.aboutMyCarear)
            }

        }



        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 32.px, bottom = 16.px),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            StatItem("5", Strings.yearsOfExperience)
            StatItem("3+", Strings.agencyNumbers)
            StatItem("28", Strings.age)
        }

    }


}