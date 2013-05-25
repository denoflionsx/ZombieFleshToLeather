package denoflionsx.ZombieFleshToLeather.Proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ProxyCommon {

    public void addSmelt(ItemStack input, ItemStack output) {
        GameRegistry.addSmelting(input.itemID, output, 0.0f);
    }
}
