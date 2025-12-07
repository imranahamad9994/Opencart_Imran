# Opencart_Automation_Project

> Automation test framework for OpenCart — automating key user journeys on an OpenCart demo/store environment.  

## 📄 Table of Contents

- [About](#about)  
- [Features / What It Automates](#features--what-it-automates)  
- [Prerequisites](#prerequisites)  
- [Installation & Setup](#installation--setup)  
- [Running the Tests](#running-the-tests)  
- [Project Structure](#project-structure)  
- [Contributing](#contributing)  
- [License](#license)  

## About

This project is a test automation suite built to validate core functionalities of an OpenCart-based store (or demo site). It helps ensure that critical user flows such as registration, login, browsing products, adding to cart, checkout, etc. work as expected.  

It can be useful for QA engineers, developers, or anyone who wants to integrate automated UI testing for OpenCart stores — helping catch regressions and speed up testing cycles.  

## Features / What It Automates

- User registration  
- User login  
- Browsing different menus/categories  
- Searching for products  
- Adding products to cart and validating cart contents  
- Checkout flow  
- Capturing screenshots and test reports for analysis  
- Cross-browser / cross-environment support (based on included config)  

## Prerequisites

Before running the tests, make sure you have installed:

- Java (version compatible with project, e.g. JDK 8/11)  
- Maven (since the project includes `pom.xml`)  
- A browser driver (e.g. ChromeDriver / GeckoDriver) matching your browser version  
- Internet connection (if tests run against live/demo OpenCart store)  

## Installation & Setup

```bash
# Clone this repo
git clone https://github.com/imranahamad9994/Opencart_Automation_Project.git
cd Opencart_Automation_Project

# (Optional) Configure browser driver path and other settings if needed
# e.g. export PATH or set in project config / properties


Running the Tests

You can run the full test suite using:

mvn test


Or — if test suite is configured via TestNG — you can run using TestNG configuration:

# Example using command line or IDE
mvn test -DsuiteXmlFile=testng.xml


After execution:

Reports will be generated under reports/ or test-output/.

Screenshots (on failure or as configured) will appear under screenshots/.

Project Structure
/ ─ Project root
│
├── src/                  # source test scripts  
├── testData/             # test data (e.g. test accounts, input data)  
├── screenshots/          # screenshots captured during test runs  
├── reports/              # HTML / PDF reports for test results  
├── logs/                 # execution logs  
├── pom.xml               # Maven build descriptor  
├── testng.xml            # TestNG configuration for test suites  
├── docker-compose.yaml   # (optional) for grid setup / cross-browser testing  
└── README.md             # this file  

Contributing

Contributions are welcome! If you want to propose changes, improvements, or new test cases:

Fork the repository

Create a new branch: git checkout -b feature/your-feature-name

Commit your changes and push: git push origin feature/your-feature-name

Open a Pull Request with a clear description of changes

Please ensure any new functionality — e.g. new test cases — also includes appropriate data in testData/, and optionally, updated documentation or sample config.
# Build project using Maven
mvn clean compile
