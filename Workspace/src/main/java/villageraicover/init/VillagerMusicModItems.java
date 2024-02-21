
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package villageraicover.init;

import villageraicover.item.MessageItem;
import villageraicover.item.MeAndTheBirdsItem;
import villageraicover.item.CowbellWarriorsItem;
import villageraicover.item.AllofthelightsItem;

import villageraicover.VillagerMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class VillagerMusicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VillagerMusicMod.MODID);
	public static final RegistryObject<Item> ALLOFTHELIGHTS = REGISTRY.register("allofthelights", () -> new AllofthelightsItem());
	public static final RegistryObject<Item> COWBELL_WARRIORS = REGISTRY.register("cowbell_warriors", () -> new CowbellWarriorsItem());
	public static final RegistryObject<Item> ME_AND_THE_BIRDS = REGISTRY.register("me_and_the_birds", () -> new MeAndTheBirdsItem());
	public static final RegistryObject<Item> MESSAGE = REGISTRY.register("message", () -> new MessageItem());
}
