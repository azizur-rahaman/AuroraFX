package com.aurorafx.core;

public class UIManager {
    private static boolean isInitialized = false;

    /**
     * Initialize the framework.
     */
    public static void initialize() {
        if (!isInitialized) {
            System.out.println("Initializing AuroraFX Framework...");
            // Add framework-specific initialization logic here
            isInitialized = true;
        } else {
            System.out.println("AuroraFX Framework is already initialized.");
        }
    }

    /**
     * Checks if the framework is initialized.
     */
    public static boolean isInitialized() {
        return isInitialized;
    }
}
