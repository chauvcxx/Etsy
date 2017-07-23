Feature: Sample

Scenario: Should be able to search for a product from the drop-down menu
Given John is viewing the Etsy landing page
When he selects "Clothing & Accessories" and "Belts & Braces" from the dropdown menu
And he clicks on "Belts"
Then the price should be displayed for "Running" belts 

Scenario: Should be able to search for a product from the icons
Given John is viewing the Etsy landing page Icon
When he selects "Clothing" and  "Women's Clothing"
And clicks on "Tops & Tees"
And selects "Blouses"
Then the price should be displayed for "Vintage Cotton" top 



