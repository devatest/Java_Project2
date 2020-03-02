package inter;

public class HSBCBank implements USBank, BrazilBank{

	//If a class is implementing any Interface, then its mandatory to define/override all the method of interface.
	//overriding from USBank
	public void credit(){

		System.out.println("HSBC ---credit");
	}

	public void debit(){
		
		System.out.println("HSBC ---debit");
	}
	
	public void transferMoney(){
		
		System.out.println("HSBC ---transferMoney");
	}

	//seperate methods of HSBCBank class
	public void carloan(){

		System.out.println("HSBC ---debit");
	}

	public void educationloan(){

		System.out.println("HSBC ---debit");
	}
	
	//overriding from BrazilBank
	public void mutualFund(){
		System.out.println("HSBC ---mutualFund");
	}
}
