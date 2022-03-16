public class fortext
{
	public static void main(String[] args){
    int sum = 0;
	for (int i=0 ; i<=100 ; i++ )
	{sum = sum + i;
	}
	System.out.println(sum);
	}
}

class multiplication_table99
{
	public static void main(String[] args){
		for (int i = 1; i <= 9 ; i++ )
	{
		for (int j =1;j <= i  ;j++ )
		{
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}
		System.out.print('\n');
	}
	}
}
class primenumber
{
	public static void main(String[] args){
        int count = 0;
		for (int i=2;i <= 100 ;i++ )
		{
			boolean b = true;
			for (int j = 2;j<i ;j++ )
			{
				if (i % j == 0)
				{
				    b = false;
					break;
				}
			}
			if (b)
			{
				System.out.print(i+" ");
                count++;
				if (count % 8 ==0)
				{
					System.out.print('\n');
				}
			}
		}
	}
}
