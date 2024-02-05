package com.majid2851.youtube_kobweb.components.home.home_content

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.majid2851.youtube_kobweb.config.Strings
import com.varabyte.kobweb.compose.foundation.layout.Row
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.forId
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLInputElement


@Composable
fun CheckboxComponent() {
    var isChecked by remember { mutableStateOf(false) }

    Row()
    {
        // Checkbox input
        Input(type = InputType.Checkbox, attrs = {
            id("checkbox-id")
            checked(isChecked)
            onInput { event ->
                isChecked = (event.target as HTMLInputElement).checked
            }
        })

        // Label for the checkbox
        Label(forId = "checkbox-id") {
            Text(Strings.checkMe)
        }
    }

}