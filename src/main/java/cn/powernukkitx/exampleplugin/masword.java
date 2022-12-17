package cn.powernukkitx.exampleplugin;

import cn.nukkit.item.ItemSwordDiamond;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

public class masword extends ItemCustomTool{
    public masword(){
        super("nwtw:test_sword", "god sword", "test_sword");
    }

    @Override
    public CustomItemDefinition getDefinition(){
        return CustomItemDefinition
                .toolBuilder(this, ItemCreativeCategory.EQUIPMENT)
                .allowOffHand(true)
                .handEquipped(true)
                .foil(true)
                .build();
    }

    @Override
    public int getTier() {
        return ItemSwordDiamond.TIER_DIAMOND;
    }

    @Override
    public int getAttackDamage(){
        return 20;
    }

    @Override
    public int getEnchantAbility(){
        return 20;
    }

    @Override
    public boolean isSword(){
        return true;
    }
}
