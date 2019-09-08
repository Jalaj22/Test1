$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium java program/cucumber_Naveen/src/main/java/Features/mainMenuTags.feature");
formatter.feature({
  "line": 1,
  "name": "ShareKhan Main Menu Feature",
  "description": "",
  "id": "sharekhan-main-menu-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1599100,
  "status": "passed"
});
formatter.before({
  "duration": 397600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "MARKETWATCH Test",
  "description": "",
  "id": "sharekhan-main-menu-feature;marketwatch-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user present on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "verify MARKETWATCH",
  "keyword": "Then "
});
formatter.match({
  "location": "MainMenuTest.user_present_on_HomePage()"
});
formatter.result({
  "duration": 70850460600,
  "status": "passed"
});
formatter.match({
  "location": "MainMenuTest.verify_MARKETWATCH()"
});
formatter.result({
  "duration": 21795776800,
  "status": "passed"
});
formatter.after({
  "duration": 436548900,
  "status": "passed"
});
formatter.after({
  "duration": 1203140200,
  "status": "passed"
});
});