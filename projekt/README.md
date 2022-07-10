# Library management app.

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)


Library management app is a simple app where you can manage customers, employees and books in your library with simple authorisation.

# What you need to run the app?


First you need to install MySQL on your device (Windows, MacOs or Linux). I suggest you to install MySQL Workbench as well to easly manage your database and create new instance that is also needed to run app. You can use IntelliJ Idea or Spring Tool Suite 4 based on Eclipse.

# How to run app?


After everything is installed you will need to open file called "application.properties" located in "src/main/resources" and enter login and password to your MySQL instance.
After that you need to hit build and finally click "Run App".

# How to access app?


After running server you need to open your browser (Chrome, Safari, Firefox, etc.) in adress bar enter "localhost:8080/", it will automatically redirect you to login page where you can also register your new account. When you finally have account and logged in you can access your database with user friendly UI and edit data in here.