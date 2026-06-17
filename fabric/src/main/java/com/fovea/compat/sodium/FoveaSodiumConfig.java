package com.fovea.compat.sodium;

import com.fovea.Constants;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class FoveaSodiumConfig implements ConfigEntryPoint {

    @Override
    public void registerConfigLate(ConfigBuilder builder) {
        builder.registerOwnModOptions()
                .addPage(builder.createOptionPage()
                        .setName(Component.literal(Constants.MOD_NAME))
                        .addOptionGroup(builder.createOptionGroup()
                                .addOption(builder.createExternalButtonOption(Identifier.parse(Constants.MOD_ID + ":log_button"))
                                        .setName(Component.literal("Log Button"))
                                        .setTooltip(Component.literal("Logs a message from Fovea."))
                                        .setScreenConsumer(screen -> Constants.LOG.info("Fovea Sodium settings button clicked"))
                                )
                        )
                );
    }
}
