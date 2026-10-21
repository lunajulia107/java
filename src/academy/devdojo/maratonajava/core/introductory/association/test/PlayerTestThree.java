package devdojo.maratonajava.core.introductory.association.test;

import devdojo.maratonajava.core.introductory.association.domain.Player;
import devdojo.maratonajava.core.introductory.association.domain.Time;

public class PlayerTestThree {
    static void main() {
        Player playerOne = new Player("Cafú");
        Player playerTwo = new Player("Pelé");
        Time time = new Time("Brasil");
        Player[] players = {playerOne, playerTwo};

        playerOne.setTime(time);
        playerTwo.setTime(time);
        time.setPlayers(players);

        System.out.println("--- Jogador 1 ---");
        playerOne.printer();

        System.out.println("--- Jogador 2 ---");
        playerTwo.printer();
    }
}
