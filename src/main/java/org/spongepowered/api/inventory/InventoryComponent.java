package org.spongepowered.api.inventory;

/**
 * @author Dragonfire
 */
public interface InventoryComponent {

    int getSlotSize();

    ItemStack getItem(SlotType type);

    ItemStack getItem(int slot);
}
