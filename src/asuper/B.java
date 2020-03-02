package asuper;

public class B extends A{
	int i = 20;
	public void sub(int i){

		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}

}
