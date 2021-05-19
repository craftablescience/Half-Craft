package team.blackmesa.halfcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class CrowbarItem extends SwordItem {
    public CrowbarItem() {
        super(ItemTier.IRON, 3, -2f, (new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    }
}
