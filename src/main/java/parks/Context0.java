package parks;

public class Context0 {
    Park park;
    Watchman watchman;

    public Park getPark() {    return park;  }
    public Watchman getWatchman() { return watchman;}

    public Context0() {
        System.out.println("создается контекст 0");
        park = new Park(2, "Александровский");  //внедрение зависимостей через конструктор
        watchman = new Watchman("Егорыч");      //внедрение зависимостей через конструктор
        park.watchman = watchman;               //внедрение зависимостей через поле
        watchman.setPark(park);                 //внедрение зависимостей через сеттер

    }
}
