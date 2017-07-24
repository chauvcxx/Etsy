Test Result:
Feature: Sample

  Scenario: Should be able to search for a product from the drop-down menu               [90m# featurefile.feature:3[0m
    [32mGiven [0m[32mJohn is viewing the Etsy landing page[0m                                          [90m# EtsyDropDown.navigate()[0m
    [32mWhen [0m[32mhe selects "[0m[32m[1mClothing & Accessories[0m[32m" and "[0m[32m[1mBelts & Braces[0m[32m" from the dropdown menu[0m [90m# EtsyDropDown.openDropdown(String,String)[0m
    [32mAnd [0m[32mhe clicks on "[0m[32m[1mBelts[0m[32m"[0m                                                             [90m# EtsyDropDown.searchProduct(String)[0m
    [32mThen [0m[32mdisplay for "[0m[32m[1mRunning[0m[32m" belts[0m                                                     [90m# EtsyDropDown.printresult(String)[0m

  Scenario: Should be able to search for a product from the icons [90m# featurefile.feature:9[0m
    [32mGiven [0m[32mJohn is viewing the Etsy landing page Icon[0m              [90m# EtsyIcon.navigateFromIcon()[0m
    [32mWhen [0m[32mhe selects "[0m[32m[1mClothing[0m[32m" and  "[0m[32m[1mWomen's Clothing[0m[32m"[0m            [90m# EtsyIcon.openDropdown(String,String)[0m
    [32mAnd [0m[32mclicks on "[0m[32m[1mTops & Tees[0m[32m"[0m                                   [90m# EtsyIcon.searchProd(String)[0m
    [32mAnd [0m[32mselects "[0m[32m[1mBlouses[0m[32m"[0m                                         [90m# EtsyIcon.searchProduct(String)[0m
    [32mThen [0m[32mdisplay for "[0m[32m[1mVintage Cotton[0m[32m" top[0m                         [90m# EtsyIcon.printresult(String)[0m

2 Scenarios ([32m2 passed[0m)
9 Steps ([32m9 passed[0m)
4m0.986s



1. I have used Data driven testing for the scenarios
2. The data can be entered in the featurefile and the desired search result would be displayed
3. Searchfunctionunction class contain the main functions
4. Etsydropdown and etsyicon class contains method definitions for the scenarios
5. I have used Cucumber , Selenium webdriver with Java
6. You need to have Cucumber and Selenium webdriver dependencies to run the code
7. The browser used is Firefox
8. Run the  etsy test class


UI Test cases:

1.Test whether user is able to Register successfully

2. Test whether user is able to signup successfully
 
3. Test whether user is able to search using the search box on the landing page

4. Test whether user is able to search using the drop down menu on the landing page

5. Test whether user is able to seslect the product from the icon menu on the landing page

6. Test whether user is able to add the product to the cart

7. Test whether user is able to continue shopping after adding a product  to the cart

8. Test whether user is able to add multiple products in the cart

9. Test whether user is able to remove products from the cart

10. Test whether user is able to choose different pay options 

11. Test whether user is able to checkout without email I'd

12. Test user is able to buy the desired product

13. Test whether user is able to register for "sell on etsy"

14. The user is able to list product after successfully registering with sell on etsy

API Test cases (General Test cases)

Test return value based on input condition

Does not return anything

Trigger some other API/event/interrupt

Test by updating the data structure - Updating data structure will have some outcome or effect on the system, and that should be authenticated

Test by modify certain resourcesn - If API call modifies some resources then it should be validated by accessing respective resources