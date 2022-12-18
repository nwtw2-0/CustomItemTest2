package cn.powernukkitx.exampleplugin;

import cn.nukkit.block.Block;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.entity.Entity;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.ConfigSection;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.utils.Utils;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;
import cn.nukkit.plugin.PluginLogger;
import com.sun.tools.javac.Main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * author: MagicDroidX
 * NukkitExamplePlugin Project
 */
public class ExamplePlugin extends PluginBase {
    PluginLogger log;

    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "I've been loaded!");
        try {
            Item.registerCustomItem(List.of(masword.class));
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            log.info("启动失败!");
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "非常sus的customitem启动！");



        this.getLogger().info(String.valueOf(this.getDataFolder().mkdirs()));

        //Register the EventListener
        //this.getServer().getPluginManager().registerEvents(new EventListener(this), this);

        //PluginTask
        //this.getServer().getScheduler().scheduleRepeatingTask(new BroadcastPluginTask(this), 200);

        //Save resources
        //this.saveResource("string.txt");

        //Config reading and writing
       /* Config config = new Config(
                new File(this.getDataFolder(), "config.yml"),
                Config.YAML,
                //Default values (not necessary)
                new ConfigSection(new LinkedHashMap<>() {
                    {
                        put("this-is-a-key", "Hello! Config!");
                        put("another-key", true); //you can also put other standard objects!
                    }
                }));
        //Now try to get the value, the default value will be given if the key isn't exist!
        this.getLogger().info(String.valueOf(config.get("this-is-a-key", "this-is-default-value")));
        //Don't forget to save it!
        config.save();
    */}

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "I've been disabled!");
    }


}
