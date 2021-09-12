# cucumber-selenium-tests

This project includes the automated tests for the "Support and FAQ" pages using Selenium Cucumber
Framework with Java as a programming language. The scenarios are present as cucumber files in the
"features" folder which verifies with specifications and generates a test report.

Requirements: Java 8+ and Gherkin plugin.
(Please check pom.xml file for other required dependencies)

How to run the tests:

1. After cloning the project to your local machine, make sure the pom.xml file is imported as maven
   project. Then you could run 'mvn clean' and 'mvn install' to ensure the package installed to
   local repo.
2. Go to **DataUtils.java** class and provide the paths for the variables CHROME_DRIVER_PATH and
   IMAGE_PATH. Note: The Chrome driver and Image required are provided in the "resources" folder.
3. Go to **TestRunner.java** class and provide the path for features and this will all the test
   scenarios.
4. The test report will be generated under "testResult" as Json.