public class Customer
{
	private foodmenu m1;
	
	public Customer(){}

	public Customer(foodmenu m1){
	this.m1 = m1;
	}
	
	public foodmenu getFoodmenu(){
		return m1;}

	public void order(){
	m1.hongshaorou();
	m1.gongbaojiding();
	}
}