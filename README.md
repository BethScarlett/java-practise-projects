# Java Practise Projects

A collection of mini projects I've used to build up and maintain my Java knowledge. Each project listed below will have a small description to go along with it.

## Projects include:

- Number Guessing Game
- Simple Bank App

### Number Guessing Game

This is a very simple game, in which the goal is to correctly guess a randomly generated number. The number itself is generated using the ThreadLocalRandom method, with the default origin being 0 and bound being 101; although overloading is also utilised to enable a custom number range should the user desire it. 

A very rudamentary command runner is also utilised in order to capture the user's choice in whether to start the game, as well as to validate and return the results of their guess. 

### Simple Bank App

A rudimentary banking application which utilises a command runner to enable three main functions, seeing a users balance, depositing money and withdrawing money. Outside of the command runner, this application utilises a class called "Customer", which inherits from a super class called "User" as well as implementing a "Transactions" interface. Constructing matters this way allows for futher expansion through other potential types of accounts, such as employees, with minimal effort required to get them running to the desired standard.

The purpose of this application apart from the reasons mentioned above is for demonstration purposes, so the application comes pre-baked with a Customer object containg a name("Tiffany"), business account type and 50,000.00 money. These values can be adjusted in the main class if required.

## How to use:

As these are strictly Java projects, you will need to have an IDE such as IntelliJ to run them. Once installed clone this repository down into your chosen directory, and open it through your IDE of choice.

All of the projects exist within their own separate packages, so once you have this repo installed simply navigate to src -> main -> java and they will be waiting for you. To run a project simply open the desired package, navigate to the Main class at the bottom (Each project has its own main) and click run main.
