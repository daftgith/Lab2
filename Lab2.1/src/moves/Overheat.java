package moves;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect lowSpecialAttack = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(lowSpecialAttack);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
