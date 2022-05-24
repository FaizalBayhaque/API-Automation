# API-Automation

This repo is about my last project making API automation using REST Assured on eclipse IDE. API that I use for automation testing is from https://kolakproject.herokuapp.com. Feature that I test in this case is Registration, Login, and Adding count to one of product item. 

# Test Scenario

Positive Test

* User login with correct credentials

* User input with number for add count

* User get username

Negative Test

* User login with incorrect credentials

* User using invalid token

* user input mathematic operator for add count

* user get false key

## Getting Started

you can straight forward going to src/test/java/testAPI folder to check or run the task

on test/java/testAPI folder you can access :

* Positive API Test
* Negative API Test

## Prerequisite

To run this repo, make sure you have maven, selenium, testNg has installed in your machine. This repo works best in Eclipse IDE

## Running the tests
to run the test here are the steps :

* go to test/java/testAPI folder

* click the package that you want to choose. (ex: Positive API Test)

* click right on the class PositiveAPITest,java

* choose Run As

* click TestNG Test

# Disclaimer

To run this test all in one time you can click right on testng.xml and choose Run As then click TestNG test

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

* [Selenium](https://www.selenium.dev/) - Used to automate web testing

* [TestNG](https://testng.org/) - Test Management

## Authors

* Faizal Bayhaque Al Adhanie

