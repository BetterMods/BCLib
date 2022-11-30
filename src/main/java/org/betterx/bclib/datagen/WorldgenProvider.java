package org.betterx.bclib.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;

import java.util.concurrent.CompletableFuture;

public class WorldgenProvider extends FabricDynamicRegistryProvider {
    public WorldgenProvider(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.NOISE_SETTINGS));
        entries.addAll(registries.lookupOrThrow(Registries.WORLD_PRESET));
        //entries.addAll(registries.lookupOrThrow(BCLBiomeRegistry.BCL_BIOMES_REGISTRY));
        //entries.addAll(registries.lookupOrThrow(SurfaceRuleRegistry.SURFACE_RULES_REGISTRY));
    }

    @Override
    public String getName() {
        return "WorldGen Provider";
    }
}
