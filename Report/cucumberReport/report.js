$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework(POM)/src/test/java/Feature/01_Login.feature");
formatter.feature({
  "name": "Checking Functionality of the Login Page of OrangeHRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login functionality with valid Login Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password in user and pass field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSD.UserLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.LoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSD.UserOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework(POM)/src/test/java/Feature/02_HomePage.feature");
formatter.feature({
  "name": "Checking Functionality of the Home Page of OrangeHRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is on Home Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on PIM tag",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSD.UserClickPIM()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"PageFactory.ObjectFactory.getlogin()\" because \"StepDefinition.HomePageSD.obj\" is null\r\n\tat StepDefinition.HomePageSD.UserClickPIM(HomePageSD.java:16)\r\n\tat ✽.User clicks on PIM tag(C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework(POM)/src/test/java/Feature/02_HomePage.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on Add Employee tag",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSD.AddEmployee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters firstname and lastname in the fields",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.UserEnterDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.UserAddDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSD.UserSaveDetails()"
});
formatter.result({
  "status": "skipped"
});
});