package devdojo.maratonajava.core.introduction.association.domain;

public class Player {
    private String name;
    private Time time;

    public void printer() {
        System.out.println(this.name);

        if (time != null) {
            System.out.println(time.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
