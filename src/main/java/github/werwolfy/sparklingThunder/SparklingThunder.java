package github.werwolfy.sparklingThunder;
import github.werwolfy.sparklingThunder.init.BlockInit;
import github.werwolfy.sparklingThunder.init.CreativeTabInit;
import github.werwolfy.sparklingThunder.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SparklingThunder.MOD_ID)
public class SparklingThunder {
    public static final String MOD_ID = "sparklingthunder";


    public SparklingThunder(FMLJavaModLoadingContext context)
    {
        IEventBus eventBus = context.getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);
        CreativeTabInit.TABS.register(eventBus);

    }
}
