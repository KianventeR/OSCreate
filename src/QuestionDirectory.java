import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class QuestionDirectory {
    XSSFWorkbook wb;
    XSSFSheet sheet;
    public static QuestionDirectory question;

    String Ques;

    public void initiateWB() {
        try {
            wb = new XSSFWorkbook(getClass().getClassLoader().getResourceAsStream("Kernel.xlsx"));
            sheet = wb.getSheetAt(0);
        } catch (IOException e) {
        }
    }

    public String test() {
        CellReference cellReferenceQues = new CellReference("E2");
        Row rowQues = sheet.getRow(cellReferenceQues.getRow());
        Cell cellQues = rowQues.getCell(cellReferenceQues.getCol());
        Ques = cellQues.toString(); 

        return Ques;
    }


    public static void main(String[] args) {
        question = new QuestionDirectory();
        question.initiateWB();
        System.out.println(question.test());
    }

}
