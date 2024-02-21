
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package villageraicover.init;

import villageraicover.VillagerMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class VillagerMusicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VillagerMusicMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATIVETAB = REGISTRY.register("creativetab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.villager_music.creativetab")).icon(() -> new ItemStack(Items.MUSIC_DISC_MELLOHI)).displayItems((parameters, tabData) -> {
				tabData.accept(VillagerMusicModItems.ALLOFTHELIGHTS.get());
				tabData.accept(VillagerMusicModItems.COWBELL_WARRIORS.get());
				tabData.accept(VillagerMusicModItems.ME_AND_THE_BIRDS.get());
				tabData.accept(VillagerMusicModItems.MESSAGE.get());
			})

					.build());
}
