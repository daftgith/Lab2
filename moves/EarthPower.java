package moves;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    public EarthPower(double pow, double acc){
        super(Type.GROUND, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(0.1 > Math.random()){
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
