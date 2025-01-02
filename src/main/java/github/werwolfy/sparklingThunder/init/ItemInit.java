package github.werwolfy.sparklingThunder.init;

import github.werwolfy.sparklingThunder.SparklingThunder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SparklingThunder.MOD_ID);

/*    public static final RegistryObject<Item> AMETHYST_GOLD_TIP = addToTab( ITEMS.register("amethyst_gold_tip",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.UNCOMMON)
            )));
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = addToTab(ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
            )));*/





        public static final RegistryObject<Item> AMETHYST_GOLD_TIP =  ITEMS.register("amethyst_gold_tip",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.UNCOMMON)
            ));
}
