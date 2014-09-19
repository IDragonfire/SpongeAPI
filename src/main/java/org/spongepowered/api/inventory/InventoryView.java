package org.spongepowered.api.inventory;

/**
 * @author Dragonfire
 */
public interface InventoryView {

    String getName();

    ComponentInventory[] getComponents();

    InventoryHolder getHolder();
}
