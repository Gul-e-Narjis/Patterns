/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.eventsmanagement;

/**
 *
 * @author GULE NARJIS
 */
import java.io.File;

public class SMSNotificationListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "SMS to " + phoneNumber + ": File " + file.getName() + " has been " + eventType + ".";

        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("WARNING: SMS message is too long! Define a valid default SMS.");
        } else {
            System.out.println(message);
        }
    }
}

