public class supertest{
	public static void main(String[] args){
	master u = new master("lidg");
	u.shopping();
	}

}

class g
{
	String name;
	public g(){}
	public g(String name){
	this.name = name;}
}

class master extends g
{
	public master(){}
    public master(String name){
	super(name);
	}
	public void shopping(){
	System.out.println(super.name);
	}
}