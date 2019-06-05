package deneme.metod1;

public class overloadMetodlar {

	/**
	 * @param args
	 */
	static int carp(int a,int b)
	{
		return a*b;
	}
	static int carp(int a,int b,int c){
		return a*b*c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(carp(3,5));
		//System.out.println(carp(3,5,2));
		dikdortgen('O');
	}
	static void dikdortgen(char a)
	{
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++)
			{
				if(i==0||i==4){
					System.out.print(a);
				}
				else{
					if(j==0||j==9)
						System.out.print(a);
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
