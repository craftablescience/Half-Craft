package team.blackmesa.halfcraft.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class GunItem extends Item {
    public GunItem() {
        super(new Item.Properties().tab(ItemGroup.TAB_COMBAT));
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> use(@Nonnull World p_77659_1_, @Nonnull PlayerEntity p_77659_2_, @Nonnull Hand p_77659_3_) {
        return ActionResult.pass(p_77659_2_.inventory.getItem(p_77659_2_.inventory.selected));
    }
}
