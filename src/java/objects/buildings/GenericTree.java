package objects.buildings;

import setup.player.Player;
import setup.register.Registers;
import setup.world.Tile;

import java.util.stream.Stream;

public class GenericTree extends GeneratableBuilding {
    public GenericTree() {
        super();
    }

    @Override
    public boolean doesGenerate(Tile host,int seedContract) {
        if(Stream.of("jungle","forest","taiga").anyMatch(e-> e.equals(host.getName()))){
            return seedContract<250;
        }else if(Stream.of("plains","savanna","tundra","swamp").anyMatch(e->e.equals(host.getName()))){
            return seedContract<2;
        }else{
            return false;
        }
    }


    @Override
    public void onPrimaryInteract(Player p) {

        p.getInventory().addToInv(Registers.WOOD.get(),5);
        this.destroy();
    }

    @Override
    public void onSecondaryInteract(Player p) {

    }

    @Override
    public boolean doCollide() {
        return false;
    }


}
