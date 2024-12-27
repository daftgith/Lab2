package moves;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl(double pow, double acc){
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect lowSpecialAttack = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(lowSpecialAttack);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
