package com.org.File;
import java.io.*;
import java.util.*;

public class scennerSinifi {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/nekinci/Masaüstü/file6.txt");
		try{
			Scanner s=new Scanner(f);
			while(s.hasNextLine()){
				String veri=s.nextLine();
				System.out.println(veri+" "+s.hasNextInt());
				
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
