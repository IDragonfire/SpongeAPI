package org.spongepowered.api.inventory;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.Player;
import org.spongepowered.api.inventory.view.InventoryViewPlayer;

/**
 * @author Dragonfire
 */
public interface InventorySystem {

    InventoryView getInventory(Entity entity);

    InventoryViewPlayer getInventory(Player player);
}
