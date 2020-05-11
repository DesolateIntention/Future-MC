package thedarkcolour.futuremc.registry

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.OreDictionary
import net.minecraftforge.registries.IForgeRegistry
import thedarkcolour.core.item.ItemDebugger
import thedarkcolour.core.item.ItemModeled
import thedarkcolour.core.item.ItemModeledBlock
import thedarkcolour.core.util.addListener
import thedarkcolour.futuremc.FutureMC
import thedarkcolour.futuremc.config.FConfig
import thedarkcolour.futuremc.entity.fish.cod.EntityCod
import thedarkcolour.futuremc.entity.fish.pufferfish.EntityPufferfish
import thedarkcolour.futuremc.entity.fish.salmon.EntitySalmon
import thedarkcolour.futuremc.entity.fish.tropical.EntityTropicalFish
import thedarkcolour.futuremc.item.*

@Suppress("MemberVisibilityCanBePrivate", "HasPlatformType", "DuplicatedCode")
object FItems {
    val DYES = ItemDye()
    val TRIDENT = ItemTrident()
    val BANNER_PATTERN = ItemBannerPattern()
    val CROSSBOW = ItemCrossbow()
    val HONEYCOMB = ItemModeled("honeycomb").setCreativeTab(if (FConfig.useVanillaCreativeTabs) CreativeTabs.MISC else FutureMC.GROUP)
    val HONEY_BOTTLE = HoneyBottleItem()
    val SWEET_BERRIES = SweetBerriesItem()
    val SUSPICIOUS_STEW = SuspiciousStewItem()
    val BAMBOO = BambooItem()
    val PUFFERFISH_BUCKET = ItemFishBucket("pufferfish_bucket", ::EntityPufferfish)
    val SALMON_BUCKET = ItemFishBucket("salmon_bucket", ::EntitySalmon)
    val COD_BUCKET = ItemFishBucket("cod_bucket", ::EntityCod)
    val TROPICAL_FISH_BUCKET = ItemFishBucket("tropical_fish_bucket", ::EntityTropicalFish)
    val DEBUGGER = ItemDebugger()
    val NAUTILUS_SHELL = ItemModeled("nautilus_shell").setCreativeTab(if (FConfig.useVanillaCreativeTabs) CreativeTabs.MISC else FutureMC.GROUP)

