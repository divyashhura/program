$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework/src/test/java/Feature/01_LoginPage.feature");
formatter.feature({
  "name": "Checking Functionality of the Login Page of OrangeHRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Checking Login functionality with valid Login Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in user and pass field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking Login functionality with valid Login Credentials",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "User enters \"admin\" and \"admin123\" in user and pass field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.UserEnters(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d98.0.4758.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSDT010\u0027, ip: \u002710.10.30.196\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\DIVYAS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60249}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b6b2d098cf8d7b0cc52d3cb33f1f6df8\n*** Element info: {Using\u003did, value\u003dtxtUsername}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.LoginPage.UserEnters(LoginPage.java:22)\r\n\tat ✽.User enters \"admin\" and \"admin123\" in user and pass field(C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework/src/test/java/Feature/01_LoginPage.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.UserClicksLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.VerifyHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework/src/test/java/Feature/03_RecruitPage.feature");
formatter.feature({
  "name": "Checking Functionality of the Recruit Page of OrangeHRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User is on Recruitment Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on Recruitment tag",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Candidates tag",
  "keyword": "When "
});
formatter.step({
  "name": "User selects the Job Title",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects the Vacancy",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects the \"\u003cdatesfrom\u003e\" and \"\u003cdatesto\u003e\" in YYYY-MM-DD form",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Search button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "datesfrom",
        "datesto"
      ]
    },
    {
      "cells": [
        "2022-04-02",
        "2022-05-02"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is on Recruitment Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on Recruitment tag",
  "keyword": "When "
});
formatter.match({
  "location": "RecruitPage.RecruitPage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d98.0.4758.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSDT010\u0027, ip: \u002710.10.30.196\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\DIVYAS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60249}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b6b2d098cf8d7b0cc52d3cb33f1f6df8\n*** Element info: {Using\u003dlink text, value\u003dRecruitment}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.RecruitPage.RecruitPage(RecruitPage.java:12)\r\n\tat ✽.User clicks on Recruitment tag(C:/Users/DivyashSinghHura/IdeaProjects/BDD_Framework/src/test/java/Feature/03_RecruitPage.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on Candidates tag",
  "keyword": "When "
});
formatter.match({
  "location": "RecruitPage.CandidatePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects the Job Title",
  "keyword": "Then "
});
formatter.match({
  "location": "RecruitPage.JobTitles()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects the Vacancy",
  "keyword": "Then "
});
formatter.match({
  "location": "RecruitPage.JobVacancy()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects the \"2022-04-02\" and \"2022-05-02\" in YYYY-MM-DD form",
  "keyword": "Then "
});
formatter.match({
  "location": "RecruitPage.CalenderDates(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "RecruitPage.Search()"
});
formatter.result({
  "status": "skipped"
});
});