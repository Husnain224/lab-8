package com.example.qno3.settings;

public class GameSettings {
    // Step 1: Create a private static instance of the class (Lazy Initialization)
    private static GameSettings instance;

    // Step 2: Private variables for game settings
    private int volume;
    private String screenResolution;

    // Step 3: Private constructor to prevent external instantiation
    private GameSettings() {
        this.volume = 50; // Default volume
        this.screenResolution = "1920x1080"; // Default resolution
    }

    // Step 4: Public static method to get the single instance (Lazy Initialization)
    public static GameSettings getInstance() {
        if (instance == null) { // Create instance if not exists
            instance = new GameSettings();
        }
        return instance;
    }

    // Step 5: Method to set volume
    public void setVolume(int level) {
        if (level >= 0 && level <= 100) {
            this.volume = level;
            System.out.println("Volume set to: " + level);
        } else {
            System.out.println("Invalid volume level! Set between 0 and 100.");
        }
    }

    // Step 6: Method to get volume
    public int getVolume() {
        return volume;
    }

    // Step 7: Method to set screen resolution
    public void setScreenResolution(String resolution) {
        this.screenResolution = resolution;
        System.out.println("Screen resolution set to: " + resolution);
    }

    // Step 8: Method to get screen resolution
    public String getScreenResolution() {
        return screenResolution;
    }
}
