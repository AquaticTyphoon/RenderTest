package com.aquatictyphoon.rtxcraft.setup.server;

import com.aquatictyphoon.rtxcraft.RTX;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RTX.MODID)

public class ServerAndModEvents {

    @Mod.EventBusSubscriber(modid = RTX.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = RTX.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {

    }
}
