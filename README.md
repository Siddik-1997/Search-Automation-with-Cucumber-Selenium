# Search-Automation-with-Cucumber-Selenium

## Why we use cucumber in Automation?

Cucumber is a testing tool that enables behavior-driven development (BDD) in software development projects. It facilitates communication between technical and non-technical team members by using a simple, human-readable syntax called Gherkin. Cucumber helps teams to create and execute automated acceptance tests for their software, allowing them to quickly identify and fix issues, and ensure that the software meets business requirements. Additionally, it helps to improve collaboration between developers, testers, and business analysts, resulting in a better understanding of the project's objectives and requirements. Overall, Cucumber is a valuable tool for software development teams looking to improve their testing process and ensure high-quality software.

## Technology used:
- Selenium
- Cucumber
- java
- Junit
- maven
- Intellij IDEA

## How to run this project:
- Clone this project
- hit the following command: ```mvn clean test / mvn clean install```

## Project Scenerio:

**Create a project with browser-based tests for the following acceptance criteria for github.com. You must use "Cucumber Framework".**

- As a guest (not logged in), when searching GitHub for the term "create-react-app" from the landing page search input, you will see: A count of matching results
- You will find and verify "facebook/create-react-app " project as the first result
- As a guest, when clicking the "About" button in the landing page footer, you will be taken to the GitHub "About" page. verify, you are on about page

**The following terms passed from the Example,**
- create-react-app
- facebook/create-react-app

## What I have done:

- Visited github site with this URL: https://github.com/
- Search with create-react-app into the search box from example
- verify and Assert "facebook/create-react-app from example.
- Click on About button and assert it.

## Report:

![Screenshot (36)](https://user-images.githubusercontent.com/123433625/223494737-d254635b-8468-4589-aa9b-731fc4a5b691.png)

## Video Output:
https://user-images.githubusercontent.com/123433625/223455198-ad715d58-c18e-404e-9b0f-34ecb96d66a5.mp4

