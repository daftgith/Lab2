package moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(0.1 > Math.random()) {
            Effect lowSpecialDef = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(lowSpecialDef);
        }
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

