/**
 * Backpack for Android - Skyscanner's Design System
 *
 * Copyright 2018-2021 Skyscanner Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.skyscanner.backpack.calendar2

import net.skyscanner.backpack.calendar2.data.CalendarCells
import net.skyscanner.backpack.util.ExperimentalBackpackApi

@ExperimentalBackpackApi
data class CalendarState internal constructor(
  val params: CalendarParams,
  val selection: CalendarSelection = CalendarSelection.None,
  internal val cells: CalendarCells = CalendarCells(params, selection),
)