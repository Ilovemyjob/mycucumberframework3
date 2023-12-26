$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US1001_user_should_add_data.feature");
formatter.feature({
  "name": "US1001_user_should_add_data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatable"
    },
    {
      "name": "~@hooks"
    }
  ]
});
formatter.scenario({
  "name": "TC01_Testing_the_data_tables_web_page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@datatable"
    },
    {
      "name": "~@hooks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the datatables page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_is_on_the_datatables_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_clicks_on_the_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the firstname",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the lastname",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the position",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_position()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the office",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_office()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the extension",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the startdate",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_startdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the salary",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_enters_the_salary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the create button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.user_clicks_on_the_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for the first name",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.search_for_the_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the name fields contains first name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.DataTablesStepDefinition.verify_the_name_fields_contains_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});