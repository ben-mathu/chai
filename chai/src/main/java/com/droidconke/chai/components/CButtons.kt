/*
 * Copyright 2022 DroidconKE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.droidconke.chai.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.droidconke.chai.ChaiTheme
import com.droidconke.chai.utils.Alpha.AlphaDisabled
import com.droidconke.chai.utils.CShapes
import com.droidconke.chai.utils.ChaiPreview
import com.droidconke.chai.utils.Space5

@Composable
fun CButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean,
    colors: ButtonColors,
    shape: Shape,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        enabled = isEnabled,
        modifier = modifier,
        colors = colors,
        content = content,
        shape = shape
    )
}

@Composable
fun COutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: ButtonColors,
    shape: Shape,
    content: @Composable RowScope.() -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        colors = colors,
        content = content,
        shape = shape
    )
}

@Composable
fun CPrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean,
    title: String
) {
    CButton(
        onClick = onClick,
        isEnabled = isEnabled,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContentColor = MaterialTheme.colorScheme.primary.copy(alpha = AlphaDisabled)
        ),
        shape = CShapes.extraLarge,
        content = {
            ChaiTextButton(text = title)
        }
    )
}

@Composable
fun COutlinedPrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String,
    icon: ImageVector
) {
    COutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = CShapes.extraLarge,
        colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.primary)
    ) {
        Icon(imageVector = icon, contentDescription = "", modifier = Modifier.padding(5.dp))
        Space5
        ChaiTextButton(text = title)
    }
}

private const val PREVIEW_BUTTON_TITLE = "Filter"
private const val PREVIEW_OUTLINE_BUTTON_TITLE = "Twitter"

@Preview
@Composable
fun CPrimaryButtonDarkPreview() {
    ChaiTheme(darkTheme = true) {
        CPrimaryButton(
            onClick = { },
            isEnabled = true,
            title = PREVIEW_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun CPrimaryButtonDisableDarkPreview() {
    ChaiTheme(darkTheme = true) {
        CPrimaryButton(
            onClick = { },
            isEnabled = false,
            title = PREVIEW_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun CPrimaryButtonDisableLightPreview() {
    ChaiTheme(darkTheme = false) {
        CPrimaryButton(
            onClick = { },
            isEnabled = false,
            title = PREVIEW_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun CPrimaryButtonLightPreview() {
    ChaiTheme {
        CPrimaryButton(
            onClick = { },
            isEnabled = true,
            title = PREVIEW_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun CPrimaryOutlinedButtonLightPreview() {
    ChaiTheme(darkTheme = false) {
        COutlinedPrimaryButton(
            onClick = { },
            title = PREVIEW_OUTLINE_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth(),
            icon = Icons.AutoMirrored.Outlined.Send
        )
    }
}

@Preview
@Composable
fun CPrimaryOutlinedButtonDarkPreview() {
    ChaiTheme(darkTheme = true) {
        COutlinedPrimaryButton(
            onClick = { },
            title = PREVIEW_OUTLINE_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth(),
            icon = Icons.AutoMirrored.Outlined.Send
        )
    }
}

@ChaiPreview
@Composable
fun PrimaryOutlinedButtonPreview() {
    ChaiTheme {
        COutlinedPrimaryButton(
            onClick = { },
            title = PREVIEW_OUTLINE_BUTTON_TITLE,
            modifier = Modifier.fillMaxWidth(),
            icon = Icons.AutoMirrored.Outlined.Send
        )
    }
}