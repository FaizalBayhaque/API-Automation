# API-Automation

This repo is about my last project making API automation using REST Assured on eclipse IDE. API that I use for automation testing is from https://kolakproject.herokuapp.com. Feature that I test in this case is Registration, Login, and Adding count to one of product item. 

# Test Scenario

Positive Test

* User register with correct credentials

* User login with correct credentials

* User add item to cart without doing register or login

Negative Test

* User login with incorrect credentials

* User register with incorrect credentials

## Getting Started

To check or run each task on /src there are 2 folders. main/java and test/java/webautomation

on main/java folder you can access :

* HardWaitUtils

on test/java/HnM web automation folder you can access :

* Add To Cart Without Register Test
* Base Web Test
* Base Web Test Headless
* Login Negative Test
* Login Positive Test
* Registration Negative Test
* Registration Positive Test

## Prerequisite

To run this repo, make sure you have maven, selenium, testNg has installed in your machine. This repo works best in Eclipse IDE
## Running the tests
to run the test here are the steps :

* go to test/java/HnM web automation folder

* click the package that you want to choose. (ex: Login Positive Test)

* click right on the class LoginPositiveTest,java

* choose Run As

* click TestNG Test

## Built With
* Maven - Dependency Management

* Selenium - Used to automate web testing

* TestNG - Test Management

## Authors

* Faizal Bayhaque Al Adhanie

