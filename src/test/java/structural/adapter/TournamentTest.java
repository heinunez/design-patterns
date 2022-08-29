package structural.adapter;

import lombok.val;
import org.junit.jupiter.api.Test;
import structural.adapter.adapter.AndroidAdapter;
import structural.adapter.adaptertarget.Warrior;

import java.util.ArrayList;
import java.util.List;

class TournamentTest {


    @Test
    public void givenTournamentWhenWarriorsFightThenFightCorrectly() {
        val yamcha = new Saiyan();
        val dende = new Namekian();
        val no17 = new Android();
        val no17Adapter = new AndroidAdapter(no17);

        List<Warrior> warriors = new ArrayList<>();
        warriors.add(yamcha);
        warriors.add(dende);
        warriors.add(no17Adapter);

        val tournament = new Tournament(warriors);
        tournament.fight();
    }
}