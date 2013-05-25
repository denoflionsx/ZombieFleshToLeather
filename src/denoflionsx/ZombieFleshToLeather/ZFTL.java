package denoflionsx.ZombieFleshToLeather;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import denoflionsx.ZombieFleshToLeather.Proxy.ProxyCommon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "@NAME@", name = "@NAME@", version = "@VERSION@", dependencies = "@DEPENDS@")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ZFTL {

    @Mod.Instance("@NAME@")
    public static Object instance;
    @SidedProxy(clientSide = "@PROXYCLIENT@", serverSide = "@PROXYSERVER@")
    public static ProxyCommon proxy;

    @Mod.PreInit
    public void preLoad(FMLPreInitializationEvent event) {
    }

    @Mod.Init
    public void load(FMLInitializationEvent event) {
        proxy.addSmelt(new ItemStack(Item.rottenFlesh), new ItemStack(Item.leather));
    }

    @Mod.PostInit
    public void modsLoaded(FMLPostInitializationEvent evt) {
    }
}
