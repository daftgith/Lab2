package pokemons;

import moves.DoubleTeam;
import moves.EarthPower;
import moves.LavaPlum;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heatran extends Pokemon {
    public Heatran(String name, int level){
        super(name, level);
        super.setType(Type.FIRE, Type.STEEL);
        super.setStats(91, 90, 106, 130, 106, 77);

        //attacks
        LavaPlum lavaPlum = new LavaPlum(80, 100);
        Swagger swagger = new Swagger(0, 85);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        EarthPower earthPower = new EarthPower(90, 100);
        super.setMove(lavaPlum, swagger, doubleTeam, earthPower);

    }

}
