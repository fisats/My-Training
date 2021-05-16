package excelreadpackage;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException 
	
	{
		ExcelCode obj=new ExcelCode();
		String str=obj.readData(1,0);
		System.out.println(str);
		
		String str1=obj.readData(0,1);
		System.out.println(str1);
		
		String str3=obj.readData(0, 3);
		System.out.println(str3);
		
		// TODO Auto-generated method stub

	}

}
