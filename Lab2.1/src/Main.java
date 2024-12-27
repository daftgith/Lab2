import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();


        Heatran heatran = new Heatran("heatran", 1);
        Electrike electrike = new Electrike("electrike", 1);
        Manectric manectric = new Manectric("manectric", 1);
        Politoed politoed = new Politoed("politoed", 1);
        Poliwag poliwag = new Poliwag("poliwag", 1);
        Poliwhirl poliwhirl = new Poliwhirl("poliwhirl", 1);

        b.addAlly(electrike);
        b.addAlly(heatran);
        b.addAlly(manectric);

        b.addFoe(politoed);
        b.addFoe(poliwag);
        b.addFoe(poliwhirl);

        b.go();
    }

}