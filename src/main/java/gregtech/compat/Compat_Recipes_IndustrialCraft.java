/**
 * Copyright (c) 2018 Gregorius Techneticies
 *
 * This file is part of GregTech.
 *
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package gregtech.compat;

import static gregapi.data.CS.*;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import gregapi.api.Abstract_Mod;
import gregapi.block.multitileentity.MultiTileEntityRegistry;
import gregapi.code.ModData;
import gregapi.compat.CompatMods;
import gregapi.config.ConfigCategories;
import gregapi.data.ANY;
import gregapi.data.CS.BlocksGT;
import gregapi.data.CS.ConfigsGT;
import gregapi.data.FL;
import gregapi.data.IL;
import gregapi.data.MD;
import gregapi.data.MT;
import gregapi.data.OD;
import gregapi.data.OP;
import gregapi.data.RM;
import gregapi.data.TD;
import gregapi.oredict.IOreDictListenerEvent;
import gregapi.oredict.OreDictItemData;
import gregapi.oredict.OreDictListenerEvent_Names;
import gregapi.oredict.OreDictMaterial;
import gregapi.util.CR;
import gregapi.util.OM;
import gregapi.util.ST;
import gregapi.util.UT;
import ic2.api.crops.Crops;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fluids.FluidStack;

public class Compat_Recipes_IndustrialCraft extends CompatMods {
	public Compat_Recipes_IndustrialCraft(ModData aMod, Abstract_Mod aGTMod) {super(aMod, aGTMod);}
	
	@SuppressWarnings("deprecation")
	@Override public void onPostLoad(FMLPostInitializationEvent aInitEvent) {if (MD.IC2C.mLoaded) OUT.println("GT_Mod: Doing IC2-Classic Things."); else OUT.println("GT_Mod: Doing IC2-Exp Things.");
		MultiTileEntityRegistry aRegistry = MultiTileEntityRegistry.getRegistry("gt.multitileentity");
		
		String tName = "";
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "generator"             ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "TDC", "BMR", "FwW", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[1], 'W', OP.cableGt01.dat(ANY.Cu), 'R', "gt:re-battery1", 'T', aRegistry.getItem(1522), 'B', aRegistry.getItem(1204), 'F', aRegistry.getItem(1104), 'D', aRegistry.getItem(10111));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "electrolyzer"          ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "WwW", "W W", "CMC", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[2], 'W', OP.wireGt01.dat(MT.Pt));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "electroFurnace"        ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "WWW", "WwW", "CMC", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[1], 'W', OP.wireGt01.dat(MT.AnnealedCopper));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "inductionFurnace"      ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "WWW", "WwW", "CMC", 'M', IL.IC2_Machine_Adv     , 'C', OD_CIRCUITS[3], 'W', OP.wireGt04.dat(MT.AnnealedCopper));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "extractor"             ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, " w ", "PMP", "WCW", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[1], 'W', OP.cableGt01.dat(ANY.Cu), 'P', IL.PUMPS[2]);}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "macerator"             ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "DwD", "GMG", "CPC", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[2], 'W', OP.cableGt01.dat(ANY.Cu), 'P', IL.MOTORS[2], 'D', OP.gem.dat(ANY.Diamond), 'G', OP.gearGt.dat(ANY.Steel));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "compressor"            ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, " w ", "PMP", "WCW", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[1], 'W', OP.cableGt01.dat(ANY.Cu), 'P', IL.PISTONS[2]);}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "recycler"              ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "GwG", "PMP", "WCW", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[2], 'W', OP.cableGt01.dat(ANY.Cu), 'P', IL.PISTONS[3], 'G', OP.dust.dat(ANY.Glowstone));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "massFabricator"        ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "CXC", "CMC"       , 'M', IL.IC2_Machine_Adv     , 'C', OD_CIRCUITS[6], 'X', aRegistry.getItem(20413));}
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "lvTransformer"         ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "MwM", " X ", "M M", 'M', OD.plankAnyWood    , 'C', OD_CIRCUITS[1], 'X', aRegistry.getItem(10041));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "mvTransformer"         ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, " w ", " X ", " M ", 'M', IL.IC2_Machine         , 'C', OD_CIRCUITS[2], 'X', aRegistry.getItem(10042));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "hvTransformer"         ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, " w ", " X ", " M ", 'M', IL.IC2_Machine_Adv     , 'C', OD_CIRCUITS[3], 'X', aRegistry.getItem(10043));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "evTransformer"         ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, " w ", " X ", " M ", 'M', IL.IC2_Machine_Adv     , 'C', OD_CIRCUITS[4], 'X', aRegistry.getItem(10044));}
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "batBox"                ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "MBM", "BXB", "MBM", 'M', OD.plankAnyWood    , 'X', aRegistry.getItem(10081), 'B', "gt:re-battery1");}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "mfeUnit"               ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "BCB", "BXB", "BMB", 'M', IL.IC2_Machine         , 'X', aRegistry.getItem(10083), 'B', "gt:re-battery3", 'C', OD_CIRCUITS[3]);}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "mfsUnit"               ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "BCB", "BXB", "BMB", 'M', IL.IC2_Machine_Adv     , 'X', aRegistry.getItem(10043), 'B', ST.mkic("mfeUnit", 1), 'C', OD_CIRCUITS[4]);}
		
		CR.remout(IL.IC2_Carbon_Mesh.get(1));
		CR.remout(IL.IC2_Carbon_Fiber.get(1));
		CR.remout(IL.IC2_Machine.get(1));
		CR.remout(IL.IC2_EnergyCrystal.get(1));
		CR.remout(ST.mkic("industrialTnt", 1));
		CR.remout(IL.Cell_Empty.get(1));
		CR.remout(IL.IC2_Fertilizer.get(1));
		CR.remout(IL.IC2_Spray_WeedEx.get(1));
		CR.remout(IL.IC2_Food_Can_Empty.get(1));
		CR.remout(IL.Cell_Universal_Fluid.get(1));
		
		CR.remove(ST.make(Items.lava_bucket, 1, 0), IL.Cell_Empty.get(1));
		CR.remove(ST.make(Items.water_bucket, 1, 0), IL.Cell_Empty.get(1));
		
		for (OreDictMaterial tMat : ANY.Iron.mToThis) {
			ItemStack tStack = OP.casingMachine.mat(tMat, 1);
			if (ST.valid(tStack)) RM.generify(tStack, IL.IC2_Machine.get(1));
		}
		
		CR.shapeless(IL.IC2_Machine.get(1), CR.DEF, new Object[] {OP.casingMachine.dat(ANY.Iron)});
		
		CR.shapeless(ST.mkic("barrel", 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, new Object[] {aRegistry.getItem(32714)});
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.recipereplacements, "ic2_mininglaser", T))
		CR.shaped(ST.mkic("miningLaser", 1), CR.DEF_REV_NCC | CR.DEL_OTHER_SHAPED_RECIPES, "LOE", "PPC", "dTA", 'L', DYE_OREDICTS_LENS[DYE_INDEX_Red], 'O', IL.Comp_Laser_Gas_CO2, 'C', OD_CIRCUITS[3], 'T', OP.screw.dat(MT.Ti), 'P', OP.plate.dat(MT.Ti), 'E', IL.IC2_EnergyCrystal.wild(1), 'A', IL.IC2_Advanced_Alloy);
		CR.shaped(ST.mkic("ironFence", 6), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "XXX", "XXX", " w ", 'X', OP.stick.dat(ANY.Fe));
		
		//====================================================================================================
		if (MD.IC2C.mLoaded) { // IC2 Classic
		//====================================================================================================
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "windMill"          ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "PCP", "WIW", "PMP", 'M', IL.IC2_Machine, 'C', OD_CIRCUITS[1], 'W', OP.wireGt01.dat(ANY.Cu), 'I', OP.stick.dat(MT.IronMagnetic), 'P', OP.plateCurved.dat(MT.Magnalium));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "waterMill"         ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "PCP", "WIW", "PMP", 'M', IL.IC2_Machine, 'C', OD_CIRCUITS[1], 'W', OP.wireGt01.dat(ANY.Cu), 'I', OP.stick.dat(MT.IronMagnetic), 'P', OP.plateCurved.dat(MT.Al));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "solarPanel"        ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "wGd", "WSW", "CMC", 'M', IL.IC2_Machine, 'C', OD_CIRCUITS[1], 'W', OP.cableGt01.dat(ANY.Cu), 'S', OP.plateGem.dat(ANY.Si), 'G', OP.plateGem.dat(MT.Glass));}
		
		try {
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.compressor.getRecipes(), ST.make(MD.IC2, "item.itemPartDCP", 1, 0));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.compressor.getRecipes(), IL.Cell_Air.get(1));
			UT.removeSimpleIC2MachineRecipe(ST.make(Items.snowball, 1, W), ic2.api.recipe.Recipes.compressor.getRecipes(), NI);
		} catch(Throwable e) {
			if (D1) e.printStackTrace(ERR);
		}
		
		RM.ic2_compressor(ST.make(Items.snowball, 4, W), ST.make(Blocks.snow, 1, 0));
		RM.ic2_compressor(ST.make(Blocks.snow, 1, W), ST.make(Blocks.ice, 1, 0));
		RM.ic2_compressor(ST.make(Blocks.ice, 2, W), ST.make(Blocks.packed_ice, 1, 0));
		
		RM.ic2_compressor(OP.ingot          .mat(MT.Cu, 9), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.plate          .mat(MT.Cu, 9), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.plateTriple    .mat(MT.Cu, 3), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockIngot     .mat(MT.Cu, 1), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockPlate     .mat(MT.Cu, 1), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockSolid     .mat(MT.Cu, 1), OP.plateDense.mat(MT.Cu, 1));
		
		RM.ic2_compressor(OP.ingot          .mat(MT.AnnealedCopper, 9), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.plate          .mat(MT.AnnealedCopper, 9), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.plateTriple    .mat(MT.AnnealedCopper, 3), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockIngot     .mat(MT.AnnealedCopper, 1), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockPlate     .mat(MT.AnnealedCopper, 1), OP.plateDense.mat(MT.Cu, 1));
		RM.ic2_compressor(OP.blockSolid     .mat(MT.AnnealedCopper, 1), OP.plateDense.mat(MT.Cu, 1));
		
		CR.shaped(IL.IC2_Machine.get(1), CR.DEF, "III", "I I", "III", 'I', OP.ingot.dat(MT.TECH.RefinedIron));
		CR.remove(IL.IC2_Machine.get(1));
		CR.shapeless(OP.ingot.mat(MT.Fe, 8), new Object[] {IL.IC2_Machine});
		
		RM.Massfab      .addRecipe1(T, 1, 32768, IL.IC2_Scrap                               .get(36), ST.make(MD.IC2, "item.itemMatter", 1, 0));
		RM.Massfab      .addRecipe1(T, 1, 32768, IL.IC2_Scrapbox                            .get( 4), ST.make(MD.IC2, "item.itemMatter", 1, 0));
		RM.Massfab      .addRecipe1(T, 1, 32768, ST.make(MD.IC2, "item.itemScrapMetal", 2, 0), ST.make(MD.IC2, "item.itemMatter", 1, 0));
		
		RM.Shredder     .addRecipe1(T, 16,   16, IL.IC2_Plantball.get(1)        , ST.make(Blocks.dirt, 1, 0));
		RM.Shredder     .addRecipe1(T, 16,   16, 300, ST.mkic("weed", 1)        , IL.IC2_Plantball.get(1));
		RM.Shredder     .addRecipe1(T, 16,   16, 600, ST.make(Blocks.vine, 1, W), IL.IC2_Plantball.get(1));
		
		RM.biomass(IL.IC2_Plantball.get(1), 64);
		
		RM.Squeezer     .addRecipe1(T, 16,   16, ST.make(MD.IC2, "item.itemMatter", 1, 0), NF, FL.UUM.make(1), ZL_IS);
		RM.Coagulator   .addRecipe0(T,  0,   16, FL.UUM.make(1), NF, ST.make(MD.IC2, "item.itemMatter", 1, 0));
		
		RM.Generifier   .addRecipe1(T, F, F, F, F, 0, 1, ST.make(MD.IC2, "item.itemMatter", 1, 0), NF, FL.UUM.make(1), ZL_IS);
		RM.Generifier   .addRecipe0(T, F, F, F, F, 0, 1, FL.UUM.make(1), NF, ST.make(MD.IC2, "item.itemMatter", 1, 0));
		
		RM.Mixer        .addRecipeX(T, 16,   48, new ItemStack[] {IL.IC2_Scrap.get(2), IL.IC2_Fertilizer.get(1), IL.Dye_Bonemeal.get(1) }, FL.Potion_Poison_2   .make( 250), NF, ST.make(MD.IC2, "item.itemSpecialFertilizer"   ,  3, 0));
		RM.Mixer        .addRecipeX(T, 16,  192, new ItemStack[] {IL.IC2_Scrap.get(8), IL.IC2_Fertilizer.get(4), OM.dust(MT.Ca)         }, FL.Potion_Poison_2   .make(1000), NF, ST.make(MD.IC2, "item.itemSpecialFertilizer"   , 12, 0));
		RM.Mixer        .addRecipeX(T, 16,   48, new ItemStack[] {OM.dust(MT.Coal), OM.dust(MT.Clay), OM.dust(MT.Redstone)              }, FL.Water             .make(1000), NF, ST.make(MD.IC2, "constructionFoam"             ,  3, 0));
		RM.Mixer        .addRecipeX(T, 16,   48, new ItemStack[] {OM.dust(MT.Coal), OM.dust(MT.Clay), OM.dust(MT.Redstone)              }, FL.DistW             .make(1000), NF, ST.make(MD.IC2, "constructionFoam"             ,  3, 0));
		RM.Mixer        .addRecipeX(T, 16,   48, new ItemStack[] {OM.dust(MT.Coal), OM.dust(MT.ClayBrown), OM.dust(MT.Redstone)         }, FL.Water             .make(1000), NF, ST.make(MD.IC2, "constructionFoam"             ,  3, 0));
		RM.Mixer        .addRecipeX(T, 16,   48, new ItemStack[] {OM.dust(MT.Coal), OM.dust(MT.ClayBrown), OM.dust(MT.Redstone)         }, FL.DistW             .make(1000), NF, ST.make(MD.IC2, "constructionFoam"             ,  3, 0));
		
		RM.Compressor   .addRecipe1(T, 16,   32, ST.make(MD.IC2, "item.itemScrapMetal", 8, 0), ST.make(MD.IC2, "item.scrapMetalChunk", 1, 0));
		RM.Compressor   .addRecipe1(T, 16,   32, IL.IC2_Plantball.get(1), ST.make(MD.IC2, "item.itemFuelPlantCmpr", 1, 0));
		RM.Compressor   .addRecipe1(T, 16,   32, OM.dust(MT.HydratedCoal), ST.make(MD.IC2, "item.itemFuelCoalCmpr", 1, 0));
		RM.Compressor   .addRecipe1(T, 16,   16, ST.make(MD.IC2, "item.itemOreUran", 1, 0), OM.ingot(MT.U_238));
		RM.Compressor   .addRecipe1(T, 16,   16, ST.make(MD.IC2, "constructionFoam", 1, 0), ST.make(MD.IC2, "item.itemPartPellet", 1, 0));
		
		ItemStack tCoalDust = OM.dust(MT.Coal);
		for (ItemStack tStack : new ItemStack[] {
			ST.make(MD.IC2, "item.itemCellUranEmpty", 1, 0),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 100),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 101),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 102),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 103),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 104),
			ST.make(MD.IC2, "item.itemCellUranEnriched", 1, 0),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 200),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 201),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 202),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 203),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 204)
			}) if (ST.valid(tStack)) {
			ItemStack rStack = CR.get(tStack, tCoalDust);
			if (ST.valid(rStack)) RM.Canner.addRecipe2(T, 16, 16, tStack, tCoalDust, rStack);
		}
		
		boolean temp = T;
		
		for (ItemStack tStack : new ItemStack[] {
			OM.ingot(MT.U_238),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 0),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 1),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 2),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 3),
			ST.make(MD.IC2, "item.itemEnrichedUranStuff", 1, 4),
			ST.make(MD.IC2, "item.itemFuelPlantCmpr", 1, 0),
			ST.make(MD.IC2, "item.itemFuelCoalCmpr", 1, 0)
			}) if (ST.valid(tStack)) {
			ItemStack rStack = CR.get(tStack, IL.Cell_Empty.get(1));
			if (ST.valid(rStack)) {
				RM.Canner.addRecipe2(T, 16, 16, tStack, IL.Cell_Empty.get(1), rStack);
				if (temp) {
					temp = F;
					RM.Canner.addRecipe2(T, 16, 32, OM.ingot(MT.U_235), IL.Cell_Empty.get(2), ST.mul_(2, rStack));
				}
			}
		}
		
		CR.shaped(ST.make(MD.IC2, "item.itemRawObsidianBlade", 1, 0), CR.DEF_REV | CR.DEL_OTHER_RECIPES, "OOO", "OFO", "OOO", 'O', OP.blockDust.dat(MT.Obsidian), 'F', "itemFlint");
		
		//====================================================================================================
		} else { // IC2 Experimental
		//====================================================================================================
		
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST            ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST              ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH       ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING      ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY       ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR      ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST     ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST     ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		for (WeightedRandomChestContent tContent : ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR       ).getItems(RNGSUS)) if (IL.IC2_Iridium_Shard.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Scrapbox.get(1), F, T); else if (IL.IC2_Iridium_Ore.equal(tContent.theItemId, F, T)) ST.set(tContent.theItemId, IL.IC2_Iridium_Shard.get(1), F, T);
		
		try {
			UT.removeSimpleIC2MachineRecipe(ST.make(Items.gunpowder, 1, 0), ic2.api.recipe.Recipes.extractor.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), IL.Cell_Empty.get(1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), IL.IC2_Fuel_Rod_Empty.get(1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), IL.IC2_Food_Can_Empty.get(1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), IL.IC2_ShaftIron.get(1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), IL.IC2_ShaftSteel.get(1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), ST.mkic("ironFence", 1));
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.W, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Au, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Fe, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Cu, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Pb, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Sn, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Steel, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.ingot.mat(MT.Bronze, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Au, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Fe, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Cu, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Pb, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Sn, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Steel, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(OP.plate.mat(MT.Bronze, 1), ic2.api.recipe.Recipes.metalformerExtruding.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.make(Blocks.wool, 1, W), ic2.api.recipe.Recipes.extractor.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(IL.IC2_Energium_Dust.get(1), ic2.api.recipe.Recipes.compressor.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.compressor.getRecipes(), IL.Cell_Air.get(1));
			UT.removeSimpleIC2MachineRecipe(IL.IC2_Fuel_Rod_Empty.get(1), ic2.api.recipe.Recipes.macerator.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedUraniumSimple", 1)  , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedUraniumDual", 1)    , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedUraniumQuad", 1)    , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedMOXSimple", 1)      , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedMOXDual", 1)        , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("reactorDepletedMOXQuad", 1)        , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(ST.mkic("RTGPellets", 1)                    , ic2.api.recipe.Recipes.centrifuge.getRecipes(), NI);
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.centrifuge.getRecipes(), ST.mkic("Uran238", 1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.centrifuge.getRecipes(), ST.mkic("Uran235", 1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.centrifuge.getRecipes(), ST.mkic("smallUran235", 1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.centrifuge.getRecipes(), ST.mkic("smallPlutonium", 1));
			UT.removeSimpleIC2MachineRecipe(NI, ic2.api.recipe.Recipes.centrifuge.getRecipes(), ST.mkic("Plutonium", 1));
			
			Object tCrop;
			UT.Reflection.getField(tCrop = Crops.instance.getCropList()[13], "mDrop").set(tCrop, OP.plantGtBlossom.mat(MT.Fe, 1));
			UT.Reflection.getField(tCrop = Crops.instance.getCropList()[14], "mDrop").set(tCrop, OP.plantGtBlossom.mat(MT.Au, 1));
		} catch(Throwable e) {
			if (D1) e.printStackTrace(ERR);
		}
		
		CR.remout(IL.IC2_Energium_Dust.get(1));
		
		CR.shaped(IL.IC2_Iridium_Ore.get(1), CR.DEF_NAC_NCC, "XXX", "XXX", "XXX", 'X', IL.IC2_Iridium_Shard);
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "windMill"              ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "PwP", "IMI", "PCP", 'M', IL.IC2_Generator  , 'C', OD_CIRCUITS[1], 'P', OP.plateCurved.dat(MT.Magnalium), 'I', OP.plateDouble.dat(ANY.Steel));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "waterMill"             ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "P P", "wMh", "PCP", 'M', IL.IC2_Generator  , 'C', OD_CIRCUITS[1], 'P', OP.plateCurved.dat(MT.Al));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "solarPanel"            ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "CSC", "WMW"       , 'M', IL.IC2_Generator  , 'C', OD_CIRCUITS[2], 'W', OP.cableGt01.dat(ANY.Cu), 'S', OP.plateGem.dat(ANY.Si));}
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "metalformer"           ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "XYZ", "CMC"       , 'M', IL.IC2_Machine , 'C', OD_CIRCUITS[4], 'X', aRegistry.getItem(20122), 'Y', aRegistry.getItem(20201), 'Z', aRegistry.getItem(20152));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "orewashingplant"       ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "CXC", "CMC"       , 'M', IL.IC2_Machine , 'C', OD_CIRCUITS[4], 'X', aRegistry.getItem(20292));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "blockcutter"           ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "CXC", "CMC"       , 'M', IL.IC2_Machine , 'C', OD_CIRCUITS[4], 'X', aRegistry.getItem(20062));}
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "centrifuge"            ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "WWW", "WXW", "CMC", 'M', IL.IC2_Machine , 'C', OD_CIRCUITS[4], 'X', aRegistry.getItem(20082), 'W', OP.wireGt04.dat(ANY.Cu));}
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.harderrecipes, "ic2_" + (tName = "cesuUnit"              ), T)) {CR.shaped(ST.mkic(tName, 1), CR.DEF | CR.DEL_OTHER_SHAPED_RECIPES, "MBM", "BXB", "MBM", 'M', OP.plate.dat(MT.Bronze), 'X', aRegistry.getItem(10082), 'B', "gt:re-battery2");}
		
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.disabledrecipes, "ic2_" + (tName = "fermenter"           ), T)) CR.remout(ST.mkic(tName, 1));
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.disabledrecipes, "ic2_" + (tName = "blastfurnace"        ), T)) CR.remout(ST.mkic(tName, 1));
		if (ConfigsGT.RECIPES.get(ConfigCategories.Recipes.disabledrecipes, "ic2_forgehammer"                        , T)) CR.remout(IL.IC2_ForgeHammer.wild(1));
		
		CR.shaped(ST.make(MD.IC2, "blockreactorvessel"      , 1, 0), CR.DEF_REM_REV_NCC, "PSP", "SPS", "PSP", 'P', OP.plate.dat(MT.Pb), 'S', OP.stone);
		CR.shaped(ST.make(MD.IC2, "blockReactorFluidPort"   , 1, 0), CR.DEF_REM_REV_NCC, "XXX", "XCX", "XXX", 'C', OP.cell.dat(MT.Empty), 'X', ST.make(MD.IC2, "blockreactorvessel", 1, 0));
		CR.shaped(ST.make(MD.IC2, "blockGenerator"          , 1, 7), CR.DEF_REM_REV_NCC, "PCP", "CXC", "PCP", 'C', OP.cell.dat(MT.Empty), 'X', ST.make(MD.IC2, "blockGenerator", 1, 1), 'P', OP.casingSmall.dat(ANY.Iron));
		CR.shaped(ST.make(MD.IC2, "blockHeatGenerator"      , 1, 1), CR.DEF_REM_REV_NCC, "PCP", "CXC", "PCP", 'C', OP.cell.dat(MT.Empty), 'X', ST.make(MD.IC2, "itemRecipePart", 1, 5), 'P', OP.casingSmall.dat(ANY.Iron));
		CR.shaped(ST.make(MD.IC2, "blockKineticGenerator"   , 1, 1), CR.DEF_REM_REV_NCC, "PPP", "XSS", "CPP", 'C', OP.cell.dat(MT.Empty), 'X', ST.make(MD.IC2, "itemRecipePart", 1, 6), 'P', OP.casingSmall.dat(ANY.Iron), 'S', IL.IC2_ShaftIron);
		CR.shaped(ST.make(MD.IC2, "blockMachine3"           , 1, 3), CR.DEF_REM_REV_NCC, "GGG", "G G", "CXC", 'C', OP.cell.dat(MT.Empty), 'X', IL.IC2_Machine, 'G', OP.plateGem.dat(MT.Glass));
		CR.shaped(ST.make(MD.IC2, "itemArmorCFPack"         , 1, 0), CR.DEF_REM_REV_NCC, "PXP", "CPC", "CPC", 'C', OP.cell.dat(MT.Empty), 'X', OD_CIRCUITS[1], 'P', OP.casingSmall.dat(ANY.Iron));
		CR.shaped(ST.make(MD.IC2, "itemArmorJetpack"    , 1, 18001), CR.DEF_REM_REV_NCC, "PXP", "PCP", "R R", 'C', OP.cell.dat(MT.Empty), 'X', OD_CIRCUITS[1], 'P', OP.casingSmall.dat(ANY.Iron), 'R', OD.itemRedstone);
		CR.shaped(ST.make(MD.IC2, "itemFoamSprayer"         , 1, 0), CR.DEF_REM_REV_NCC, "P  ", " P ", " CP", 'C', OP.cell.dat(MT.Empty), 'P', OP.casingSmall.dat(ANY.Iron));
		
		RM.Massfab      .addRecipe1(T, 1, 32768, IL.IC2_Scrap       .get(36), NF, FL.UUM.make(1), ZL_IS);
		RM.Massfab      .addRecipe1(T, 1, 32768, IL.IC2_Scrapbox    .get( 4), NF, FL.UUM.make(1), ZL_IS);
		
		
		for (OreDictMaterial tMat : ANY.Steel.mToThis)
		RM.RollFormer   .addRecipe1(T,256,   16, OP.blockSolid.mat(tMat, 1)                         , IL.IC2_ShaftSteel.get(1));
		for (OreDictMaterial tMat : ANY.Fe.mToThis) if (tMat != MT.Enori)
		RM.RollFormer   .addRecipe1(T,256,   16, OP.blockSolid.mat(tMat, 1)                         , IL.IC2_ShaftIron.get(1));
		
		for (FluidStack tFluid : new FluidStack[] {FL.Water.make(1000), FL.DistW.make(1000)}) {
		RM.Mixer        .addRecipe1(T, 16,   16, ST.mkic("constructionFoamPowder", 1)               , tFluid, MT.ConstructionFoam.liquid(10*U, T), ZL_IS);
		}
		
		RM.Injector     .addRecipe1(T, 16,   16, OM.dust(MT.Lapis, 1*U)                             , FL.DistW.make(1000), FL.Coolant_IC2.make(1000), ZL_IS);
		RM.Injector     .addRecipe1(T, 16,   16, OM.dust(MT.Lapis, 2*U)                             , FL.Water.make(1000), FL.Coolant_IC2.make(1000), ZL_IS);
		
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.U_238)                                  , ST.mkic("Uran238", 1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.U_235)                                  , ST.mkic("Uran235", 1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.Pu)                                     , ST.mkic("Plutonium", 1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.U_235, U9)                              , ST.mkic("smallUran235", 1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.Pu, U9)                                 , ST.mkic("smallPlutonium", 1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.Ir, U9)                                 , IL.IC2_Iridium_Shard.get(1));
		RM.Compressor   .addRecipe1(T, 16,   16, OM.dust(MT.Ir)                                     , IL.IC2_Iridium_Ore.get(1));
		RM.Compressor   .addRecipe1(T, 16,  256, OP.plateGem.mat(MT.Lapis, 9)                       , OP.plateDense.mat(MT.Lapis, 1));
		RM.Compressor   .addRecipe1(T, 16,  256, OP.plateGem.mat(MT.Lazurite, 9)                    , OP.plateDense.mat(MT.Lazurite, 1));
		RM.Compressor   .addRecipe1(T, 16,  256, OP.plateGem.mat(MT.Sodalite, 9)                    , OP.plateDense.mat(MT.Sodalite, 1));
		RM.Compressor   .addRecipe1(T, 16,  768, OP.plate.mat(MT.Obsidian, 9)                       , OP.plateDense.mat(MT.Obsidian, 1));
		
		RM.Shredder     .addRecipe1(T, 16,   16, IL.IC2_Biochaff.get(1)                             , ST.make(Blocks.dirt, 1, 0));
		RM.Shredder     .addRecipe1(T, 16,   16, IL.IC2_Plantball.get(1)                            , IL.IC2_Biochaff.get(1));
		RM.Shredder     .addRecipe1(T, 16,   16, 300, ST.mkic("weed", 1)                            , IL.IC2_Biochaff.get(1));
		RM.Shredder     .addRecipe1(T, 16,   16, 600, ST.make(Blocks.vine, 1, W)                    , IL.IC2_Biochaff.get(1));
		
		RM.biomass(IL.IC2_Biochaff.get(1), 64);
		
		RM.RollBender   .addRecipe1(T, 16,  128, OP.casingSmall.mat(MT.Zr, 2)                       , IL.IC2_Fuel_Rod_Empty.get(1));
		
		RM.Press        .addRecipe2(T, 64,  192, ST.mkic("Uran238",18)                              , ST.mkic("Uran235", 1)         , ST.mkic("UranFuel", 3));
		RM.Press        .addRecipe2(T, 64,   64, ST.mkic("Uran238", 6)                              , ST.mkic("smallUran235", 3)    , ST.mkic("UranFuel", 1));
		RM.Press        .addRecipe2(T, 64,   64, ST.mkic("Uran238", 6)                              , ST.mkic("Plutonium", 3)       , ST.mkic("MOXFuel", 1));
		RM.Press        .addRecipe2(T, 64,  192, OP.ingot.mat(MT.U_238,18)                          , OP.ingot.mat(MT.U_235, 1)     , ST.mkic("UranFuel", 3));
		RM.Press        .addRecipe2(T, 64,   64, OP.ingot.mat(MT.U_238, 6)                          , OP.nugget.mat(MT.U_235, 3)    , ST.mkic("UranFuel", 1));
		RM.Press        .addRecipe2(T, 64,   64, OP.ingot.mat(MT.U_238, 6)                          , OP.ingot.mat(MT.Pu, 3)        , ST.mkic("MOXFuel", 1));
		
		RM.Canner       .addRecipe2(T, 16,   16, ST.mkic("UranFuel", 1)                             , IL.IC2_Fuel_Rod_Empty.get(1)  , ST.mkic("reactorUraniumSimple", 1, 1));
		RM.Canner       .addRecipe2(T, 16,   16, ST.mkic("MOXFuel", 1)                              , IL.IC2_Fuel_Rod_Empty.get(1)  , ST.mkic("reactorMOXSimple", 1, 1));
		
		RM.Centrifuge   .addRecipe1(T, 512, 128, ST.mkic("reactorDepletedUraniumSimple", 1)         , OP.dust.mat(MT.Zr, 1), OP.dust.mat(MT.U_238,  4), OP.dustTiny.mat(MT.Pu, 1));
		RM.Centrifuge   .addRecipe1(T, 512, 256, ST.mkic("reactorDepletedUraniumDual", 1)           , OP.dust.mat(MT.Zr, 2), OP.dust.mat(MT.U_238,  8), OP.dustTiny.mat(MT.Pu, 2), OP.dust.mat(MT.Fe, 1));
		RM.Centrifuge   .addRecipe1(T, 512, 512, ST.mkic("reactorDepletedUraniumQuad", 1)           , OP.dust.mat(MT.Zr, 4), OP.dust.mat(MT.U_238, 16), OP.dustTiny.mat(MT.Pu, 4), OP.dust.mat(MT.Fe, 3), OP.dust.mat(MT.Cu, 2));
		RM.Centrifuge   .addRecipe1(T, 512, 128, ST.mkic("reactorDepletedMOXSimple", 1)             , OP.dust.mat(MT.Zr, 1), OP.dustTiny.mat(MT.Pu, 28));
		RM.Centrifuge   .addRecipe1(T, 512, 256, ST.mkic("reactorDepletedMOXDual", 1)               , OP.dust.mat(MT.Zr, 2), OP.dustTiny.mat(MT.Pu, 56), OP.dust.mat(MT.Fe, 1));
		RM.Centrifuge   .addRecipe1(T, 512, 512, ST.mkic("reactorDepletedMOXQuad", 1)               , OP.dust.mat(MT.Zr, 4), OP.dustTiny.mat(MT.Pu, 64), OP.dust.mat(MT.Fe, 3), OP.dust.mat(MT.Cu, 2), OP.dustTiny.mat(MT.Pu, 48));
		RM.Centrifuge   .addRecipe1(T, 512, 512, ST.mkic("RTGPellets", 1)                           , OP.dust.mat(MT.Fe,54), OP.dust.mat(MT.Pu, 3));
		
		new OreDictListenerEvent_Names() {@Override public void addAllListeners() {
		addListener("plateDenseAnyIron", "plateDenseAnyIronSteel", new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), ST.mkic("smallPlutonium", 27) , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), ST.mkic("Plutonium", 3)       , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.nugget.mat(MT.Pu, 27)      , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.chunkGt.mat(MT.Pu, 12)     , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.ingot.mat(MT.Pu, 3)        , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.dustTiny.mat(MT.Pu, 27)    , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.dustSmall.mat(MT.Pu, 12)   , ST.mkic("RTGPellets", 1));
			RM.Press    .addRecipe2(T, 64,  128, ST.amount(6, aEvent.mStack), OP.dust.mat(MT.Pu, 3)         , ST.mkic("RTGPellets", 1));
		}});
		}};
		
		//====================================================================================================
		} // IC2 in general
		//====================================================================================================
		
		if (IL.ERE_Herbicide.exists())
		RM.pulverizing(IL.ERE_Herbicide.get(1), IL.IC2_Grin_Powder.get(1));
		RM.pulverizing(ST.make(Blocks.red_mushroom, 1, W), IL.IC2_Grin_Powder.get(1));
		RM.pulverizing(ST.make(Items.spider_eye, 1, W), IL.IC2_Grin_Powder.get(2));
		RM.pulverizing(ST.make(Items.clay_ball, 1, W), OM.dust(MT.Clay, U));
		RM.pulverizing(ST.make(Blocks.clay, 1, W), OM.dust(MT.Clay, U*4));
		RM.pulverizing(IL.Clay_Ball_Brown.get(1), OM.dust(MT.ClayBrown, U));
		RM.pulverizing(ST.make(BlocksGT.Diggables, 1, 1), OM.dust(MT.ClayBrown, U*4));
		
		if (IL.IC2_Sapling_Rubber.exists())
		RM.ic2_extractor(IL.IC2_Sapling_Rubber.get(1), OM.ingot(MT.Rubber, 2*U9));
		RM.ic2_extractor(IL.Cell_Air.get(1), IL.Cell_Empty.get(1));
		
		CR.shaped(ST.mkic("copperCableItem" , 2), CR.DEF, "xP", 'P', OP.plate.dat(ANY.Cu));
		CR.shaped(ST.mkic("goldCableItem"   , 4), CR.DEF, "xP", 'P', OP.plate.dat(MT.Au));
		CR.shaped(ST.mkic("ironCableItem"   , 3), CR.DEF, "xP", 'P', OP.plate.dat(ANY.Fe));
		CR.shaped(ST.mkic("tinCableItem"    , 3), CR.DEF, "xP", 'P', OP.plate.dat(MT.Sn));
		
		CR.shaped(ST.mkic("crop", 1), CR.DEF_REM, "SsS", 'S', OP.stick.dat(MT.WoodSealed));
		CR.shaped(ST.mkic("crop", 1), CR.DEF_REM, "SkS", 'S', OP.stick.dat(MT.WoodSealed));
		CR.shaped(IL.IC2_Scaffold.get(4), CR.DEF_REM, "WWW", " S ", "S S", 'W', OD.plankAnyWood, 'S', OP.stick.dat(ANY.Wood));
		
		RM.Autoclave        .addRecipe2(T,  0, 3000, OM.dust(MT.EnergiumRed, U*9), ST.tag(9), FL.Steam.make(96000), FL.DistW.make(450), IL.IC2_EnergyCrystal.get(1));
		
		RM.Boxinator        .addRecipe2(T, 16,   16, IL.IC2_Scrap.get(9), ST.tag(9), IL.IC2_Scrapbox.get(1));
		RM.Unboxinator      .addFakeRecipe(F, new ItemStack[] {IL.IC2_Scrapbox.get(1)}, new ItemStack[] {IL.IC2_Scrapbox.getWithName(1, "Random Drops, see Scrapbox Handler")}, null, ZL_LONG, ZL_FS, ZL_FS, 16, 16, 0);
		
		if (IL.ERE_Herbicide.exists())
		RM.Shredder         .addRecipe1(T, 16,   16, IL.ERE_Herbicide.get(1)                        , IL.IC2_Grin_Powder.get(1));
		RM.Shredder         .addRecipe1(T, 16,   16, ST.make(Blocks.red_mushroom, 1, W)             , IL.IC2_Grin_Powder.get(1));
		RM.Shredder         .addRecipe1(T, 16,   16, ST.make(Items.spider_eye, 1, W)                , IL.IC2_Grin_Powder.get(2));
		
		for (OreDictMaterial tMat : ANY.Diamond.mToThis) if (tMat != MT.Diamantine)
		RM.Press            .addRecipeX(T, 64,  256, new ItemStack[] {IL.IC2_Advanced_Alloy.get(4), OP.plate.mat(MT.Ir, 4), OP.gem.mat(tMat, 1)}, IL.IC2_Iridium_Alloy.get(1));
		RM.Press            .addRecipe2(T, 16,   64, IL.IC2_Compressed_Coal_Ball.get(8), OP.dust.mat(MT.Obsidian, 9), IL.IC2_Compressed_Coal_Chunk.get(1));
		
		RM.Compressor       .addRecipe1(T,256,  256, IL.IC2_Carbon_Mesh.get(1)                          , IL.IC2_Carbon_Plate.get(1));
		RM.Compressor       .addRecipe1(T,256,  512, IL.IC2_Compressed_Coal_Chunk.get(1)                , IL.IC2_Industrial_Diamond.get(1));
		RM.Compressor       .addRecipe1(T, 64,  128, IL.IC2_Coal_Ball.get(1)                            , IL.IC2_Compressed_Coal_Ball.get(1));
		RM.Compressor       .addRecipe1(T, 64,  128, IL.IC2_Mixed_Metal_Ingot.get(1)                    , IL.IC2_Advanced_Alloy.get(1));
		RM.Compressor       .addRecipe1(T, 16,   16, OM.dust(MT.Ir)                                     , ST.mkic("iridiumOre", 1));
		
		RM.RollingMill      .addRecipe1(T, 16,  128, IL.IC2_Mixed_Metal_Ingot.get(1)                    , IL.IC2_Advanced_Alloy.get(1));
		
		RM.RollBender       .addRecipe1(T, 16,  256, OP.plateCurved.mat(MT.Sn, 1)                       , IL.Cell_Empty.get(1));
		RM.RollBender       .addRecipe1(T, 16,   64, OP.casingSmall.mat(MT.Sn, 1)                       , IL.IC2_Food_Can_Empty.get(1));
		
		for (OreDictMaterial tMat : ANY.Cu.mToThis)
		RM.Wiremill         .addRecipe1(T, 16,  128, OP.plate.mat(tMat, 1)                              , ST.mkic("copperCableItem", 3));
		RM.Wiremill         .addRecipe1(T, 16,  128, OP.plate.mat(MT.Sn, 1)                             , ST.mkic("tinCableItem", 4));
		for (OreDictMaterial tMat : ANY.Iron.mToThis)
		RM.Wiremill         .addRecipe1(T, 16,  128, (tMat==MT.Enori?OP.plateGem:OP.plate).mat(tMat, 1) , ST.mkic("ironCableItem", 6));
		RM.Wiremill         .addRecipe1(T, 16,  128, OP.plate.mat(MT.Au, 1)                             , ST.mkic("goldCableItem", 6));
		for (OreDictMaterial tMat : ANY.C.mToThis)
		RM.Wiremill         .addRecipe1(T, 64,  128, OM.dust(tMat, U*4)                                 , IL.IC2_Carbon_Fiber.get(1));
		RM.Wiremill         .addRecipe1(T, 64,  128, OM.dust(MT.Coal, U*8)                              , IL.IC2_Carbon_Fiber.get(1));
		
		for (FluidStack tCFoam : DYED_C_FOAMS)
		RM.Bath             .addRecipe1(T,  0,   64, IL.IC2_Scaffold_Iron.get(1)                        , tCFoam, NF, IL.IC2_Wall_Reinforced.get(1));
		RM.Bath             .addRecipe1(T,  0,   64, IL.IC2_Scaffold_Iron.get(1)                        , MT.ConstructionFoam.liquid(U, T), NF, IL.IC2_Wall_Reinforced.get(1));
		RM.Bath             .addRecipe1(T,  0,   16, ST.mkic("dynamite", 1)                             , FL.Glue.make(125), NF, ST.mkic("stickyDynamite", 1));
		
		if (IL.ERE_Herbicide.exists())
		RM.Canner           .addRecipe2(T, 16,   16, IL.ERE_Herbicide.get(1)                            , IL.Spray_Empty.get(1)                 , IL.IC2_Spray_WeedEx.get(1));
		RM.Canner           .addRecipe2(T, 16,   16, IL.IC2_Grin_Powder.get(1)                          , IL.Spray_Empty.get(1)                 , IL.IC2_Spray_WeedEx.get(1));
		RM.Canner           .addRecipe1(T, 16,   16, IL.Spray_Empty.get(1)                              , FL.Potion_Poison_2.make(250)      , NF, IL.IC2_Spray_WeedEx.get(1));
		
		RM.Loom             .addRecipe2(T, 64,  128, ST.tag(0)                                          , IL.IC2_Carbon_Fiber.get(2)            , IL.IC2_Carbon_Mesh.get(1));
		
		if (IL.IC2_Sapling_Rubber.exists())
		RM.Squeezer         .addRecipe1(T, 16,   64, IL.IC2_Sapling_Rubber.get(1)                       , NF, FL.Latex.make(L/ 4), NI);
		if (IL.IC2_Leaves_Rubber.exists())
		RM.Squeezer         .addRecipe1(T, 16,   64, IL.IC2_Leaves_Rubber.get(1)                        , NF, FL.Latex.make(L/72), NI);
		
		RM.Electrolyzer     .addRecipe2(T, 16, 1000, ST.tag(0), IL.Cell_Water.get(1)                    , ST.mkic("electrolyzedWaterCell", 1));
		
		RM.Injector         .addRecipe1(T, 16,   16, IL.Cell_Empty.get(1), FL.Water.make(1000)          , NF, ST.mkic("hydratingCell", 1));
		RM.Injector         .addRecipe1(T, 16,   16, IL.Cell_Empty.get(1), FL.DistW.make(1000)          , NF, ST.mkic("hydratingCell", 1));
		
		RM.generify(IL.Circuit_Basic.get(1)     , ST.mkic("electronicCircuit", 1));
		RM.generify(IL.Circuit_Advanced.get(1)  , ST.mkic("advancedCircuit", 1));
		
		RM.Mixer            .addRecipe2(T, 16,   32, ST.make(Blocks.tnt, 1, W)                          , OM.dust(MT.Na2SO3, U*1), ST.mkic("industrialTnt", 1));
		RM.Mixer            .addRecipe2(T, 16,   32, ST.make(Items.flint, 1, W)                         , OM.dust(MT.Coal, U*8), IL.IC2_Coal_Ball.get(1));
		
		for (FluidStack tFluid : new FluidStack[] {FL.Water.make(1000), FL.DistW.make(1000)}) {
		
		RM.Mixer            .addRecipe1(T, 16,   16, IL.IC2_Grin_Powder.get(1)                          , UT.Fluids.mul(tFluid, 1, 4, T), FL.Potion_Poison_2.make(250), ZL_IS);
		
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.CaCO3                   ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.CaCO3                   ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.CaCO3                   ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   16, OM.dust(MT.CaCO3                   ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(1));
		RM.Mixer            .addRecipe2(T, 16,   16, OM.dust(MT.CaCO3                   ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(1));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.Ca                      ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.Ca                      ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.Ca                      ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.Ca                      ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.Ca                      ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.Apatite                 ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.Apatite                 ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.Apatite                 ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		if (!MD.FR.mLoaded) {
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.Apatite                 ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.Apatite                 ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		}
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.OREMATS.Glauconite      ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.OREMATS.Glauconite      ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.OREMATS.Glauconite      ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.OREMATS.Glauconite      ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.OREMATS.Glauconite      ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.OREMATS.GlauconiteSand  ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.OREMATS.GlauconiteSand  ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.OREMATS.GlauconiteSand  ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.OREMATS.GlauconiteSand  ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.OREMATS.GlauconiteSand  ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.NaHSO4                  ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.NaHSO4                  ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.NaHSO4                  ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.NaHSO4                  ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.NaHSO4                  ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.KHSO4                   ), OM.dust(MT.S             ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   64, OM.dust(MT.KHSO4                   ), OM.dust(MT.Phosphorus    ), IL.IC2_Fertilizer.get(4));
		RM.Mixer            .addRecipe2(T, 16,   48, OM.dust(MT.KHSO4                   ), OM.dust(MT.PO4           ), IL.IC2_Fertilizer.get(3));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.KHSO4                   ), OM.dust(MT.Ash       ,3*U), IL.IC2_Fertilizer.get(2));
		RM.Mixer            .addRecipe2(T, 16,   32, OM.dust(MT.KHSO4                   ), OM.dust(MT.DarkAsh       ), IL.IC2_Fertilizer.get(2));
		}
		
		for (OreDictMaterial tMat : ANY.Iron.mToThis) if (tMat != MT.Enori) {
		RM.Welder           .addRecipeX(T, 16,  128, new ItemStack[] {OP.ingot.mat(tMat, 1), OP.ingot.mat(MT.Bronze, 1), OP.ingot.mat(MT.Sn, 1)}, IL.IC2_Mixed_Metal_Ingot.get(1));
		RM.Welder           .addRecipeX(T, 16,  256, new ItemStack[] {OP.plate.mat(tMat, 1), OP.plate.mat(MT.Bronze, 1), OP.plate.mat(MT.Sn, 1)}, IL.IC2_Mixed_Metal_Ingot.get(1));
		}
		
		new OreDictListenerEvent_Names() {@Override public void addAllListeners() {
		addListener("blockSolidObsidian", "blockDustObsidian", new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.Press        .addRecipe2(T, 16,   64, IL.IC2_Compressed_Coal_Ball.get(8), aEvent.mStack, IL.IC2_Compressed_Coal_Chunk.get(1));
		}});
		addListener("cropIvy", new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.pulverizing(aEvent.mStack, IL.IC2_Grin_Powder.get(1));
		}});
		addListener("flower", "itemPlantRemains", new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.ic2_compressor(ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(8, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		addListener(new String[] {"baleGrass", "baleGrassDry", "baleGrassMoldy", "baleGrassRotten"}, new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.ic2_compressor(ST.amount( 1, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(1, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		}};
		
		OP.treeSapling.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.ic2_compressor(ST.amount( 4, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(4, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		OP.treeLeaves.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			RM.ic2_compressor(ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(8, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		OP.crop.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			OreDictItemData tData = OM.data(aEvent.mStack);
			if (tData == null || !tData.hasValidPrefixMaterialData()) {
			RM.ic2_compressor(ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(8, aEvent.mStack), IL.IC2_Plantball.get(1));
			}
		}});
		
		OP.plantGtBerry.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			if (aEvent.mMaterial.contains(TD.Atomic.ANTIMATTER)) return;
			RM.ic2_compressor(ST.amount(16, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount(16, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		OP.plantGtBlossom.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			if (aEvent.mMaterial.contains(TD.Atomic.ANTIMATTER)) return;
			RM.ic2_compressor(ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		OP.plantGtTwig.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			if (aEvent.mMaterial.contains(TD.Atomic.ANTIMATTER)) return;
			RM.ic2_compressor(ST.amount( 4, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount( 4, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
		OP.plantGtWart.addListener(new IOreDictListenerEvent() {@Override public void onOreRegistration(OreDictRegistrationContainer aEvent) {
			if (aEvent.mMaterial.contains(TD.Atomic.ANTIMATTER)) return;
			RM.ic2_compressor(ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
			RM.Compressor.addRecipe1(T, 16, 16, ST.amount( 8, aEvent.mStack), IL.IC2_Plantball.get(1));
		}});
	}
}
