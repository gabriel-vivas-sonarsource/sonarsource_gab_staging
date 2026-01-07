package com.example.greeting;

/**
 * A simple greeter class that provides greeting messages.
 */
public class Greeter {

    private final String name;

    /**
     * Creates a new Greeter with the specified name.
     *
     * @param name the name to greet
     */
    public Greeter(String name) {
        this.name = name;
    }

    /**
     * Returns a greeting message.
     *
     * @return the greeting message
     */
    public String greet() {
        return "Hello, " + name + "!";
    }

    /**
     * Returns a farewell message.
     *
     * @return the farewell message
     */
    public String farewell() {
        return "Goodbye, " + name + "!";
    }
}

