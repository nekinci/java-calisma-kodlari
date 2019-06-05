package deneme.hazirMetodlar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class hazirMetodlardadeneme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// arrays.equals iki parametre alır ikiside dizi birbirini karşılaştırır.
		// arrays.sort  küçükten büyüğüe aldığı dizi parametresini sıralar.
		// arrays.binarySearch iki paramatre alır ilk aldığu parametrede ikinci aldığı parametreyi arar.
		//arrays.asList() bu metod diziyi liste yapısına çevirmeye yarar.
		//arrays.Copyof bu metod ile dizinin belli bir bölümü kopyalanır=> yenidizi=arrays.Copyof(dizi,3);
		//arrays.Copyofrange dizinin belirtilen indisleri arasındaki değerleri kopyalar=>yenidizi=arrays.copyofrange(dizi1,2,4);
		Integer dizi1 []={11,22,33,44};
		List liste=new ArrayList();
		Integer dizi2[]=Arrays.copyOf(dizi1, 2); // dizi 1 den 2 elemanı dizi2 ye kopyaladı.
		Integer dizi3[]=Arrays.copyOfRange(dizi1, 2, 4);
		liste=Arrays.asList(dizi1);
		//System.out.println(liste); //listeyi ekrana basar.
		//System.out.println(liste.get(1)); //1 nolu indisteki elemanı gösterir.
		//for(int i:dizi2)
			//System.out.print(i);
		for(int j:dizi3)
			System.out.println(j);
		

	}

}
