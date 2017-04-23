package appWithoutStrictBinding;

class ConsoleEventLogger implements EventLogger {
    public void logEvent(String message)

    {
        System.out.println(message);
    }
}
