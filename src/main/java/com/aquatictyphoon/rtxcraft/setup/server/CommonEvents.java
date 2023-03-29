package com.aquatictyphoon.rtxcraft.setup.server;

import com.aquatictyphoon.rtxcraft.RTX;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = RTX.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
    @SubscribeEvent
    public static void onStaticCommonSetup(FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void registerCaps(RegisterCapabilitiesEvent event) {
    }

}

