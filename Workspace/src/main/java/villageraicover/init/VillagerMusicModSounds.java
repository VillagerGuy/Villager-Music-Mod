
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package villageraicover.init;

import villageraicover.VillagerMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class VillagerMusicModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VillagerMusicMod.MODID);
	public static final RegistryObject<SoundEvent> AOTL = REGISTRY.register("aotl", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("villager_music", "aotl")));
	public static final RegistryObject<SoundEvent> CW = REGISTRY.register("cw", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("villager_music", "cw")));
	public static final RegistryObject<SoundEvent> MATB = REGISTRY.register("matb", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("villager_music", "matb")));
}
