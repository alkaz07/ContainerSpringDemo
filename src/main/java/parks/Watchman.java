package parks;

public class Watchman {
    String fio;
    private Park park;

    public Watchman(String fio) {
        this.fio = fio;
        System.out.println("создан сторож "+fio);
    }

    public void whistle(){
        System.out.println(fio + " свистит");
    }

    @Override
    public String toString() {
        return "Watchman{" +
                "fio='" + fio + '\'' +
                ", park=" + park +
                '}';
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
        System.out.println(fio + " назначен сторожем в "+park);
       // park.watchman = this;
    }
}
