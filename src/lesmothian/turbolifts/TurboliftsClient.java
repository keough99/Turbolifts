package lesmothian.turbolifts;

import java.util.EnumSet;
import java.util.HashMap;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TurboliftsClient implements IScheduledTickHandler
{
  private static TurboliftsClient _instance;

  public static void init()
  {
    _instance = new TurboliftsClient();
  }

  @Override
  public void tickStart(EnumSet<TickType> type, Object... tickData) {}

  @Override
  public void tickEnd(EnumSet<TickType> type, Object... tickData) {}

  @Override
  public EnumSet<TickType> ticks()
  {
    return EnumSet.of(TickType.PLAYER);
  }

  @Override
  public String getLabel()
  {
    return TurboliftsCore.modId + ".client";
  }

  @Override
  public int nextTickSpacing()
  {
    return 0;
  }
}
