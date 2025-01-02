package github.werwolfy.sparklingThunder.init;


import github.werwolfy.sparklingThunder.SparklingThunder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS =DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SparklingThunder.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> CREATIVE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.creative_tab"))
                    .icon(ItemInit.AMETHYST_GOLD_TIP.get()::getDefaultInstance)
                    .displayItems(((itemDisplayParameters, output)
                            -> CREATIVE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()))))
                    .build()
            );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        CREATIVE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
