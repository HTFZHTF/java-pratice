public class object
{
	public static void main(String[] args){
	Husand denchao = new Husand();
	denchao.name ="denchao";

	Wife sunli = new Wife();
	sunli.name ="sunli";

	denchao.b = sunli;
	sunli.h = denchao;
	System.out.println(denchao.name);
	System.out.println(sunli.h.name);
	System.out.println(sunli.name);
	System.out.println(denchao.b.name);

	}
}