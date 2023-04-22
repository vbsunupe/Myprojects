

  Feature:Mobile Ecommerce application
  Background:
   Given user launch guru99 application "http://live.techpanda.org/index.php/"
   When user click on Mobile Menu 
  
 Scenario:To verify sortby functionality
   
    Then validate the title of the page should be "THIS IS DEMO SITE"
    
    Then validate the title of the mobile page should be "MOBILE"
    When user select sortby dropdown as "Name" 
    Then Verify all the Products are sorted by  name.
 

 Scenario:To Verify that cost of product in list page and details page are equal
    
    Then in the list of all Mobile, read the cost of Sony Xperia Mobile, Note this Value
    Then Click on Sony Xperia Mobile
    And Read the Sony Xperia Mobile from Detail page
    Then Copmare Vaule In Step 3 & Step 5
    
    
 Scenario:To Verify that you cannot add more Product in cart than the product available in store

   And In the list of all Mobile, click on ADD TO CART for Sony Xperia mobile
   When Change QTY value to 1000 and click UPDATE button.
   Then Verify the error message "Sony Xperia was added to your shopping cart."
   And Click on EMPTY CART link in the footer of list of all mobiles
   Then Verify Cart is empty "SHOPPING CART IS EMPTY"
   
  Scenario:To Verify that you are able to Compare two products.
 
  Then Click on Add to Compare for two Mobiles
  And Click on Comapre button.
  #Then Verify the pop up window and check that the products are reflected in it.
  And Close the popup window. 
  
  

    