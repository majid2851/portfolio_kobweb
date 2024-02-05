package com.majid2851.youtube_kobweb.components.home.home_content
import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun StatsSection() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 32.px, bottom = 16.px),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        StatItem("42%", Strings.yearsOfExperience)
        StatItem("73+", Strings.agencyNumbers)
        StatItem("5.000", Strings.projectsComplete)
    }
}

@Composable
fun StatItem(number: String, description: String) {
    Div(
        attrs = {
            style {
                border(2.px, LineStyle.Solid, WebColors.black)
                borderRadius(8.px)
                padding(16.px)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
                justifyContent(JustifyContent.Center)
                width(200.px)
            }
        }
    ) {
        P({
            style {
                fontSize(3.em)
                fontWeight("bold")
                color(WebColors.black)
                margin(0.px)
            }
        }) {
            Text(number)
        }
        P({
            style {
                fontSize(1.em)
                color(WebColors.black)
                margin(0.px)
            }
        }) {
            Text(description)
        }
    }
}