package deneme.sort;

public class matris3x3 {
	public static void main(String[] args)
	{
		int matrice[][]=new int[3][3];
		int matrice1[][]=new int[3][3];
		int sonuc[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrice[i][j]=i+j;
				matrice1[i][j]=i+2*j;
				sonuc[i][j]=matrice[i][j]*matrice1[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+sonuc[i][j]);
			}
			System.out.println();
		}
		
		
	}
}