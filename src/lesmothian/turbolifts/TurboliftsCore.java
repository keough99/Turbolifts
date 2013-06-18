package lesmothian.turbolifts;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

import lesmothian.turbolifts.net.ITurboliftsProxy;

@Mod(modid = TurboliftsCore.modId, name = TurboliftsCore.modName, version = TurboliftsCore.version, dependencies = "after:BuildCraft|Core;after:BuildCraft|Factory;after:BuildCraft|Energy;after:BuildCraft|Builders;after:BuildCraft|Transport;after:IC2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TurboliftsCore
{
  @SidedProxy(clientSide = "lesmothian.turbolifts.net.ClientProxy", serverSide = "lesmothian.turbolifts.net.CommonProxy")
  public static ITurboliftsProxy proxy;

  public static final String modId = "Turbolifts";
  public static final String modName = "Turbolifts";
  public static final String modNetworkChannel = "LesmothianTurbolifts";
  public static final String version = "0.0.1";

  private static TurboliftsCore instance;

  public static TurboliftsCore instance()
  {
    return instance;
  }

  @Init
  public void init(FMLInitializationEvent e)
  {
    instance = this;
  }
}
