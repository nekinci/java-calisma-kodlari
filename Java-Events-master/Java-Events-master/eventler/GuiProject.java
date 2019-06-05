package com.org.eventler;
import javax.swing.*;
public class GuiProject extends JFrame {

	public GuiProject(){
		super("Pencere bileşenimiz");//üst sınıfın constructor una katarı girdik.
		this.setSize(300, 400); ///Frame'in boyutunu ayarladık.
		this.setAlwaysOnTop(true);//her zaman üstte durması için.
		this.setVisible(true); //görünür yaptık,bu şart.
		this.setResizable(false);//boyutlandırma özelliğini false yaptık.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// kapama tuşuna basıldığında neler olacağını bildrdik.
		System.out.println(this.getContentPane());//modeli getirirç
		System.out.println(this.getLayout());//Layout bilgisini verir.
		System.out.println(this.getMaximumSize()); //maximum boyutları verir.
		System.out.println(this.getSize()); //anlık boyutu verir.
		System.out.println(this.getTitle());//Frame başlığını döndürür.
	}
	public static void main(String[] args) {
		GuiProject gp=new GuiProject();
	}

}
