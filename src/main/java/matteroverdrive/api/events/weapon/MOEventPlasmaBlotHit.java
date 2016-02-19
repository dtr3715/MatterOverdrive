/*
 * This file is part of Matter Overdrive
 * Copyright (c) 2015., Simeon Radivoev, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.api.events.weapon;

import matteroverdrive.entity.weapon.PlasmaBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Simeon on 7/21/2015.
 * Triggered when a Plasma bolt hits a target.
 * It can be either a block or an Entity.
*/
public class MOEventPlasmaBlotHit extends Event
{
    public final ItemStack weapon;
    public final MovingObjectPosition hit;
    public final PlasmaBolt plasmaBolt;
    public final Side side;

    public MOEventPlasmaBlotHit(ItemStack weapon, MovingObjectPosition hit, PlasmaBolt plasmaBolt, Side side)
    {
        this.weapon = weapon;
        this.hit = hit;
        this.plasmaBolt = plasmaBolt;
        this.side = side;
    }
}
