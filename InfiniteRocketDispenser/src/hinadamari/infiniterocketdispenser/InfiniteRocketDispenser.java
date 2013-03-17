package hinadamari.infiniterocketdispenser;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * InfiniteRocketDispenser
 * @author hinadamari
 */
public class InfiniteRocketDispenser extends JavaPlugin
{

    public final static Logger log = Logger.getLogger("Minecraft");

    /**
     * プラグイン起動処理
     */
    public void onEnable()
    {

        new InfiniteRocketDispenserEventListener(this);
        getServer().getPluginManager().registerEvents(new InfiniteRocketDispenserEventListener(this), this);

        log.info("[InfiniteRocketDispenser] InfiniteRocketDispenser is enabled!");

    }

    /**
     * プラグイン停止処理
     */
    public void onDisable()
    {
        this.getServer().getScheduler().cancelTasks(this);
    }

}