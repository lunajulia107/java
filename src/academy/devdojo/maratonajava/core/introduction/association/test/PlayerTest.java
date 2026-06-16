package devdojo.maratonajava.core.introduction.association.test;

import devdojo.maratonajava.core.introduction.association.domain.Player;

public class PlayerTest {
    static void main() {
        Player playerOne = new Player("Pelé");
        Player playerTwo = new Player("Romário");
        Player playerThree = new Player("Cafú");

        Player[] players = { playerOne,  playerTwo, playerThree };

        // Arrays com objetos
        for (Player player: players) {
            player.printer();
        }
    }
}
