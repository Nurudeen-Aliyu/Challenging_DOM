Feature: Challenging_DOM

#TEST 01
Scenario: Test to verify that the page title matches the expected page title 'The Internet'
  Given that the Web Application is loaded on a browser
  Then the page title should be The Internet

#TEST 02
Scenario: Test to verify the Page Header
  Given that the Web Application is loaded on a browser
  Then the page Header Title should be Challenging DOM

#TEST 03
Scenario: Test to verify that the Blue Button is active
  Given that the Web Application is loaded on a browser
  When a user navigate to the blue button and click
  Then the Blue Button should be active

#TEST 04
Scenario: Test to verify that the Red Button is active
  Given that the Web Application is loaded on a browser
  When a user navigate to the red button and click
  Then the Red Button should be active

#TEST 05
Scenario: Test to verify that the Green Button is active
  Given that the Web Application is loaded on a browser
  When a user navigate to the green button and click
  Then the Green Button should be active

#TEST 06 (Not quite sure of the intended function of the 'edit link'. The test failed as there is no href attached to it)
Scenario: Test to verify that a user can EDIT the first table row
  Given that the Web Application is loaded on a browser
  When a user navigate to the edit link on the first table row and click
  Then the first row should be edited

#TEST 07 (Not quite sure of the intended function of the 'delete link'. The test failed as there is no href attached to it)
Scenario: Test to verify that a user can DELETE the table's sixth row
  Given that the Web Application is loaded on a browser
  When a user navigate to delete link on the table's second row and click
  Then the sixth row should be deleted

#Test 08
Scenario: Test to verify that a user is redirected to Elemental Selenium they the footer link is clicked
  Given that the Web Application is loaded on a browser
  When a user navigate to the footer and click on Elemental Selenium link
  Then the user should be redirected to Elemental Selenium page


#TEST 09
Scenario: Test to verify that canvas is displayed
  Given that the Web Application is loaded on a browser
  Then a canvas element should be displayed on the web page

#TEST 10
Scenario: Test to verify the number of table rows are ten
  Given that the Web Application is loaded on a browser
  Then the table rows on the web page should be ten


