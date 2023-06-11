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
    List<Integer> generated;

    public void initiateWB() {
        try {
            wb = new XSSFWorkbook(getClass().getClassLoader().getResourceAsStream("Kernel.xlsx"));
            sheet = wb.getSheetAt(0);
        } catch (IOException e) {
        }
    }

    public void test() {
        generated = new LinkedList<>();
        CellReference cellReferenceQues = new CellReference("E" + generated.get(2).toString()); 
        Row rowQues = sheet.getRow(cellReferenceQues.getRow());
        Cell cellQues = rowQues.getCell(cellReferenceQues.getCol());
    }


    public static void main(String[] args) {
        QuestionDirectory question = new QuestionDirectory();
        question.initiateWB();
        question.test();
    }

}
