package com.majid2851.youtube_kobweb.components.about

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.css.fontSize
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutTopInfo()
{
    Column(
        modifier = Modifier.width(400.px),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        P({
            style {
                fontSize(3.em)
                fontWeight("bold")
                color(WebColors.white)
                textAlign("center")
                marginBottom(16.px)
            }
        }) {
            Text(Strings.aboutUs)
        }

        P({
            style {
                fontSize(1.1.em)
                fontWeight("bold")
                color(Colors.LightGray)
                textAlign("center")
                marginBottom(10.px)
            }
        }) {
            Text(Strings.featureSectionDesc)
        }


    }


}