package com.practice.Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excel {
	
	@Test(enabled=false)
	public void readData() throws Exception
	{
		File file=new File("path");
		FileInputStream fis=new FileInputStream(file);
		String data = WorkbookFactory.create(fis).getSheet("sheet").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
		
	}

}
