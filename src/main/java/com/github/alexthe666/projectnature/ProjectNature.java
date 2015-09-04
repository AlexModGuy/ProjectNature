package com.github.alexthe666.projectnature;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.github.alexthe666.projectnature.core.ModBlocks;
import com.github.alexthe666.projectnature.core.ModEntites;
import com.github.alexthe666.projectnature.core.ModItems;
import com.github.alexthe666.projectnature.core.ModRecipes;
import com.github.alexthe666.projectnature.core.ModWorld;
import com.github.alexthe666.projectnature.misc.PNTab;
import com.github.alexthe666.projectnature.world.WorldTypePN;

@Mod(modid = ProjectNature.MODID, version = ProjectNature.VERSION)
public class ProjectNature
{
    public static final String MODID = "pn";
    public static final String VERSION = "Pre-Alpha";
    @Instance(value = MODID)
	public static ProjectNature instance;
    @SidedProxy(clientSide = "com.github.alexthe666.projectnature.ClientProxy", serverSide = "com.github.alexthe666.projectnature.CommonProxy")
	public static CommonProxy proxy;
    public static CreativeTabs tab;
    public static WorldType worldtype;
    @EventHandler
    public void init(FMLInitializationEvent event){
    	tab = new PNTab(MODID);
    	worldtype = new WorldTypePN();
    	ModBlocks.init();
    	ModItems.init();
    	ModRecipes.init();
    	ModEntites.init();
    	ModWorld.init();
    	proxy.render();
    }
}
