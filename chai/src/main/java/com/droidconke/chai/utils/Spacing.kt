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
package com.droidconke.chai.utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
* these are units of spacing that can be used in the app.
* Use these in padding and margin:
*
* Usage:
* .padding(horizontal = Space15, vertical = Space30)

*/
val Space5 = 5.dp
val Space15 = 15.dp
val Space30 = 30.dp

/*
 * These are spacers that can be used in the app.
 * Mostly relevant in rows and columns to create space with other components.
 * Usage:
 * Spacer30()
 *

*/
@Composable
fun Spacer5(){
    Spacer(Modifier.height(Space5))
}

@Composable
fun Spacer15() {
    Spacer(Modifier.height(Space15))
}
@Composable
fun Spacer30() {
    Spacer(Modifier.height(Space30))
}

