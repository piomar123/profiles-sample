package me.piomar.profiles;

import me.piomar.profiles.lib.Ship;

public class MainApp {

    public static void main(String[] args) {
        Ship ship = new Ship();
        System.out.println("Current ship: " + ship.name());
    }
}
