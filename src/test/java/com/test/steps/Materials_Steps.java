package com.test.steps;

import com.test.pages.Materials_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Materials_Steps {

	Materials_Page mp = new Materials_Page();

	@And("^I validate the fields in Category page$")
	public void i_validate_the_fields_in_category_page() throws Throwable {
		mp.validatingCategories();
	}

	@Then("^I navigate to category page and Add \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save button$")
	public void i_navigate_to_category_page_and_add_something_something_something_something_and_click_on_save_button(
			String maincategorytitle, String selectmaincategory, String subcategorytitle, String retailertitle)
			throws Throwable {
		mp.AddingCategories(maincategorytitle, selectmaincategory, subcategorytitle, retailertitle);
	}

	@And("^I validate the fields in Add Product$")
	public void i_validate_the_fields_in_add_product() throws Throwable {
		mp.validatingProduct();
	}

	@And("^I add product and select \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save button$")
	public void i_add_product_and_select_something_something_something_something_and_something_something_something_something_something_something_and_click_on_save_button(
			String maincategorytitle, String selectmaincategory, String subcategorytitle, String retailertitle,
			String productsku, String netprice, String grossprice, String packsize, String webaddress,
			String description) throws Throwable {
		mp.AddingProduct(maincategorytitle, selectmaincategory, subcategorytitle, retailertitle, productsku, netprice,
				grossprice, packsize, webaddress, description);
	}

	@And("^I add duplicate product and select \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save button$")
	public void i_add_duplicate_product_and_select_something_something_something_something_and_something_something_something_something_something_something_and_click_on_save_button(
			String maincategorytitle, String selectmaincategory, String subcategorytitle, String retailertitle,
			String productsku, String netprice, String grossprice, String packsize, String webaddress,
			String description) throws Throwable {
		mp.validatingDuplicateProduct(maincategorytitle, selectmaincategory, subcategorytitle, retailertitle,
				productsku, netprice, grossprice, packsize, webaddress, description);
	}
}
