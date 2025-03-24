1-Observer Pattern
Overview:
This program uses the Observer Pattern to notify observers when the state of Subject changes.
Observers convert the state into binary, octal, and hexadecimal formats.

Key Classes:
Subject.java – Manages and notifies observers.
Observer.java – Base class for all observers.
BinaryObserver, OctalObserver, HexaObserver – Convert the state into respective formats.
ObserverPatternDemo.java – Main class that attaches observers and triggers state updates.

Changes Made:
1-Added detach(Observer o) in Subject.java
public void detach(Observer observer) {
    observers.remove(observer);
}
✔ Allows dynamic observer removal to prevent unnecessary updates.

Modified ObserverPatternDemo.java for dynamic observer changes

HexaObserver hexObserver = new HexaObserver(subject);
OctalObserver octObserver = new OctalObserver(subject);
BinaryObserver binObserver = new BinaryObserver(subject);
subject.detach(octObserver); // Detaching an observer dynamically
✔ Now, only active observers receive notifications.

Benefits:
✅ Better Performance – Only relevant observers update.
✅ More Flexibility – Observers can be removed dynamically.
✅ Real-World Example – Similar to unsubscribing from notifications.


2- Program Event-Driven Notification System
Overview:
An event-driven system where an editor triggers open and save events.
 Observers (email, log, and SMS) subscribe to these events and receive notifications.

Key Classes:
EventManager.java – Manages event listeners.
Editor.java – Handles file operations and notifies listeners.
EmailNotificationListener.java – Sends email on file save.
LogOpenListener.java – Logs file open events.
Demo.java – Main class that subscribes listeners and triggers events.

Changes Made:
1-Added SMSNotificationListener.java
✔ Checks SMS length before sending.
✔ Warns if message exceeds 160 characters.

2-Modified Demo.java to Add SMS Listener
editor.events.subscribe("save", new SMSNotificationListener("+1234567890"));
✔ Now, users receive SMS alerts on file save.

Benefits:
✅ Added SMS Support – Enhanced real-time notifications.
✅ Improved Error Handling – Prevents oversized SMS messages.
✅ More Flexibility – Multiple notification options available.
