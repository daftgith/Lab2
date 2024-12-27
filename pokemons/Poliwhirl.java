package pokemons;

import moves.BodySlam;
import moves.Confide;
import moves.Hypnosis;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Pokemon {
    public Poliwhirl(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);

        //attacks
        Confide confide = new Confide(0, 0);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        BodySlam bodySlam = new BodySlam(85, 100);
        super.setMove(confide, hypnosis, bodySlam);
    }
}
