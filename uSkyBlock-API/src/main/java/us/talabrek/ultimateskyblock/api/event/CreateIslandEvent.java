package us.talabrek.ultimateskyblock.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * Fired when a player tries to create an island.
 * @since 2.7.0
 */
public class CreateIslandEvent extends CancellablePlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final String schematic;
    private final Player who;

    public CreateIslandEvent(Player who, String schematic) {
        this.who = who;
        this.schematic = schematic;
    }
    
    public String getPlayer() {
        return who;
    }

    public String getSchematic() {
        return schematic;
    }
    
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
