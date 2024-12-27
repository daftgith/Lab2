package pokemons;

import moves.ChargeBeam;
import moves.Confide;
import moves.Overheat;
import moves.Snarl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Manectric extends Pokemon {
    public Manectric(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(70, 75, 60, 105, 60, 105);

        //attacks
        Confide confide = new Confide(0, 0);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        Snarl snarl = new Snarl(55, 95);
        Overheat overheat = new Overheat(130, 90);
        super.setMove(confide, chargeBeam, snarl, overheat);
    }
}
