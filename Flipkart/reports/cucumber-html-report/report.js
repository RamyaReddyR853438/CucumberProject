$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FlipkartFeature/Flipkarttestcase.feature");
formatter.feature({
  "line": 2,
  "name": "Flipkart Shopping",
  "description": "",
  "id": "flipkart-shopping",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "validating login",
  "description": "",
  "id": "flipkart-shopping;validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Takes Screenshot",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "flipkart-shopping;validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 10,
      "id": "flipkart-shopping;validating-login;;1"
    },
    {
      "cells": [
        "7386670356",
        "",
        "ramya448"
      ],
      "line": 11,
      "id": "flipkart-shopping;validating-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "validating login",
  "description": "",
  "id": "flipkart-shopping;validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter \"7386670356\" and \"ramya448\" in the field",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Takes Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefLogin.chromeBrowser()"
});
formatter.result({
  "duration": 18395754418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7386670356",
      "offset": 7
    },
    {
      "val": "ramya448",
      "offset": 24
    }
  ],
  "location": "StepdefLogin.login(String,String)"
});
formatter.result({
  "duration": 585616493,
  "status": "passed"
});
formatter.match({
  "location": "StepdefLogin.loginToApp_signin()"
});
formatter.result({
  "duration": 90506939,
  "status": "passed"
});
formatter.match({
  "location": "StepdefLogin.Takessnapshot()"
});
formatter.result({
  "duration": 2491165882,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "validating search",
  "description": "",
  "id": "flipkart-shopping;validating-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tc_02_Search"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I launch chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Takes screenshot",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "flipkart-shopping;validating-search;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 23,
      "id": "flipkart-shopping;validating-search;;1"
    },
    {
      "cells": [
        "7386670356",
        "",
        "ramya448"
      ],
      "line": 24,
      "id": "flipkart-shopping;validating-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "validating search",
  "description": "",
  "id": "flipkart-shopping;validating-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tc_02_Search"
    },
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I launch chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter  \"7386670356\" and \"ramya448\" in the field",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Takes screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefOfferzone.chromeBrowser()"
});
formatter.result({
  "duration": 13813988157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7386670356",
      "offset": 10
    },
    {
      "val": "ramya448",
      "offset": 27
    }
  ],
  "location": "StepdefOfferzone.login(String,String)"
});
formatter.result({
  "duration": 523556653,
  "status": "passed"
});
formatter.match({
  "location": "StepdefOfferzone.loginToApp_signin()"
});
formatter.result({
  "duration": 190700475,
  "status": "passed"
});
formatter.match({
  "location": "StepdefOfferzone.login_offer()"
});
formatter.result({
  "duration": 4016640825,
  "status": "passed"
});
formatter.match({
  "location": "StepdefOfferzone.takes_a_screenshot()"
});
formatter.result({
  "duration": 5009607237,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "validating selection",
  "description": "",
  "id": "flipkart-shopping;validating-selection",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@tc_03_Selection"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Now enter  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Go to offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click on viewall",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "takes screenshot",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "flipkart-shopping;validating-selection;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 38,
      "id": "flipkart-shopping;validating-selection;;1"
    },
    {
      "cells": [
        "7386670356",
        "",
        "ramya448"
      ],
      "line": 39,
      "id": "flipkart-shopping;validating-selection;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "validating selection",
  "description": "",
  "id": "flipkart-shopping;validating-selection;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@tc_03_Selection"
    },
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Now enter  \"7386670356\" and \"ramya448\" in the field",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Go to offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click on viewall",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "takes screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefSelection.chromeBrowser()"
});
formatter.result({
  "duration": 15980908832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7386670356",
      "offset": 12
    },
    {
      "val": "ramya448",
      "offset": 29
    }
  ],
  "location": "StepdefSelection.login(String,String)"
});
formatter.result({
  "duration": 415118651,
  "status": "passed"
});
formatter.match({
  "location": "StepdefSelection.loginToApp_signin()"
});
formatter.result({
  "duration": 141001146,
  "status": "passed"
});
formatter.match({
  "location": "StepdefSelection.Offer_Selection()"
});
formatter.result({
  "duration": 508292252,
  "status": "passed"
});
formatter.match({
  "location": "StepdefSelection.Selectionpage_viewall()"
});
formatter.result({
  "duration": 11604979021,
  "status": "passed"
});
formatter.match({
  "location": "StepdefSelection.takes_a_screenshot()"
});
formatter.result({
  "duration": 1488585832,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 43,
  "name": "validating ProductDisplay",
  "description": "",
  "id": "flipkart-shopping;validating-productdisplay",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@tc_04_Display"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "Enter  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the field",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "click on Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Go to Offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Select the type of item from fashion and deals",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "takes Screenshot",
  "keyword": "Then "
});
formatter.examples({
  "line": 51,
  "name": "",
  "description": "",
  "id": "flipkart-shopping;validating-productdisplay;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 52,
      "id": "flipkart-shopping;validating-productdisplay;;1"
    },
    {
      "cells": [
        "7386670356",
        "",
        "ramya448"
      ],
      "line": 53,
      "id": "flipkart-shopping;validating-productdisplay;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 53,
  "name": "validating ProductDisplay",
  "description": "",
  "id": "flipkart-shopping;validating-productdisplay;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@tc_04_Display"
    },
    {
      "line": 1,
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "Enter  \"7386670356\" and \"ramya448\" in the field",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "click on Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Go to Offerzone",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Select the type of item from fashion and deals",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "takes Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefDisplayProduct.chromeBrowser()"
});
formatter.result({
  "duration": 24316525113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7386670356",
      "offset": 8
    },
    {
      "val": "ramya448",
      "offset": 25
    }
  ],
  "location": "StepdefDisplayProduct.login(String,String)"
});
formatter.result({
  "duration": 432002249,
  "status": "passed"
});
formatter.match({
  "location": "StepdefDisplayProduct.loginToApp_signin()"
});
formatter.result({
  "duration": 100900521,
  "status": "passed"
});
formatter.match({
  "location": "StepdefDisplayProduct.Offer_Selection()"
});
formatter.result({
  "duration": 438719678,
  "status": "passed"
});
formatter.match({
  "location": "StepdefDisplayProduct.Displayproductpage_Product()"
});
formatter.result({
  "duration": 34502909435,
  "status": "passed"
});
formatter.match({
  "location": "StepdefDisplayProduct.takes_a_screenshot()"
});
formatter.result({
  "duration": 478167077,
  "status": "passed"
});
});