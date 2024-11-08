package parks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       //example0();
      // example1();
      //  example2();
        example3();
    }

    private static void example3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-2.xml");
        Park p = context.getBean("park4", Park.class);
        Watchman w = context.getBean("watchmanS", Watchman.class);
        w.whistle();
        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-1.xml");
        Park p = context.getBean("park", Park.class);
        Watchman w = context.getBean("watchman", Watchman.class);
        w.whistle();
        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example1() {
        Context0 context0 = new Context0();
        Park p = context0.getPark();
        Watchman w = context0.getWatchman();
        p.doNoise();
        p.walkOnTheGrass();
    }

    private static void example0() {
        Park p = new Park(1, "Екатериненский");
        p.doNoise();

        Watchman w = new Watchman("Петрович");
        w.whistle();

        p.walkOnTheGrass();

        w.setPark(p);
        p.walkOnTheGrass();
    }
}