package parks;

public class Park {
    int id;
    String name;
    Watchman watchman;

    public Park(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("создан парк "+name);
    }

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void doNoise(){
        System.out.println(this+" шумит");
    }

    public void walkOnTheGrass(){
        System.out.println("Шаг на газон");
        if(watchman != null)
            watchman.whistle();
        else
            System.out.println("вытаптывание газона");
    }

    public void setWatchman(Watchman watchman) {
        this.watchman = watchman;
    }
}
