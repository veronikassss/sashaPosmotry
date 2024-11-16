### Detailed Technical Task: Notification System

#### **Objective:**
Develop a basic notification system that supports sending notifications through different channels using interfaces. This project aims to demonstrate how interfaces can encapsulate behavior, provide flexibility for adding new functionalities, and promote loose coupling.

#### **Requirements Overview:**

1. **Define an Interface:**
    - Create a `Notification` interface.
    - The interface should declare a method:
        - `send(String message)`: This method will accept a `String` message and perform the necessary action to send it.

2. **Implementing Classes:**
    - Implement the `Notification` interface in at least three classes, each representing a different notification channel:
        - **EmailNotification**: Implements the `send()` method to simulate sending an email notification (e.g., print a message to indicate that an email has been sent).
        - **SMSNotification**: Implements the `send()` method to simulate sending an SMS notification.
        - **PushNotification**: Implements the `send()` method to simulate sending a push notification.
    - Each class should provide its own specific behavior for sending notifications.

3. **Main Program to Demonstrate Functionality:**
    - Create a main class that acts as the entry point for the notification system.
    - In the main method:
        - Instantiate objects for each notification type (`EmailNotification`, `SMSNotification`, `PushNotification`).
        - Allow the user to enter a message to be sent.
        - Allow the user to select the desired notification channel.
        - Use the selected channel's `send()` method to simulate sending the message.

4. **Polymorphism Demonstration:**
    - Use polymorphism by referencing notification instances through the `Notification` interface.
    - Show how switching behavior dynamically is possible by using a common interface type.

#### **Optional Enhancements:**
- Add additional notification types (e.g., `SlackNotification`, `WebhookNotification`).
- Implement an option to send notifications through multiple channels simultaneously (e.g., using a list of `Notification` objects).
- Add a method `receive()` to the `Notification` interface and implement it in each class to simulate receiving messages.
- Introduce a notification priority system to demonstrate more advanced behavior encapsulation.

#### **Expected Program Behavior:**
- The user should be able to enter a message and select a notification type for sending.
- The program should display messages indicating the type of notification sent (e.g., "Email sent: Your message" or "SMS sent: Your message").
- Example interaction:
  ```
  Enter your message: "Hello, this is a test message."
  Select notification type to send:
  1. Email
  2. SMS
  3. Push
  You selected: 1 (Email)
  Email sent: "Hello, this is a test message."
  ```

#### **Focus Areas:**
- **Encapsulation of Behavior**: Encapsulate different notification sending mechanisms using separate classes that implement a common interface.
- **Polymorphism**: Use the `Notification` interface to switch between different notification types dynamically at runtime.
- **Flexibility and Extendability**: Demonstrate how new notification channels can be easily added by creating new classes that implement the `Notification` interface, without changing existing code.

#### **Deliverables:**
- A `Notification` interface with a `send(String message)` method.
- At least three implementing classes (`EmailNotification`, `SMSNotification`, `PushNotification`) that define specific notification behaviors.
- A main program that handles user input, selects the appropriate notification type, and simulates sending the message using the interface-based approach.