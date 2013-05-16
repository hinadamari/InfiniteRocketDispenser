package hinadamari.infiniterocketdispenser;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.block.Dispenser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.inventory.ItemStack;

/**
 * InfiniteRocketDispenser イベントリスナ
 * @author hinadamari
 */
public class InfiniteRocketDispenserEventListener implements Listener
{
    public InfiniteRocketDispenser plugin;
    public final static Logger log = Logger.getLogger("Minecraft");
    public boolean eventflg = false;

    public InfiniteRocketDispenserEventListener(InfiniteRocketDispenser instance)
    {
        plugin = instance;
    }

    /**
     * 花火を発射した時の処理
     * @param event
     */
    @EventHandler(priority = EventPriority.HIGH)
    public void onItemDispensed(BlockDispenseEvent event) {

    	if (event.getItem().getType() != Material.FIREWORK) return;

    	if (!(event.getBlock().getState() instanceof Dispenser)) return;

    	Dispenser dispenser = (Dispenser) event.getBlock().getState();

    	ItemStack newItemStack = event.getItem().clone();
		dispenser.getInventory().addItem(newItemStack);

    }

}