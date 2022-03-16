public class method01
{
	public static void main(String[] args){
		//method01.sum(10,20);
		System.out.println(m());
	}
	public static void sum(int i,int j){
		System.out.println(i+"+"+j+"="+(i+j));
	}
	public static int m(){
		if (10>3)
		{
			return 1;
		}
		return 0;
	}
}
class sumn
{
	public static void main(String[] args){
		int n = 4;
	    System.out.println(sumn.sum(n));
	}
	public static int sum(int n){
	if (n==1)
	{
		return 1;
	}
	return n + sum(n-1);
	}
}