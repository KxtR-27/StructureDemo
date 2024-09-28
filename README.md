# StructureDemo
In light of Iteration Two of the first project, this repository highlights my experience learning SceneBuilder and creating a bare-bones application that emulates certain features of Iteration Two's specifications.

The most advanced thing in here is probably the window icons.

---
## Notes
### AnchorPane
These are cool because you can constrain child objects to the sides of the pane. This means that resizing the window resizes the pane, and resizing the pane resizes its constrained children.
### HBox & VBox
If anyone used Flet during their time in CS120, these will seem very familiar. A VBox aligns its children vertically, and an HBox aligns its children horizontally. You can change the exact manner of their alignments in the Properties tab of SceneBuilder. I found it helpful to wrap all elements in a Vbox -- a very easy way to put my output area on top and my controls on the bottom.

It's worth mentioning that this layout took a lot of trial and error. An easy to mess with panes and V/HBoxes is to right click some elements and hover over `"Wrap in >"`.
### Alerts
For anyone that used JOptionPane during their time in CS121, these will seem fairly simple. I used an ERROR alert for those popups we need to have.
Use `showAndWait()` to block access to the main window until the popup is closed, and use `show()` for a popup that doesn't get in the way.

### Setting up Gradle
To be totally honest, I made a JavaFX project from **File > New Project**, going down to **Generators**, picking JavaFX with the **Java language** and the **Gradle build system**. **Gradle** is very similar to **Gradle (Kotlin)**, but you will notice minor differences in the way your `build.gradle` is structured vs. your `build.gradle.kts`.
I found struggle with attempting to paste the build settings from the Specifications document, and much success with modeling my `build.gradle.kts` in the project after the `build.gradle` here.

My project consists of three major files: `StructureDemoApplication` & `StructureDemoController` in their own package in **main > java**, and `structuredemo-view.fxml` in the same package in **main > resources**.  
You'll verily notice that any references I make to resources, such as that fxml or my icon images, **_is NOT done with a path_**. Instead use `<classYou'reEditing>.class.getResources("<filename with NO FOLDERS>")`. If the instance in question needs a String url instead of the resource itself, wrap it in `String.valueOf()`.

Last thing here, I mentioned I generated a sample project (this) and modeled my JavaFX assets in the First Project as similarly as possible after the fact. All my previous attempts to directly make JavaFX files work in the First Project ended in inexplicable failure. I cannot understate the value of trying it out yourself at the start.

### SceneBuilder
You don't have to install this onto your machine. Once your JavaFX dependencies are set up, go to your `.fxml` file. At the bottom of the editor window, you'll see two tabs: "Text" and "SceneBuilder." When you select SceneBuilder, you'll be prompted to install the necessary files. When you're working on this file, it is important to **switch to text view to resolve warnings and errors**.

Though [Dr. Gestwicki's video](https://youtu.be/tW6kEjtIJKI) is incredibly dated, I still recommend watching it 100%, even just to skim.  
On the left you'll see your element options, and on the right are Properties, Layout, and Code. I recommend dragging elements into the scene hierarchy in the left column instead of into the scene view.  
The best practice is KISS: Keep It Simple, Stupid. Make the minimum number of elements, property edits, wrappings, buttons, everything. No need to get fancy.

### Final Advice
It would make me happy to see this repository fuel your success in Iteration Two. That said, I strongly recommend NOT pasting it blindly. As mentioned before, this uses Gradle, NOT Gradle (Kotlin). This uses a module, your project SHOULDN'T. Take some executive liberties and make the code work for your project, not your project work for the code.

---
## Credits and Resources
| Resource                           | Location                                                                                                                                                                                                                                          | Usage Details                                               |
|------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| Dr. Gestwicki's SceneBuilder Video | https://youtu.be/tW6kEjtIJKI                                                                                                                                                                                                                      | Hugely helpful in understanding the basics of SceneBuilder. |
| Iteration Info                     | https://bsu.instructure.com/courses/157856/assignments/1906849                                                                                                                                                                                    | Self explanatory.                                           |
| Dragon Icons                       | <a href="https://www.flaticon.com/free-icons/fairy-tale" title="fairy tale icons">Fairy tale icons created by Freepik - Flaticon</a> \| <a href="https://www.flaticon.com/packs/dragon-tales-17818873" title="Dragon Pack">Dragon Tales Icons</a> | "I just think they're neat." _[32px versions]_              |
