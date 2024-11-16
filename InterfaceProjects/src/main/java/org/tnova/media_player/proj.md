### Detailed Technical Task: Media Player with Multiple Formats

#### **Objective:**
Create a simple media player system that supports playing different types of media formats using interfaces. This project will demonstrate how interfaces can encapsulate different behaviors, enabling flexible and extendable software design.

#### **Requirements Overview:**

1. **Define an Interface:**
    - Create a `MediaPlayer` interface.
    - The interface should declare the following methods:
        - `play()`: Starts playing the media.
        - `stop()`: Stops the media playback.

2. **Implementing Classes:**
    - Implement the `MediaPlayer` interface in at least three classes, each representing a different media format:
        - **MP3Player**: Implements the `play()` and `stop()` methods to simulate playing and stopping an MP3 file.
        - **MP4Player**: Implements the `play()` and `stop()` methods to simulate playing and stopping an MP4 video file.
        - **WAVPlayer**: Implements the `play()` and `stop()` methods to simulate playing and stopping a WAV audio file.
    - Each class should provide a specific behavior for `play()` and `stop()` (e.g., displaying a message indicating that the media is playing or stopping).

3. **Main Program to Demonstrate Functionality:**
    - Create a main class that serves as the entry point for the media player application.
    - In the main method:
        - Instantiate objects for each media player type (`MP3Player`, `MP4Player`, `WAVPlayer`).
        - Allow the user to select which media type to play.
        - Call the appropriate `play()` and `stop()` methods based on the user's selection.
        - Demonstrate how the interface allows switching between different media types easily.

4. **Polymorphism Demonstration:**
    - Use polymorphism by referencing the media player instances with the `MediaPlayer` interface.
    - Show how switching behavior dynamically is possible by using a common interface type.

#### **Optional Enhancements:**
- Add more media player implementations for additional formats (e.g., `AVIPlayer`, `FLACPlayer`).
- Add volume control functionality to the `MediaPlayer` interface and implement it in each media player class.
- Implement error handling (e.g., trying to play an unsupported format).
- Create a playlist functionality where multiple media files can be played in sequence.

#### **Expected Program Behavior:**
- The user should be able to select and play different types of media formats using the provided implementations.
- The program should display messages indicating the status of playback (e.g., "Playing MP3 file..." and "Stopping MP3 file...").
- Example interaction:
  ```
  Select media type to play:
  1. MP3
  2. MP4
  3. WAV
  You selected: 1 (MP3)
  Playing MP3 file...
  Stopping MP3 file...
  ```

#### **Focus Areas:**
- **Encapsulation of Behavior**: Encapsulate different media playback behaviors using separate classes implementing a common interface.
- **Polymorphism**: Use the `MediaPlayer` interface to switch between different media player types dynamically at runtime.
- **Extendability**: Demonstrate how adding support for new media formats only requires creating a new class that implements the `MediaPlayer` interface, without changing existing code.

#### **Deliverables:**
- A `MediaPlayer` interface with methods `play()` and `stop()`.
- At least three implementing classes (`MP3Player`, `MP4Player`, `WAVPlayer`) that define specific playback behaviors.
- A main program to interact with the user, select media types, and demonstrate playback functionality using the interface-based approach.