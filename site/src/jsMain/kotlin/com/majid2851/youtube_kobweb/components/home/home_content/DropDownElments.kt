package com.majid2851.youtube_kobweb.components.home.home_content

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.css.Appearance
import com.varabyte.kobweb.compose.css.appearance
import com.varabyte.kobweb.compose.css.boxShadow
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.core.App
import org.jetbrains.compose.web.attributes.disabled
import org.jetbrains.compose.web.attributes.selected
import org.jetbrains.compose.web.attributes.value
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.events.SyntheticInputEvent
import org.w3c.dom.HTMLSelectElement

@Composable
fun DropdownComponent() {
    val options = listOf("Web Design", "Graphic Design", "App Development", "Digital Marketing")
    var selectedOption = remember { mutableStateOf(options.first()) }

    Div(attrs = {
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            width(200.px)
            marginTop(1.em)
//            padding(0.5.em)
            border(1.px, LineStyle.Solid,WebColors.black)
            borderRadius(4.px)
            backgroundColor(WebColors.white)
            boxShadow("0 2px 3px 0 rgba(0,0,0,0.1)")
        }
    }) {
        Select(attrs = {
            style {
                border(0.px)
                width(100.percent)
                padding(0.5.em)
                fontSize(1.em)
                color(WebColors.black)
                backgroundColor(Colors.Transparent)
                appearance(Appearance.None)
            }
            onInput { event: SyntheticInputEvent<*, *> ->
                val target = event.target as HTMLSelectElement
                selectedOption.value = target.value
            }
        }) {
            options.forEach { option ->
                Option(value = option) { // Set the value attribute here
                    if (option == selectedOption.value) {
//                        selected(true)
                    }
                    Text(option)
                }
            }
        }
    }
}