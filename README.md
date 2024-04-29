# Wafilife Selenium Web Automation

This repository contains an automated web testing project for https://www.wafilife.com/, Utilizing **Selenium**, **Java**, **TestNG**, and the Project Object Model **(POM)** framework. The project is structured based on Maven architecture.

## Project Structure

- **Pages Package**: The page package contains page classes with WebElements, Paths, or links and methods for each page.
- **Test Package**: The page package contains test classes for all pages.
- **Utilities Package**: The utilities package contains the `BaseDriver` class where all web drivers are initialized.

## Technologies Used

- **Selenium**: [Selenium](https://www.selenium.dev/) is used for web automation.
- **Java**: [Java](https://www.java.com/) is the programming language used for automation.
- **TestNG**: [TestNG](https://testng.org/) is used for test management and parallel execution.
- **Maven**: [Maven](https://maven.apache.org/) is the build automation and dependency management tool used for the project.

## Maven Dependencies

The project's Maven dependencies are listed in the [pom.xml](./pom.xml) file.

## Automation Step:

1.      Visit this site
2.      Click  লেখক from the menu
3.      Scroll Down and go to the Next Page
4.      Select any Author
5.      View any Book Details
6.      Click অর্ডার করুন
7.      Click অর্ডার সম্পন্ন করুন
8.      Provide all Information of  আপনার বিলিং এবং শিপিং তথ্য


## Reports

- **Report**: A report is generated for test results.
  
  ![Screenshot (42)](https://github.com/SabbirMamun12/selenium-web-automation-testing/assets/149684228/d7668225-6a70-4ccf-acfb-e2d5fb9cc6a7)


## How to Run

1. Ensure you have the necessary tools and dependencies installed.
2. Clone the repository: `git clone https://github.com/SabbirMamun12/selenium-web-automation-testing.git`
3. Open the project in an IDE (Intellij, Eclipse etc.)
4. Add dependency if needed.
5. Run the tests

Feel free to customize and extend this automation framework according to your specific requirements.

## Contribution

If you would like to contribute to this project, you're welcome.
