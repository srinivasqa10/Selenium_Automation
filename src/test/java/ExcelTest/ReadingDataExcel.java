package ExcelTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("Sheet1"); // This is one method to get Sheet
        //XSSFSheet sheet = workbook.getSheetAt(0); //This is the another method to get Sheet
        int totalrows = sheet.getLastRowNum();
        int totalnoOfCells = sheet.getRow(1).getLastCellNum();

        System.out.println("no of rows: " + totalrows);
        System.out.println("no of cells: " + totalnoOfCells);

        for (int r=0; r<=totalrows; r++)
        {
            XSSFRow currentRow =sheet.getRow(r);

            for (int c=0; c<totalnoOfCells; c++) //According to Java it will count the columns from 0
            {
                XSSFCell cellvalue =currentRow.getCell(c);
                System.out.print(cellvalue.toString() + "\t");
            }
            System.out.println();
        }
    }
}