    val LANTERN = ItemModeledBlock(FBlocks.LANTERN)
    val STONECUTTER = ItemModeledBlock(FBlocks.STONECUTTER)
    val BARREL = ItemModeledBlock(FBlocks.BARREL)
    val SMOKER = ItemModeledBlock(FBlocks.SMOKER)
    val BLAST_FURNACE = ItemModeledBlock(FBlocks.BLAST_FURNACE)
    val LOOM = ItemModeledBlock(FBlocks.LOOM)
    val FLETCHING_TABLE = ItemModeledBlock(FBlocks.FLETCHING_TABLE)
    val SMITHING_TABLE = ItemModeledBlock(FBlocks.SMITHING_TABLE)
    val CARTOGRAPHY_TABLE = ItemModeledBlock(FBlocks.CARTOGRAPHY_TABLE)
    val GRINDSTONE = ItemModeledBlock(FBlocks.GRINDSTONE)
    val COMPOSTER = ItemModeledBlock(FBlocks.COMPOSTER)
    val BELL = ItemModeledBlock(FBlocks.BELL)
    val HONEY_BLOCK = ItemModeledBlock(FBlocks.HONEY_BLOCK)
    val HONEYCOMB_BLOCK = ItemModeledBlock(FBlocks.HONEYCOMB_BLOCK)
    val LILY_OF_THE_VALLEY = ItemModeledBlock(FBlocks.LILY_OF_THE_VALLEY)
    val CORNFLOWER = ItemModeledBlock(FBlocks.CORNFLOWER)
    val WITHER_ROSE = ItemModeledBlock(FBlocks.WITHER_ROSE)
    val CAMPFIRE = ItemModeledBlock(FBlocks.CAMPFIRE)
    val BEE_NEST = ItemModeledBlock(FBlocks.BEE_NEST)
    val BEEHIVE = ItemModeledBlock(FBlocks.BEEHIVE)
    val STRIPPED_ACACIA_LOG = ItemModeledBlock(FBlocks.STRIPPED_ACACIA_LOG)
    val STRIPPED_JUNGLE_LOG = ItemModeledBlock(FBlocks.STRIPPED_JUNGLE_LOG)
    val STRIPPED_BIRCH_LOG = ItemModeledBlock(FBlocks.STRIPPED_BIRCH_LOG)
    val STRIPPED_OAK_LOG = ItemModeledBlock(FBlocks.STRIPPED_OAK_LOG)
    val STRIPPED_SPRUCE_LOG = ItemModeledBlock(FBlocks.STRIPPED_SPRUCE_LOG)
    val STRIPPED_DARK_OAK_LOG = ItemModeledBlock(FBlocks.STRIPPED_DARK_OAK_LOG)
    val BRICK_WALL = ItemModeledBlock(FBlocks.BRICK_WALL)
    val GRANITE_WALL = ItemModeledBlock(FBlocks.GRANITE_WALL)
    val ANDESITE_WALL = ItemModeledBlock(FBlocks.ANDESITE_WALL)
    val DIORITE_WALL = ItemModeledBlock(FBlocks.DIORITE_WALL)
    val SANDSTONE_WALL = ItemModeledBlock(FBlocks.SANDSTONE_WALL)
    val RED_SANDSTONE_WALL = ItemModeledBlock(FBlocks.RED_SANDSTONE_WALL)
    val STONE_BRICK_WALL = ItemModeledBlock(FBlocks.STONE_BRICK_WALL)
    val MOSSY_STONE_BRICK_WALL = ItemModeledBlock(FBlocks.MOSSY_STONE_BRICK_WALL)
    val NETHER_BRICK_WALL = ItemModeledBlock(FBlocks.NETHER_BRICK_WALL)
    val RED_NETHER_BRICK_WALL = ItemModeledBlock(FBlocks.RED_NETHER_BRICK_WALL)
    val END_STONE_BRICK_WALL = ItemModeledBlock(FBlocks.END_STONE_BRICK_WALL)
    val PRISMARINE_WALL = ItemModeledBlock(FBlocks.PRISMARINE_WALL)
    val SMOOTH_STONE = ItemModeledBlock(FBlocks.SMOOTH_STONE)
    val SMOOTH_QUARTZ = ItemModeledBlock(FBlocks.SMOOTH_QUARTZ)
    val BLUE_ICE = ItemModeledBlock(FBlocks.BLUE_ICE)
    val STRIPPED_ACACIA_WOOD = ItemModeledBlock(FBlocks.STRIPPED_ACACIA_WOOD)
    val STRIPPED_JUNGLE_WOOD = ItemModeledBlock(FBlocks.STRIPPED_JUNGLE_WOOD)
    val STRIPPED_BIRCH_WOOD = ItemModeledBlock(FBlocks.STRIPPED_BIRCH_WOOD)
    val STRIPPED_OAK_WOOD = ItemModeledBlock(FBlocks.STRIPPED_OAK_WOOD)
    val STRIPPED_SPRUCE_WOOD = ItemModeledBlock(FBlocks.STRIPPED_SPRUCE_WOOD)
    val STRIPPED_DARK_OAK_WOOD = ItemModeledBlock(FBlocks.STRIPPED_DARK_OAK_WOOD)
    val ACACIA_WOOD = ItemModeledBlock(FBlocks.ACACIA_WOOD)
    val JUNGLE_WOOD = ItemModeledBlock(FBlocks.JUNGLE_WOOD)
    val BIRCH_WOOD = ItemModeledBlock(FBlocks.BIRCH_WOOD)
    val OAK_WOOD = ItemModeledBlock(FBlocks.OAK_WOOD)
    val SPRUCE_WOOD = ItemModeledBlock(FBlocks.SPRUCE_WOOD)
    val DARK_OAK_WOOD = ItemModeledBlock(FBlocks.DARK_OAK_WOOD)
    val ACACIA_TRAPDOOR = ItemModeledBlock(FBlocks.ACACIA_TRAPDOOR)
    val JUNGLE_TRAPDOOR = ItemModeledBlock(FBlocks.JUNGLE_TRAPDOOR)
    val BIRCH_TRAPDOOR = ItemModeledBlock(FBlocks.BIRCH_TRAPDOOR)
    val SPRUCE_TRAPDOOR = ItemModeledBlock(FBlocks.SPRUCE_TRAPDOOR)
    val DARK_OAK_TRAPDOOR = ItemModeledBlock(FBlocks.DARK_OAK_TRAPDOOR)
    val SOUL_FIRE_LANTERN = ItemModeledBlock(FBlocks.SOUL_FIRE_LANTERN)
    val SOUL_FIRE_TORCH = ItemModeledBlock(FBlocks.SOUL_FIRE_TORCH)
    val SOUL_SOIL = ItemModeledBlock(FBlocks.SOUL_SOIL)

