package github.werwolfy.sparklingThunder.init;

import github.werwolfy.sparklingThunder.SparklingThunder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SparklingThunder.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear",
            () -> new Item(new Item.Properties()
                    .stacksTo(5)
                    .rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 1), 1.0f)
                            .build()
                    )
            ));
}
