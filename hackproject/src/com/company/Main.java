package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);   //instantiating scanner obj here (use reader for all scanner uses)
        System.out.println("Hello, you have reached the emergency first responder help line. What is your emergency? (Please use obvious keywords so we can diagnose your emergency accurately.");
        String emergency = reader.nextLine();      //sets String variable emergency to input from user

        if (emergency.indexOf("fire") >= 0 || emergency.indexOf("Fire") >= 0 || emergency.indexOf("flame") >= 0) {      //detects whether the fire department should handle this issue and executes code if it is true
            System.out.println("Your request is now being sent to the fire department. Please enter location or type auto for the chatbot to dispatch officers to your device's location.");
            String location = reader.nextLine();
            if (location.indexOf("auto") >= 0)     //gets location of user
                System.out.println("Dispatching officers to device's current location. Make sure location is enabled on this device. Officers will arrive in approximately " + (int) (1 + Math.random() * 20) + " minute(s). Stay safe and get try to get everyone out of the building or area that is on fire.");

            else
                System.out.println("Dispatching officers to " + location + ". Officers will arrive in approximately " + (int) (5 + Math.random() * 16) + " minute(s). Stay safe and get try to get everyone out of the building or area that is on fire.");
        }
        else if(emergency.indexOf("hurt") >= 0 || emergency.indexOf("injur") >= 0 || emergency.indexOf("bl") >=0){  //gets whether the medical department should handle the situation and executes code if true
            System.out.println("Your request is now being sent to the medical department. Please enter location or type auto for the chatbot to dispatch officers to your device's location.");
            String location = reader.nextLine();
            if(location.indexOf("auto") >=0 )                                                                            //gets location of user
                System.out.println("Dispatching officers to device's current location. Make sure location is enabled on this device. Officers will arrive in approximately " + (int) (1 + Math.random() * 20) + " minute(s). Stay safe and do not move or attempt to treat the patient unless necessary.");
            else
                System.out.println("Dispatching officers to " + location + ". Officers will arrive in approximately " + (int) (1 + Math.random() * 20) + " minute(s). Stay safe and do not move or attempt to treat the patient unless necessary.");
        }
        else {
            System.out.println("Your request is now being sent to the police department. Please enter location or type auto for the chatbot to dispatch officers to your device's location.");
            String location = reader.nextLine();
            if(location.indexOf("auto") >=0 )                                                                            //gets location of user
                System.out.println("Dispatching officers to device's current location. Make sure location is enabled on this device. Officers will arrive in approximately " + (int) (1 + Math.random() * 20) + " minute(s). Stay safe and try to get to safety while the officers arrive.");
            else
                System.out.println("Dispatching officers to " + location + ". Officers will arrive in approximately " + (int) (1 + Math.random() * 20) + " minute(s). Stay safe and try to get to safety while the officers arrive.");
        }
    }
}