    fun registerItems(items: IForgeRegistry<Item>) {
        if (FConfig.villageAndPillage.dyes) items.register(DYES)
        if (FConfig.updateAquatic.trident) items.register(TRIDENT)
        if (FConfig.villageAndPillage.loom.enabled) items.register(BANNER_PATTERN)
        if (FConfig.villageAndPillage.crossbow) {
            items.register(CROSSBOW)
            addListener(CROSSBOW::update)
        }
        if (FConfig.buzzyBees.bee.enabled) items.register(HONEYCOMB)
        if (FConfig.buzzyBees.bee.enabled) items.register(HONEY_BOTTLE)
        if (FConfig.villageAndPillage.sweetBerryBush.enabled) items.register(SWEET_BERRIES)
        if (FConfig.villageAndPillage.suspiciousStew) items.register(SUSPICIOUS_STEW)
        if (FConfig.villageAndPillage.bamboo.enabled) items.register(BAMBOO)
        if (FConfig.updateAquatic.fish.pufferfish.enabled) items.register(PUFFERFISH_BUCKET)
        if (FConfig.updateAquatic.fish.salmon.enabled) items.register(SALMON_BUCKET)
        if (FConfig.updateAquatic.fish.cod.enabled) items.register(COD_BUCKET)
        if (FConfig.updateAquatic.fish.tropicalFish.enabled) items.register(TROPICAL_FISH_BUCKET)
        if (FConfig.updateAquatic.nautilusShell) items.register(NAUTILUS_SHELL)

        if (FutureMC.DEBUG) items.register(DEBUGGER)

        if (FConfig.villageAndPillage.lantern) items.register(LANTERN)
        if (FConfig.villageAndPillage.stonecutter.enabled) items.register(STONECUTTER)
        if (FConfig.villageAndPillage.barrel) items.register(BARREL)
        if (FConfig.villageAndPillage.smoker) items.register(SMOKER)
        if (FConfig.villageAndPillage.blastFurnace) items.register(BLAST_FURNACE)
        if (FConfig.villageAndPillage.loom.enabled) items.register(LOOM)
        if (FConfig.villageAndPillage.fletchingTable) items.register(FLETCHING_TABLE)
        if (FConfig.villageAndPillage.smithingTable.enabled) items.register(SMITHING_TABLE)
        if (FConfig.villageAndPillage.cartographyTable.enabled) items.register(CARTOGRAPHY_TABLE)
        if (FConfig.villageAndPillage.grindstone.enabled) items.register(GRINDSTONE)
        if (FConfig.villageAndPillage.composter) items.register(COMPOSTER)
        if (FConfig.villageAndPillage.bell) items.register(BELL)
        if (FConfig.buzzyBees.honeyBlock.enabled) items.register(HONEY_BLOCK)
        if (FConfig.buzzyBees.honeycombBlock) items.register(HONEYCOMB_BLOCK)
        if (FConfig.villageAndPillage.lilyOfTheValley.enabled) items.register(LILY_OF_THE_VALLEY)
        if (FConfig.villageAndPillage.cornflower.enabled) items.register(CORNFLOWER)
        if (FConfig.villageAndPillage.witherRose.enabled) items.register(WITHER_ROSE)
        if (FConfig.villageAndPillage.campfire.enabled) items.register(CAMPFIRE)
        if (FConfig.buzzyBees.bee.enabled) items.register(BEE_NEST)
        if (FConfig.buzzyBees.bee.enabled) items.register(BEEHIVE)
        if (FConfig.updateAquatic.strippedLogs.acacia) items.register(STRIPPED_ACACIA_LOG)
        if (FConfig.updateAquatic.strippedLogs.jungle) items.register(STRIPPED_JUNGLE_LOG)
        if (FConfig.updateAquatic.strippedLogs.birch) items.register(STRIPPED_BIRCH_LOG)
        if (FConfig.updateAquatic.strippedLogs.oak) items.register(STRIPPED_OAK_LOG)
        if (FConfig.updateAquatic.strippedLogs.spruce) items.register(STRIPPED_SPRUCE_LOG)
        if (FConfig.updateAquatic.strippedLogs.darkOak) items.register(STRIPPED_DARK_OAK_LOG)
        if (FConfig.villageAndPillage.newWalls.brick) items.register(BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.granite) items.register(GRANITE_WALL)
        if (FConfig.villageAndPillage.newWalls.andesite) items.register(ANDESITE_WALL)
        if (FConfig.villageAndPillage.newWalls.diorite) items.register(DIORITE_WALL)
        if (FConfig.villageAndPillage.newWalls.sandstone) items.register(SANDSTONE_WALL)
        if (FConfig.villageAndPillage.newWalls.redSandstone) items.register(RED_SANDSTONE_WALL)
        if (FConfig.villageAndPillage.newWalls.stoneBrick) items.register(STONE_BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.mossyStone) items.register(MOSSY_STONE_BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.netherBrick) items.register(NETHER_BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.redNetherBrick) items.register(RED_NETHER_BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.endStoneBrick) items.register(END_STONE_BRICK_WALL)
        if (FConfig.villageAndPillage.newWalls.prismarine) items.register(PRISMARINE_WALL)
        if (FConfig.villageAndPillage.smoothStone) items.register(SMOOTH_STONE)
        if (FConfig.villageAndPillage.smoothQuartz) items.register(SMOOTH_QUARTZ)
        if (FConfig.updateAquatic.blueIce) items.register(BLUE_ICE)
        if (FConfig.updateAquatic.wood.strippedAcacia) items.register(STRIPPED_ACACIA_WOOD)
        if (FConfig.updateAquatic.wood.strippedJungle) items.register(STRIPPED_JUNGLE_WOOD)
        if (FConfig.updateAquatic.wood.strippedBirch) items.register(STRIPPED_BIRCH_WOOD)
        if (FConfig.updateAquatic.wood.strippedOak) items.register(STRIPPED_OAK_WOOD)
        if (FConfig.updateAquatic.wood.strippedSpruce) items.register(STRIPPED_SPRUCE_WOOD)
        if (FConfig.updateAquatic.wood.strippedDarkOak) items.register(STRIPPED_DARK_OAK_WOOD)
        if (FConfig.updateAquatic.wood.acacia) items.register(ACACIA_WOOD)
        if (FConfig.updateAquatic.wood.jungle) items.register(JUNGLE_WOOD)
        if (FConfig.updateAquatic.wood.birch) items.register(BIRCH_WOOD)
        if (FConfig.updateAquatic.wood.oak) items.register(OAK_WOOD)
        if (FConfig.updateAquatic.wood.spruce) items.register(SPRUCE_WOOD)
        if (FConfig.updateAquatic.wood.darkOak) items.register(DARK_OAK_WOOD)
        if (FConfig.villageAndPillage.newTrapdoors.acacia) items.register(ACACIA_TRAPDOOR)
        if (FConfig.villageAndPillage.newTrapdoors.jungle) items.register(JUNGLE_TRAPDOOR)
        if (FConfig.villageAndPillage.newTrapdoors.birch) items.register(BIRCH_TRAPDOOR)
        if (FConfig.villageAndPillage.newTrapdoors.spruce) items.register(SPRUCE_TRAPDOOR)
        if (FConfig.villageAndPillage.newTrapdoors.darkOak) items.register(DARK_OAK_TRAPDOOR)

        if (FConfig.netherUpdate.soulFireLantern) items.register(SOUL_FIRE_LANTERN)
        if (FConfig.netherUpdate.soulFireTorch) items.register(SOUL_FIRE_TORCH)
        if (FConfig.netherUpdate.soulSoil) items.register(SOUL_SOIL)

        if (FConfig.netherUpdate.chain)
            items.register(ItemModeledBlock(FBlocks.CHAIN))

        //register(ItemSeagrass(), FConfig.updateAquatic.seagrass)

        if (FConfig.villageAndPillage.dyes) {
            OreDictionary.registerOre("dyeWhite", ItemStack(DYES, 1, 0))
            OreDictionary.registerOre("dyeBlue", ItemStack(DYES, 1, 1))
            OreDictionary.registerOre("dyeBrown", ItemStack(DYES, 1, 2))
            OreDictionary.registerOre("dyeBlack", ItemStack(DYES, 1, 3))
        }

        if (FConfig.villageAndPillage.sweetBerryBush.enabled) {
            OreDictionary.registerOre("seedSweetBerry", SWEET_BERRIES)
            OreDictionary.registerOre("cropSweetBerry", SWEET_BERRIES)
        }

        if (FConfig.villageAndPillage.bamboo.enabled) {
            OreDictionary.registerOre("cropBamboo", BAMBOO)
        }


        if (FConfig.updateAquatic.strippedLogs.acacia)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_ACACIA_LOG)
        if (FConfig.updateAquatic.strippedLogs.jungle)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_JUNGLE_LOG)
        if (FConfig.updateAquatic.strippedLogs.birch)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_BIRCH_LOG)
        if (FConfig.updateAquatic.strippedLogs.oak)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_OAK_LOG)
        if (FConfig.updateAquatic.strippedLogs.spruce)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_SPRUCE_LOG)
        if (FConfig.updateAquatic.strippedLogs.darkOak)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_DARK_OAK_LOG)

        if (FConfig.updateAquatic.wood.strippedAcacia)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_ACACIA_WOOD)
        if (FConfig.updateAquatic.wood.strippedJungle)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_JUNGLE_WOOD)
        if (FConfig.updateAquatic.wood.strippedBirch)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_BIRCH_WOOD)
        if (FConfig.updateAquatic.wood.strippedOak)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_OAK_WOOD)
        if (FConfig.updateAquatic.wood.strippedSpruce)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_SPRUCE_WOOD)
        if (FConfig.updateAquatic.wood.strippedDarkOak)
            OreDictionary.registerOre("logWood", FBlocks.STRIPPED_DARK_OAK_WOOD)
        if (FConfig.updateAquatic.wood.acacia)
            OreDictionary.registerOre("logWood", FBlocks.ACACIA_WOOD)
        if (FConfig.updateAquatic.wood.jungle)
            OreDictionary.registerOre("logWood", FBlocks.JUNGLE_WOOD)
        if (FConfig.updateAquatic.wood.oak)
            OreDictionary.registerOre("logWood", FBlocks.BIRCH_WOOD)
        if (FConfig.updateAquatic.wood.spruce)
            OreDictionary.registerOre("logWood", FBlocks.OAK_WOOD)
        if (FConfig.updateAquatic.wood.darkOak)
            OreDictionary.registerOre("logWood", FBlocks.SPRUCE_WOOD)
    }
}