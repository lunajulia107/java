package devdojo.maratonajava.core.introduction.association.test;

import devdojo.maratonajava.core.introduction.association.domain.Player;
import devdojo.maratonajava.core.introduction.association.domain.Time;

public class PlayerTestTwo {
    static void main() {
        /*
            Jogador 1 -- 1 Personagem
            Time 1 -- N Jogador
            Jogador N -- 1 Time
            Estudante N -- N Curso
         */
        // Associação uniderecional um para muitos
        Player player = new Player("Pelé");
        Time time = new Time("Brasil");

        player.setTime(time);
        player.printer();
    }
}
