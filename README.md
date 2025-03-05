# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](nameOfImageFileHere.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my projet](nameOfThumbnail.png)](youtube-URL-here)

## Project Description

This program takes in a user request about the masses of the atomic elements, it will produce a different outut based on whether the user wants the element with the highest or lowest mass, or just the average of all elements. This code uses 3 text files, one file will contain the element names and another will contain element weights, using those two files they will be combined into one ArrayList of element objects, a specifically made class with 2 instance variables, name and weight, 2 simple getter methods for each instant variable, and a parameterized constructor that takes in name and weight. The 3rd text file is the keywords needed for the code to work, these keywords specify what words the code should detect from the user to figure out what methods to execute. The code will use the scanner class to take in 2 key user inputs, the first will be for what they want to know, this will be analyzed by a method that will find the keyword said by the user and use that keyword to execute a specific method and print the results, the 2nd input will control a while loop that controls whether the program repeats or stops, the user will enter either "y" or "n" on whether the want to continue. If they enter "n" a variable's value will be changed causing the while loop to not repeat which will end the program, if "y" is entered the code will keep the variable's value and restart the code.

## NLP Techniques

The NLProccesor class uses 6 key classes and 2 main instance variables.
- The element ArrayList of data contains all the element objects (which each have the name and weight getter methods)
- The String ArrayList of keywords contains the keywords for the program to look out for.
- The getKeyword method uses an input, and splits that input into it's individual words, and it compares each word with the keywords until a match is found, that word is then 
  returned at the keyword
- The getHighest and getLowest methods return a Double ArrayList, with the 1st element being the element's specified index, and the 2nd element being the highest/lowest mass 
  value
- The getAverage method returns a regular double value, it counts the total mass of all the elements and divides them by how many there are.
- The DoubleToInt method takes in a Double object (mainly the 1st element of the Double Lists in the getHighest and getLowest methods), unboxes that Double object into a double 
  primitive type, and casts that value into a primitive int value to be returned.
- The process method takes this all in and makes the program work, it takes in the input from the scanner class in the main class and enters it into the getKeyword class, after the keyword is obtained the code will compare the 3 options, based on the keyword it will execute either the getHighest, getLowest, or getAverage method and prints the name of the element (only for getHighest and getLowest) and its corresponding mass as a double.