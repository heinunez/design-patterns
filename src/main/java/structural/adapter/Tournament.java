package structural.adapter;

import structural.adapter.adaptertarget.Warrior;

import java.util.List;

public class Tournament {
    List<Warrior> participants;

    public Tournament(List<Warrior> participants) {
        this.participants = participants;
    }

    public void fight() {
        participants.forEach(Warrior::attack);
    }
}
