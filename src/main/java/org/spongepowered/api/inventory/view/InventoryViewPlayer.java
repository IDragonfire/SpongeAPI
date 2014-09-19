package org.spongepowered.api.inventory.view;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.inventory.InventoryView;
import org.spongepowered.api.inventory.component.Backpack;
import org.spongepowered.api.inventory.component.CraftingField;
import org.spongepowered.api.inventory.component.Equipment;

/**
 * @author Dragonfire
 */
public interface InventoryViewPlayer extends InventoryView{
    Equipment getEquipment();

    CraftingField getCraftingField();

    Backpack getBackpack();

    Player getHotbar();
}
