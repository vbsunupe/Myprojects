package stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import base.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.Mobilepage;
import pages.Productcomparisonlist;
import pages.Shoppingcart;

public class Stepdef {
	Homepage homepage=new Homepage(Baseclass.getDriver());
	Mobilepage mobilepage=new Mobilepage(Baseclass.getDriver());
	Shoppingcart shoppingcart=new Shoppingcart(Baseclass.getDriver());
	Productcomparisonlist product=new Productcomparisonlist(Baseclass.getDriver()); 

	@Given("user launch guru99 application {string}")
	public void user_launch_guru99_application(String url) {
		Baseclass.getDriver().get(url);

	}

	@When("user click on Mobile Menu")
	public void user_click_on_mobile_menu() {
		homepage.clickonmobilemenu();	

	}


	@Then("validate the title of the page should be {string}")
	public void validate_the_title_of_the_page_should_be(String title) {
		homepage.homepagepagetitle().contains(title);

	}

	@Then("validate the title of the mobile page should be {string}")
	public void validatethetitleofthemobilepage_shouldbe(String title1) {
		mobilepage.mobilepagetitle().contains(title1);

	}

	@When("user select sortby dropdown as {string}")
	public void selectoptionfromdropdown(String strArg1) {
		mobilepage.selectdropdown();
	}


	@Then("Verify all the Products are sorted by  name.")
	public void verify_all_the_products_are_sorted_by_name() {
		mobilepage.verifyproductsortedbyname();
		
		

	}



	//================================================2


	@Then("in the list of all Mobile, read the cost of Sony Xperia Mobile, Note this Value")
	public void in_the_list_of_all_mobile_read_the_cost_of_sony_xperia_mobile_note_this_value() {
		mobilepage.readsonyxperiacost();

	}
	@Then("Click on Sony Xperia Mobile")
	public void click_on_sony_xperia_mobile() {
		mobilepage.clicksonyxperia();
	}

	@And("Read the Sony Xperia Mobile from Detail page")
	public void read_the_sony_xperia_mobile_from_detail_page() {
		mobilepage.resdsonyxperiacostondetailpage();
	}
	@Then("Copmare Vaule In Step 3 & Step 5")
	public void copmare_cost() {

		assertEquals(mobilepage.readsonyxperiacost(), mobilepage.resdsonyxperiacostondetailpage());
	}

	//=====================================================================================3

	@Then("In the list of all Mobile, click on ADD TO CART for Sony Xperia mobile")
	public void inthelistofallmobileclickonaddtocartforsonyxperiamobile() {
		mobilepage.sonyxperiaaddtocart();
	} 
	@And("Change QTY value to 1000 and click UPDATE button")
	public void change_qty_value_to_1000_and_click_update_button() {
		shoppingcart.qtyinputandupdate();

	}
	@When("Change QTY value to {int} and click UPDATE button.")
	public void change_qty_value_to_and_click_update_button(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		shoppingcart.qtyinputandupdate();
	}
	@Then("Verify the error message {string}")
	public void verify_the_error_message_something(String errormessage) {
		shoppingcart.emptycartmessage().contains(errormessage);

	}

	@And("Click on EMPTY CART link in the footer of list of all mobiles")
	public void click_on_empty_cart_link_in_the_footer_of_list_of_all_mobiles() {
		shoppingcart.emptycart();
	}

	@Then("Verify Cart is empty {string}")
	public void verify_cart_is_empty_something(String cartempty) {
		shoppingcart.emptycartmessage().contains(cartempty);
	}
	//============4======================//

	@Then("Click on Add to Compare for two Mobiles")
	public void click_on_add_to_compare_for_two_mobiles() {
		mobilepage.comparemobiles();


	}
	@Then("Click on Comapre button.")
	public void click_on_comapre_button() {
		mobilepage.clickoncompare();

	}

	@Then("Verify the pop up window and check that the products are reflected in it.")
	public void verify_the_pop_up_window_and_check_that_the_products_are_reflected_in_it() {
		product.verifypopup();

	}


	@Then("Close the popup window.")
	public void close_the_popup_window() {
		product.closewindow();

	}
}











