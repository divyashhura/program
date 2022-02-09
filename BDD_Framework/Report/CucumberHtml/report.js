$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework/src/test/java/Feature/Login.feature");
formatter.feature({
  "name": "Checking Login Functionality of the Application",
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
  "location": "LoginPage.UserOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username in username textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.UserEntersUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password in password textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.UserEntersPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.UserClicksLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.VerifyHomePage()"
});
formatter.result({
  "status": "passed"
});
});