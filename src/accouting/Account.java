package accouting;

public class Account {
  private String Number;
  private double Balance;
  private String Name;
  private String Email;
  private String PhoneNUmber;
  
  public Account (String Number,double Balance,String Name,String Email,String PhoneNumber) {
	  this.Number=Number;
	  this.Balance=Balance;
	  this.Name=Name;
	  this.Email=Email;
	  this.PhoneNUmber=PhoneNumber;
	  
  }
  public void depositeMoney(double deposited) {
	  System.out.println("You deposited "+deposited+" amount on bank account");
	  this.Balance+=deposited;
	  System.out.println("Current Amount is "+Balance);
	  
	  
  }
  public void withDrawed(double withdraw) {
	  if(this.Balance-withdraw<0) {
		  System.out.println("Your balance is low to withdraw "+withdraw+"Amount");
	  }
	  else {
		this.Balance-=withdraw;  
		System.out.println("You withdrawed "+withdraw+
				" your remain with "+this.Balance+"Balance");
	  }
  }
  public void remained(double remain) {
	  
  }
  
public String getNumber() {
	return Number;
}
public void setNumber(String number) {
	Number = number;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhoneNUmber() {
	return PhoneNUmber;
}
public void setPhoneNUmber(String phoneNUmber) {
	PhoneNUmber = phoneNUmber;
}
  
  
}
