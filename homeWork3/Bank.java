package homeWork3;

/** Goitom Haishe
 Bank class holds the main method that runs the whole program.**/ 
 
// we define a class called bank 
public class Bank {
	private double routingNumber;

	public Bank() {
		routingNumber = 00000000;
	}

	// get and return the routingNumber
	 
	public double getRoutingNumber() {
		return routingNumber;
	}

	// we have to set the  routingNumber
	
	 
	public void setRoutingNumber(double routingNumber) {
		this.routingNumber = routingNumber;
	}

    // we gonna create a  new customer 
	public Customer createNewCustomer(String firstName, String lastName) {
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		return customer;
}	
    // the bank class will contain the main method 
    // we define the balance, withdraw, deposite, and account number 
	public static void main(String[] args) {
		Bank bank = new Bank();
      // creat a customer 
		Customer customer = new Customer();
		customer = bank.createNewCustomer("Goitom", "Hadishe");
      // write the person account information 
		Account info = new Account();
		info = customer.getAccount();
		info.setaccountNumber(12346281);
		info.setBalance(1000);
		info.withdrawFunds(200);
		info.depositFunds(50);
		System.out.println("Customer Name: " + customer.getFirstName() + " " + customer.getLastName());
		info.printAccountInfo();

		System.out.println();

		customer = bank.createNewCustomer("Kassa", "Kirros");
		info = customer.getAccount();
		info.setaccountNumber(1092983);
		info.setBalance(300);
		info.withdrawFunds(100);
		info.depositFunds(50);
		System.out.println("Customer Name: " + customer.getFirstName() + " " + customer.getLastName());
		info.printAccountInfo();

		System.out.println();

		Customer customer2 = new Customer("Hirut", "Dessie", 10000);
		Account info2 = new Account();
		info2 = customer2.getAccount();
		info2.setaccountNumber(6666667);
		info2.withdrawFunds(100);
		info2.depositFunds(50);
		System.out.println("Customer Name: " + customer2.getFirstName() + " " + customer2.getLastName());
		info2.printAccountInfo();
		
		Customer customer3 = new Customer("Kass", "Kirros", 3);
		Account account3 = customer3.openAccount();
		System.out.println("Customer Name: " + customer3.getFirstName() + " " + customer3.getLastName());
		account3.printAccountInfo();
	}

}