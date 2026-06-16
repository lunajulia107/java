package devdojo.maratonajava.core.introduction.association.domain;

public class Time {
    private String name;
    private Player[] players;

    public Time(String name) {
        this.name = name;
    }

    public Time(Player[] players, String name) {
        this.players = players;
        this.name = name;
    }

    public void printer() {
        System.out.println(this.name);
        if (players == null) return;
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
