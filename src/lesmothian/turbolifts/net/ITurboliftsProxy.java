package lesmothian.turbolifts.net;

import net.minecraft.entity.player.EntityPlayer;
public interface ITurboliftsProxy
{
  public void init();
  public void movePlayerToCoordinates(EntityPlayer e, double x, double y, double z);
}
