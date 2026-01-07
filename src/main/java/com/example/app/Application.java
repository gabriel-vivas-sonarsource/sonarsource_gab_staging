package com.example.app;

import com.example.greeting.Greeter;

/**
 * Main application class that uses the Greeter.
 */
public class Application {

    private final Greeter greeter;

    /**
     * Creates a new Application with a Greeter for the specified name.
     *
     * @param name the name to use for greetings
     */
    public Application(String name) {
        this.greeter = new Greeter(name);
    }

    /**
     * Runs the application, printing greeting and farewell messages.
     */
    public void run() {
        System.out.println(greeter.greet());
        System.out.println(greeter.farewell());
    }

    /**
     * Main entry point for the application.
     *
     * @param args command line arguments (first argument is the name to greet)
     */
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "World";
        Application app = new Application(name);
        app.run();
    }
}

