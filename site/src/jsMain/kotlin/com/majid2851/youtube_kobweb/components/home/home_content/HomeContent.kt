package com.majid2851.youtube_kobweb.components.home.home_content

import androidx.compose.runtime.Composable
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
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.cursor
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HomeContent()
{
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(
                leftRight = 48.px,
                top = 8.px,
                bottom = 8.px).background(WebColors.light)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.px),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,

        )
        {
            Brand(img ="bitmap1")
            Brand(img = "bitmap2")
            Brand(img = "bitmap3")
            Brand(img = "bitmap4")
            Brand(img = "bitmap5")
        }

        Box(
          modifier = Modifier
              .background(WebColors.light2)
              .height(2.px)
              .fillMaxWidth()
        )

        ExpertInfo()

        StatsSection()

        Box(
            modifier = Modifier
                .background(WebColors.light2)
                .height(2.px)
                .fillMaxWidth()
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            FeatureSection()

            NumberedFeatureSection()

        }


    }




}


