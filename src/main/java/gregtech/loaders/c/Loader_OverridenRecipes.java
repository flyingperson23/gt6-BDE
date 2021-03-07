package gregtech.loaders.c;

import gregapi.data.OP;
import gregtech.loaders.b.Loader_OreProcessing;

import static gregapi.data.CS.*;
import static gregapi.data.OP.*;
import static gregapi.data.TD.Atomic.ANTIMATTER;
import static gregapi.util.CR.*;

public class Loader_OverridenRecipes implements Runnable {
    @Override
    public void run() {
        blockGem.addListener(new Loader_OreProcessing.OreProcessing_CraftFrom(1, "gemToBlock", new String[][] {{"GGG", "GGG", "GGG"}}, null, null, null, null, null, ANTIMATTER.NOT));
        blockSolid.addListener(new Loader_OreProcessing.OreProcessing_CraftFrom(1, "ingotToBlock", new String[][] {{"III", "III", "III"}}, null, null, null, null, null, ANTIMATTER.NOT));
    }
}
