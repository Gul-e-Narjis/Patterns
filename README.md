"Let's go over the key changes made in both programs.

First, in the Observer Pattern program:
/n 1️- Added a detach(Observer o) method in Subject.java, so observers can be removed dynamically. This prevents unnecessary updates.
2️- Updated ObserverPatternDemo.java to detach an observer at runtime, allowing only active observers to receive updates.
✔ Now, notifications are more efficient and flexible, just like unsubscribing from alerts.

Next, in the Event-Driven Notification System:
1️- Added SMSNotificationListener.java, which checks if an SMS message exceeds 160 characters before sending. If too long, it warns the user.
2️- Modified Demo.java to subscribe the SMS listener when saving a file.
✔ Now, users get SMS alerts along with email and log notifications.

🔹 Overall, these changes make both programs more dynamic, efficient, and real-world applicable.
