package github.werwolfy.sparklingThunder.init;


import github.werwolfy.sparklingThunder.SparklingThunder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS =DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SparklingThunder.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.creative_tab"))
                    .icon(ItemInit.AMETHYST_GOLD_TIP.get()::getDefaultInstance)
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ItemInit.AMETHYST_GOLD_TIP.get());
                    }))
                    .build()
            );

}
