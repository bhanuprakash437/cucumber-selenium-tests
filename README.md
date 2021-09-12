# cucumber-selenium-tests

This project includes the automated tests for the "Support and FAQ" pages using Selenium Cucumber
Framework with Java as a programming language. The scenarios are present as cucumber files in the 
"features" folder which verifies with specifications and generates a test report.

Requirements: Please check pom.xml file for required dependencies.

How to run the tests:

1. After cloning the project to your local machine, make sure the pom.xml file imported as maven
   project.
2. Go to **DataUtils.java** class and provide the paths for the variables CHROME_DRIVER_PATH and
   IMAGE_PATH.
   Note: The Chrome driver and attachment required are also provided in the "resources" folder.
3. Go to **TestRunner.java** class and provide the path for features and simply run.
4. A test report will be generated under "testResult" as Json.