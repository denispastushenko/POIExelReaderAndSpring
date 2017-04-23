package appWithoutStrictBinding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private Client client;
    private ConsoleEventLogger consoleEventLogger;

    public App(Client client, ConsoleEventLogger consoleEventLogger) {
        this.client = client;
        this.consoleEventLogger = consoleEventLogger;
    }

    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        App app = applicationContext.getBean(App.class);
        app.log("Some event for user 1 ");
        app.log("Some event for user 2 ");
    }

    private void log(String msg) {
        String message = msg.replaceAll(client.getId(), client.getName());
        consoleEventLogger.logEvent(message);

    }

}
