package deneme.matris;

public class Javaa {
	public static void main(String[] args){
		int oyun[][]=new int[8][8];
		for (int i=0;i<8;i++){
			for(int j=0;j<8;j++)
				oyun[i][j]=0;
		}
		for (int i=0;i<8;i++){
			for(int j=0;j<8;j++)
				System.out.print(oyun[i][j]+"\t");
			System.out.print("\n");
		}
		
		
	}

}
