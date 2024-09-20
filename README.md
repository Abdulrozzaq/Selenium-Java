# Selenium Java Tutorial Series

This repository contains a series of tutorials focused on using Selenium with Java for web automation. Each tutorial builds on the previous one, allowing you to gradually enhance your skills in automation testing.

## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)

## Description

The Selenium Java Tutorial Series is designed for beginners who want to learn web automation testing using Selenium and Java. Each section includes practical examples and assignments to reinforce learning.

## Installation

1. **Clone the Repository:**
   git clone https://github.com/Abdulrozzaq/Selenium-Java.git

2. **Navigate to the Project Directory:**

   cd Selenium-Java

3. **Open the Project in Your IDE (e.g., Eclipse):**
   - Import the project as a Maven project.

4. **Configure Maven Dependencies:**
   Ensure that the `pom.xml` file contains the necessary dependencies for Selenium WebDriver. Here's a sample dependency you might include:

   <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>3.141.59</version>
   </dependency>

## Usage

To run the Selenium tests:

- Make sure your WebDriver is correctly configured in your project.
- Execute the test classes from your IDE or use Maven commands:

  mvn test
