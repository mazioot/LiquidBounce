/*
 * This file is part of LiquidBounce (https://github.com/CCBlueX/LiquidBounce)
 *
 * Copyright (c) 2015 - 2023 CCBlueX
 *
 * LiquidBounce is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LiquidBounce is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LiquidBounce. If not, see <https://www.gnu.org/licenses/>.
 */
package net.ccbluex.liquidbounce.script.bindings.globals

import net.ccbluex.liquidbounce.utils.item.createItem
import net.minecraft.item.ItemStack

/**
 * Object used by the script API to provide an easier way of creating items.
 */
object JsItem {

    /**
     * Create [ItemStack] from [arguments]
     */
    @Suppress("unused")
    fun create(arguments: String): ItemStack = createItem(arguments, 1)

    /**
     * Create [amount]x [ItemStack] from [arguments]
     */
    @Suppress("unused")
    fun create(arguments: String, amount: Int): ItemStack = createItem(arguments, amount)

}
