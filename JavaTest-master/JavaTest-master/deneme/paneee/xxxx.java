package deneme.paneee;
import javax.swing.JOptionPane;
public class xxxx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = JOptionPane.showInputDialog("Bir şeyler yazın: "); //veri almak için showİnputDiaolg
		int yeniSayi=Integer.parseInt(s1);
		JOptionPane.showMessageDialog(null, "Girdiginiz sayi: "+yeniSayi,"Sonuç",JOptionPane.YES_NO_OPTION);
		//ilki null,ikincisi mesajımız, üçüncüsü pencere başlığı,dördüncüsü simge ;
		//veri göstermek için //showMessageDialog;
	}

}
