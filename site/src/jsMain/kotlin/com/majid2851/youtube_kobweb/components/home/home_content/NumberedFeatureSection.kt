package com.majid2851.youtube_kobweb.components.home.home_content


import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun NumberedFeatureSection() {
    Column(
        modifier = Modifier.width(400.px).padding(32.px),
        horizontalAlignment = Alignment.Start
    ) {
        FeatureItem("1", Strings.provideFullService)
        FeatureItem("2", Strings.technicalSkillsDesign)
        FeatureItem("3", Strings.themeselvesMerchant)
    }
}

@Composable
fun FeatureItem(number: String, text: String) {
    Div(attrs = {
        style {
            display(DisplayStyle.Flex)
            alignItems(AlignItems.Center)
            marginBottom(16.px)
        }
    }) {
        Div(attrs = {
            style {
                fontSize(3.em)
                fontWeight("bold")
                color(WebColors.black)
                marginRight(8.px)
            }
        }) {
            Text(number)
        }
        P(attrs = {
            style {
                fontSize(1.5.em)
                color(WebColors.black)
                margin(0.px)
            }
        }) {
            Text(text)
        }
    }
}