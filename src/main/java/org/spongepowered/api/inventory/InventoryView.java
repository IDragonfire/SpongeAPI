package org.spongepowered.api.inventory;

/**
 * @author Dragonfire
 */
public interface InventoryView extends Iterable<InventoryComponent> {

    String getName();

    InventoryComponent[] getComponents();

    InventoryHolder getHolder();
}
