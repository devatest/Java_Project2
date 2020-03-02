package inter;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body - only method prototype
	//in Interface, We can declare the variables, vars are by default static in nature.
	//no static method in Interface
	//no Main method in Interface
	//we can not create the object of Interface
	//Interface is abstract in nature.
	//we achieve 100% abstraction
}
