package pokemons;

import moves.BodySlam;
import moves.Confide;
import moves.FocusBlast;
import moves.Hypnosis;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Politoed extends Pokemon {
    public Politoed(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(90, 75, 75, 90, 100, 70);

        //attacks
        Confide confide = new Confide(0, 0);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        BodySlam bodySlam = new BodySlam(85, 100);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        super.setMove(confide, hypnosis, bodySlam, focusBlast);
    }
}
