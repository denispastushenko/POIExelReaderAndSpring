package firstAppWithoutSpringUsing;

public class App {

    private Client client;
    private ConsoleEventLogger consoleEventLogger;

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "Josh Smith");
        app.consoleEventLogger = new ConsoleEventLogger();
        app.log("Some event for user 1 ");
    }

    private void log(String msg) {
        String message = msg.replaceAll(client.getId(), client.getName());
        consoleEventLogger.logEvent(message);

    }

}
