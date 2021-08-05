# tip-calculator
Stage 3 of 3 for JetBrains Academy - Android - [Tip Calculator project](https://hyperskill.org/projects/158/stages/825/implement).       
The app caclulates the tip from a given number and given amount selected from the slider.
## Requirements
### Description
You're almost there! In the final stage of the project, you need to take the user input data and perform the calculations. To determine the tip amount, take the overall bill value, multiply the number by the tip percentage, and divide it by 100. Output the tip amount with two digits in the fraction part.
### Objectives
Using the event listeners from the previous stage, update the tip calculation result in the `TextView` each time the user changes the bill value or tip percentage.
### Example
![stage3-1_upd](https://user-images.githubusercontent.com/64429863/125490174-5831a51c-8b8b-4200-a0b7-b75016de8e9c.gif)
### Notes
The files are just a skeleton of the files needed to run in Android Studio. I'm not comfortable with just uploading everything in the project folder ( I'm not sure what files are specific to my computer, as some files are encoded in a way that I don't know what is in them ), so to get this to work you'll need to create an empty project with the same name and add the files to it and make changes to the gradle files accordingly. There's some things in the two gradle files that will not be needed, as they are specific to the class project for testing the app. The only things I personally added was:
```
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation "androidx.activity:activity-ktx:1.2.3"
```
Inside the dependencies of the build.gradle Module file.
