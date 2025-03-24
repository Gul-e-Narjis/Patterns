1- First Program: Observer Pattern (Number Conversion)
Overview:
This program follows the Observer Pattern, where different observers get notified whenever the state of the Subject changes.
The observers convert the state into binary, octal, and hexadecimal formats.

Classes & Explanation:
*Subject.java*
->Manages a list of observers.
->When the state changes, it notifies all observers.

*Observer.java*
->Defines a base class for all observers.
->Each observer implements the update() method.

*BinaryObserver.java, OctalObserver.java, HexaObserver.java* 
->They subscribe to Subject and update themselves when notified.
->Each one converts the number to its respective format.

*ObserverPatternDemo.java (Main Class)*
->Creates a Subject and attaches observers.
->When the state changes, it triggers updates in all observers.

Changes Made:
1. Added detach(Observer o) Method in Subject.java
public void detach(Observer observer) {
    observers.remove(observer);
}
 Now we can remove observers dynamically, preventing unnecessary updates.

2. Modified ObserverPatternDemo.java for Dynamic Observer Changes

HexaObserver hexObserver = new HexaObserver(subject);
OctalObserver octObserver = new OctalObserver(subject);
BinaryObserver binObserver = new BinaryObserver(subject);

// Detach an observer dynamically
subject.detach(octObserver);
 Now, we can remove specific observers at runtime instead of notifying all.

Benefits of Changes:
->Better Performance – Only necessary observers are notified.
->More Flexibility – We can dynamically remove observers.
->Real-World Usage – Similar to unsubscribing from notifications.



2-Second Program: Event-Driven Notification System
Overview:
This program simulates an event-driven notification system where an editor can open and save files. 
Different listeners (email, logging, and SMS) subscribe to these events and receive notifications when an event occurs.

Classes & Explanation:
*EventManager.java*
->Manages a list of listeners for different events (open, save).
->Notifies the relevant listeners when an event is triggered.

*Editor.java (Observable)*
->Handles file operations (openFile(), saveFile()).
->Calls EventManager to notify listeners.

*EventListener.java*
->Provides an interface for all event listeners.

*EmailNotificationListener.java*
->Sends an email notification when a file is saved.

*LogOpenListener.java*
->Logs the event when a file is opened.

*Demo.java (Main Class)*
->Subscribes different listeners.
->Triggers events by opening and saving a file.

Changes Made:
1. Added SMSNotificationListener.java
✔ New Observer that checks SMS length before sending.
✔ If the message exceeds 160 characters, it warns the user.

New File: SMSNotificationListener.java  (Created)
✔ Checks SMS length dynamically.
✔ Prevents sending messages longer than 160 characters.

2. Modified Demo.java to Add SMS Listener
editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
editor.events.subscribe("save", new SMSNotificationListener("+1234567890")); // New SMS Listener
✔ Now, SMS notifications are sent when a file is saved.
✔ Real-time checking for SMS length before sending.

 Benefits of Changes:
->Added SMS Support – Now, users get SMS alerts.
->Improved Error Handling – SMS length validation prevents errors.
->More Flexibility – Now, notifications are more dynamic.
