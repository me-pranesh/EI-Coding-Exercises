# EI_CODING_ASSESSMENT

## 1. Design patterns

## i) Behavioral Design Patterns
* Use Case 1: ***Observer Pattern***
  
   Stock Pattern : A stock market application where multiple clients (observers) subscribe to stock price updates.
   ![Stock Pattern](./ex1/Behavioral%20Design%20Patterns/Stock%20Pattern/stockPattern.png)

 * Use Case 2: ***Strategy Pattern***

   Payment Method : A payment processing system where different payment methods (strategies) can be chosen dynamically.

   ![Payment](./ex1/Behavioral%20Design%20Patterns/Payment%20Pattern/Payment.png)

## ii) Creational Design Patterns
* Use Case 3: ***Singleton Pattern***
  
    Database Connection: A logger class that ensures only one instance of the logger is created.

   ![Logger](/ex1/Creational%20Design%20Patterns/Logger/Logger.png)

 * Use Case 4: ***Factory Pattern***

   Shape Creating Factory : A shape creation system where different shapes can be created without specifying the exact class of object that will be created.
   ![Shape](./ex1/Creational%20Design%20Patterns/Shape/Shape.png)

## iii) Structural Design Patterns
* Use Case 5: ***Adapter Pattern***
  
   Media Player : An audio player that can play different formats using adapters.
   ![Media](./ex1/Structural%20Design%20Patterns/Meida%20player%20Pattern/Media.png)

 * Use Case 6: ***Decorator Pattern***

   Text Editor : A text editor that allows for text to be decorated with different styles (bold, italic).

   ![Text](./ex1/Structural%20Design%20Patterns/Decorator%20Pattern/Text.png)

## 2. Mini-Project

## Project 3: Mars Rover Programming Exercise

### Problem Statement

Create a simulation for a Mars Rover that can navigate a grid-based terrain. Your Rover should be able to move forward, turn left, and turn
right. You'll need to make sure that it avoids obstacles and stays within the boundaries of the grid. Remember to use pure Object-Oriented
Programming, design patterns, and avoid using if-else conditional constructs.

### Features

#### Obstacle Detection
 * Stops movement upon encountering obstacles but allows turning commands.
#### Directional Movement
 * Supports forward movement and turning (left/right) in four cardinal directions.
#### Grid Constraints
 * Ensures the rover stays within grid boundaries.
#### Customizable Inputs
 * Users can define grid size, obstacles, starting position, and command sequence.
#### Command Factory
 * Simplifies adding and managing commands for the rover.


## OUTPUT : 
