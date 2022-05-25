# API-Automation

This repo is about my last project making API automation using REST Assured on Eclipse IDE. API that I use for automation testing is from https://kolakproject.herokuapp.com. Feature that I test in this case is Login, and Adding count to one of product item. 

# Test Case

Positive Test

* User login with correct credentials

* User input with number for add count

* User can get username

Negative Test

* User login with incorrect credentials

* User using invalid token

* User inpput mathematic operator for add count

* User get false key

## Getting Started

To check or run each task on /src there are 2 folders. main/java and test/java/webautomation

on main/java/testAPI.Automation folder you can access :

* TokenAPI.java

on test/java/testAPI folder you can access :

* Negative API Test
* Positive API Test

## Prerequisite

To run this repo, make sure you have maven, selenium, testNg has installed in your machine. This repo works best in Eclipse IDE

## Running the tests
to run the test here are the steps :

* go to test/java/HnM web automation folder

* click the package that you want to choose. (ex: Positive API Test)

* click right on the class PositiveAPITest.java

* choose Run As

* click TestNG Test

# Disclaimer

To run this test all in one time you can click right on the class testng.xml and choose Run As then click TestNG Test

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

* [Selenium](https://www.selenium.dev/) - Used to automate web testing

* [TestNG](https://testng.org/) - Test Management


## Authors

* Faizal Bayhaque Al Adhanie

