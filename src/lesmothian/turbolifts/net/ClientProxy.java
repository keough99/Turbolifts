package lesmothian.turbolifts.net;

import net.minecraft.entity.player.EntityPlayer;
import lesmothian.turbolifts.TurboliftsClient;

public class ClientProxy implements ITurboliftsProxy
{
  @Override
  public void init()
  {
    TurboliftsClient.init();
  }

  @Override
  public void movePlayerToCoordinates(EntityPlayer e, double x, double y, double z)
  {
    e.setPosition(x, y, z);
  }
}
