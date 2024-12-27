package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }


    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        if(0.7 > Math.random()){
            Effect raiseSpecialAttack = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
            p.addEffect(raiseSpecialAttack);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
