public class implementtest
{
	public static void main(String[] args){
	foodmenu t1 = new Americacooker();
	Customer g1 = new Customer(t1);
	g1.order();
	}
}