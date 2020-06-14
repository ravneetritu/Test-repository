package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class taggingFeature {
	
@Given("user is on login screen")
public void user_is_on_login_screen() {
   System.out.println("On login screen");
   System.out.println("On login screen 2");
   System.out.println("On login screen 3");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
    System.out.println("username and password entered");
    System.out.println("username and password entered2");
    System.out.println("username and password entered3");
    System.out.println("username and password entered4");
}

@Then("user clicks on login button")
public void user_clicks_on_login_button() {
    System.out.println("login button clicked");
    System.out.println("login button clicked2");
    System.out.println("login button clicked3");
    System.out.println("login button clicked4");
}

@Then("user verifies the homeScreen")
public void user_verifies_the_homeScreen() {
  System.out.println("homeScreen verified1");
  System.out.println("homeScreen verified2");
  System.out.println("homeScreen verified3");
  System.out.println("homeScreen verified4");
}

@Then("user searches an item")
public void user_searches_an_item() {
    System.out.println("Item searched");
}

@Then("user selects the searched item")
public void user_selects_the_searched_item() {
    System.out.println("Item selected");
}

@Then("adds the item to cart")
public void adds_the_item_to_cart() {
    System.out.println("Items added to cart");
}

@Then("user verifies the item added to cart")
public void user_verifies_the_item_added_to_cart() {
    System.out.println("Item verified");
}

@Then("deletes the added item")
public void deletes_the_added_item() {
    System.out.println("Item removed from cart");
}

@Then("user makes the payment")
public void user_makes_the_payment() {
    System.out.println("Payment made successfully");
}

@Then("user receives the success message")
public void user_receives_the_success_message() {
   System.out.println("Success message received");
}

@Then("user verifies the home screen")
public void user_verifies_the_home_screen() {
System.out.println("Home screen verified");

}

@Then("user logs out from the application")
public void user_logs_out_from_the_application() {
    System.out.println("User logged out");
}

@When("user clicks ForgotPassword link")
public void user_clicks_ForgotPassword_link() {
    System.out.println("Forgot pawd link clicked");
}

@Then("user navigates to ForgotPassword screen")
public void user_navigates_to_ForgotPassword_screen() {
   System.out.println("User navigated to forgot pwd screen");
}

@Then("user enters the email id")
public void user_enters_the_email_id() {
System.out.println("User entered email");
}

@Then("user gets the success message")
public void user_gets_the_success_message() {
    System.out.println("User gets the success message");
}

@When("user clicks ChangePassword link")
public void user_clicks_ChangePassword_link() {
    System.out.println("Clicked on change password link");
}

@Then("user navigates to ChangePassword screen")
public void user_navigates_to_ChangePassword_screen() {
   System.out.println("User navigated to change password screen");
}

@Then("user verifies the number of items added to cart")
public void user_verifies_the_number_of_items_added_to_cart() {
    System.out.println("No. of items verified");
}

}
