package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {



 // Elementos Web
  
  By Username = By.id("user-name"); 
  By Password = By.id("password");
  By Btn =By.id("login-button"); 
  By Backpack = By.id("add-to-cart-sauce-labs-backpack");
  By Carrinho =By.xpath("//a[contains(@class,'shopping_cart_link')]");
  By Checkout = By.id("checkout");
  By Menu = By.xpath("//button[contains(.,'Open Menu')]");
  By Logout = By.xpath("//a[contains(.,'Logout')]");
  By FirstName =By.id("first-name"); 
  By LastName = By.id("last-name"); 
  By PostalCode =By.id("postal-code");
  By Continue = By.id("continue"); 
  By Finish = By.id("finish");
  By LabsBike = By.id("add-to-cart-sauce-labs-bike-light");
  By Bolt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
  By continueShopping = By.id("continue-shopping");
  
  public By getUsername() {
	  return Username; 
	  }
  
  public By getPassword() { 
	  return Password; 
	  }
  
  public By getBtn() { 
	  return Btn; 
	  }
  
  public By getBackpack() {
	  return Backpack; 
	  }
  
  public By getCarrinho() {
	  return Carrinho; 
	  }
  
  public By getCheckout() { 
	  return Checkout; 
	  }
  
  public By getMenu() {
 return Menu;
  
  }
  
  public By getLogout() {
  return Logout;
  
 }
  
  public By getFirstName() { 
	  return FirstName; 
	  }
  
  public By getLastName() { 
	  return LastName; 
  }
  
  public By getPostalCode() { 
	  return PostalCode; 
	  }
  
  public By getContinue() { 
	  return Continue; 
	  }
  
 public By getFinish() {
	 return Finish; 
	 }
  
 public By getLabsBike () {
	return Backpack;
	 }
 public By getBolt() {
	 return Bolt;
 }
 public By getcontinueShopping() {
	 return continueShopping;
  }
}
 