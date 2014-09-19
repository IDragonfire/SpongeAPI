package org.spongepowered.api.inventory;

/**
 * @author Dragonfire
 */
public interface InventoryComponent extends Iterable<ItemStack>{

    int getSlotSize();

    ItemStack getItem(SlotType type);

    ItemStack getItem(int slot);
}
