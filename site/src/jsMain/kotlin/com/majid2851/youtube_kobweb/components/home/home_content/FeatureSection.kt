package com.majid2851.youtube_kobweb.components.home.home_content


import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*


@Composable
fun FeatureSection() {
    Column(
        modifier = Modifier.width(800.px).padding(32.px),
        horizontalAlignment = Alignment.Start
    ) {
        Div(attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.FlexStart) // Align items to the start of the container
                textAlign("start") // Align text to the start
            }
        }) {
            H4(attrs = {
                style {
                    fontSize(1.2.em)
                    fontWeight("bold")
                    color(WebColors.red)
                    margin(0.px)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.howWeWork)
            }
            H2(attrs = {
                style {
                    fontSize(2.5.em)
                    color(Color.black)
                    marginTop(0.5.em)
                    marginBottom(0.5.em)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.makeProjectMore)
            }
            P(attrs = {
                style {
                    fontSize(1.em)
                    color(Color.black)
                    marginBottom(2.em)
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.featureSectionDesc)
            }
            A(attrs = {
                style {
                    color(Color.black)
                    textDecoration("none")
                    padding(0.5.em, 1.em)
                    border(1.px, LineStyle.Solid, Color.black)
                    borderRadius(4.px)
                    cursor("pointer")
                    textAlign("start") // Align text to the start
                }
            }) {
                Text(Strings.readMore)
            }
        }
    }
}