package com.majid2851.youtube_kobweb.components.home.home_content

import androidx.compose.runtime.Composable
import com.majid2851.youtube_kobweb.config.NavPaths
import com.majid2851.youtube_kobweb.config.Strings
import com.majid2851.youtube_kobweb.config.WebColors
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.style.KobwebComposeStyleSheet.id
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import kotlinx.browser.document
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.cursor
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLAnchorElement


@Composable
fun ExpertInfo()
{
    Row(
        modifier = Modifier.padding(leftRight = 36.px)
    )
    {
        Img(src = "/pic.png", alt = "", attrs = {
            style {
                width(450.px)
            }
        })

        Column(
            modifier = Modifier.width(600.px).padding(32.px),
            horizontalAlignment = Alignment.Start
        ) {


            P({
                style {
                    fontSize(2.5.em)
                    color(WebColors.black)
                    marginBottom(12.px)
                }
            }) {
                Text(Strings.expertTitle)
            }

            P({
                style {
                    fontSize(.9.em)
                    color(WebColors.black)
                    marginBottom(18.px)
                }
            }) {
                Text(Strings.provideFullService)
            }


            P({
                style {
                    fontSize(.9.em)
                    color(WebColors.black)
                    marginBottom(18.px)
                }
            }) {
                Text(Strings.intro)
            }




            Button(attrs = {
                style {
                    backgroundColor(WebColors.white)
                    color(WebColors.black)
                    padding(8.px, 16.px)
                    border(2.px, LineStyle.Solid, WebColors.red)
                    borderRadius(4.px)
                    cursor("pointer")
                    marginBottom(16.px)
                }
            }) {
                A(href = NavPaths.ABOUT){
                    Text(Strings.aboutUs)
                }



            }

            CheckboxComponent()

            DropdownComponent()

        }


    }
}