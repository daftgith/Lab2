package pokemons;

import moves.ChargeBeam;
import moves.Confide;
import moves.Psychic;
import moves.Snarl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Electrike extends Pokemon {
    public Electrike(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(40, 45, 40, 65, 40, 65);

        

        //attacks
        Confide confide = new Confide(0, 0);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        Snarl snarl = new Snarl(55, 95);
        Psychic psychic = new Psychic(90, 100);
        super.setMove(confide, chargeBeam, snarl, psychic);

    }
}
