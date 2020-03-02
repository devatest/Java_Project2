package inter;

public class Test {

	public static void main(String[] args) {           // diagram URL: https://www.screencast.com/t/Dz7h7Q1K
		
		System.out.println(USBank.min_bal);
		HSBCBank obj = new HSBCBank();
		obj.credit();
		obj.debit();
		obj.transferMoney();
		obj.carloan();
		obj.educationloan();
		obj.mutualFund();
		
		//dynamic polymorphism:
		//child class object can be referred by parent Interface reference var
		
		USBank a = new HSBCBank();
		a.credit();
		a.debit();
		a.transferMoney();
	}

}
