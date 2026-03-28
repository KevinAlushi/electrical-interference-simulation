# Electrical Interference Simulation

A Java console program that simulates how a message gets corrupted when transmitted through a noisy channel.

## How It Works

The program converts your input message into binary (via ASCII values), 
passes each byte through a channel that randomly flips bits with a 10% probability
— simulating electrical interference — and then decodes the corrupted bits back into characters.
The result shows how the original message compares to what the receiver actually gets.

## How to Run

1. Open the project in your Java IDE
2. Run Main.java
3. Type any message in the console and press Enter
4. Type "FINISH" to exit the program

## Background

Built to experiment with and better understand the Physical Layer of the OSI model
— specifically how data corruption and signal interference affect message transmission at the bit level.
