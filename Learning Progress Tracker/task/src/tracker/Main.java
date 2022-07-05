package tracker;

public class Main {
    public static void main(String[] args) {
        Session session = new Session(mode.TOPMENU, new Storage());
        UI.printProgramTitle();
        session.processUserInput();
        end();
    }

    static void end() {
        UI.printGoodBye();
        System.exit(0);
    }
}
