package com.example.qno3.settings;
public class main {
    public static void main(String[] args) {
        // Get the single instance of GameSettings
        GameSettings settings1 = GameSettings.getInstance();
        settings1.setVolume(80);
        settings1.setScreenResolution("2560x1440");

        // Get the same instance in another variable
        GameSettings settings2 = GameSettings.getInstance();

        // Check if settings1 and settings2 refer to the same instance
        System.out.println("Volume from settings2: " + settings2.getVolume());
        System.out.println("Screen resolution from settings2: " + settings2.getScreenResolution());

        // Verify Singleton instance
        if (settings1 == settings2) {
            System.out.println("Both settings1 and settings2 refer to the same instance (Singleton works!)");
        } else {
            System.out.println("Singleton failed, different instances exist.");
        }
    }
}

