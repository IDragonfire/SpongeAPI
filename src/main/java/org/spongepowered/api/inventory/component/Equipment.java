package org.spongepowered.api.inventory.component;

import org.spongepowered.api.inventory.InventoryComponent;
import org.spongepowered.api.inventory.SlotType;

/**
 * @author Dragonfire
 */
public interface Equipment extends InventoryComponent{

    SlotType slotHelmet();

    SlotType slotChestplate();

    SlotType slotLeggings();

    SlotType slotBoots();
}
