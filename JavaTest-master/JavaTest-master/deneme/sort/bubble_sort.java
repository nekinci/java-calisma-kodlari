package deneme.sort;

public class bubble_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sıralanmamis hali: ");
		int[] dizi={0,5,9,7,2,3,8};
		for(int i:dizi)
			System.out.print(i+" ");
		k_sort(dizi);
		System.out.println("\nSıralanmış hali: ");
		for(int j:dizi)
			System.out.print(j+" ");
	}
	public static void k_sort(int [] dizi)
	{
		int tmp;
		for(int i=0;i<dizi.length;i++){
			for(int j=0;j<dizi.length-1;j++){
				if(dizi[j]>dizi[j+1])
				{
					tmp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=tmp;
				}
			}
		}
	}
	

}
