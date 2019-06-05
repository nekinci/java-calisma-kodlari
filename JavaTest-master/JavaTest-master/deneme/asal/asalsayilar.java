package deneme.asal;

public class asalsayilar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//20 ile 90 arasindaki asal sayilari bulup ekrana basan kod//
		int flag=0,j=2;
		for(int i=20;i<=90;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j!=0)
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i+" ");
		}
		
	}

}
