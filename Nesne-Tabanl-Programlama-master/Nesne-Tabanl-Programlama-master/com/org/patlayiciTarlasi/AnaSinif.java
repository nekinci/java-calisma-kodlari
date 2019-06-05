package com.org.patlayiciTarlasi;


class oyunAlani{
	protected int etki;
	protected int yapildimi;
	protected char tip;
	oyunAlani d[][]=new oyunAlani[8][8];
	public oyunAlani(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				d[i][j].yapildimi=0;
				d[i][j].tip='O';
				d[i][j].etki=0;
			}
		}
	}
}

public class AnaSinif {
	public static void main(String[] args){
		
	}
}
