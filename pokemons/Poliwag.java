package pokemons;

import moves.Confide;
import moves.Hypnosis;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon{
    public Poliwag(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);

        //attacks
        Confide confide = new Confide(0, 0);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        super.setMove(confide, hypnosis);
    }
}
