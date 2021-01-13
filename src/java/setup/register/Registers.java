package setup.register;

import objects.buildings.GenericTree;
import setup.crafting.Knowledge;
import setup.world.Generatable;
import setup.world.Player;
import setup.world.Tile;
import setup.worldgen.Biome;

public class Registers {
    public static Registry<Tile> BIO = new Registry<Tile>();
    public static Registry<Generatable> GEN = new Registry<Generatable>();
    public static Registry<Knowledge> KWL = new Registry<Knowledge>();



    //entries go here.
    // public static final RegistryEntry<ItemWood> WOODITEM = ITM.register(ItemWood::new,"wood");
    public static final RegistryEntry<Tile> DESERT = BIO.register(()-> new Tile("desert"), "desert");
    public static final RegistryEntry<Tile> FOREST = BIO.register(()-> new Tile("forest"), "forest");
    public static final RegistryEntry<Tile> JUNGLE = BIO.register(()-> new Tile("jungle"), "jungle");
    public static final RegistryEntry<Tile> PLAINS = BIO.register(()-> new Tile("plains"), "plains");
    public static final RegistryEntry<Tile> SNOW = BIO.register(()-> new Tile("snow"), "snow");
    public static final RegistryEntry<Tile> SWAMP = BIO.register(()-> new Tile("swamp"), "swamp");
    public static final RegistryEntry<Tile> TUNDRA = BIO.register(()-> new Tile("tundra"), "tundra");
    public static final RegistryEntry<Tile> TAIGA = BIO.register(()-> new Tile("taiga"), "taiga");
    public static final RegistryEntry<Tile> SAVANNA = BIO.register(()-> new Tile("savanna"), "savanna");




}
