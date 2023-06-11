import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    public XSSFSheet initiateWB(String topic) {
        try {
            wb = new XSSFWorkbook(getClass().getClassLoader().getResourceAsStream("questions\\"+topic+".xlsx"));
            sheet = wb.getSheetAt(0);
        } catch (IOException e) {
        }

        return sheet;
    }

    public LinkedList<String> test(int item, XSSFSheet sheet) {
        LinkedList <String> question_set = new LinkedList<>();
        char [] cols = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
                    // A. Item, B. Topic, C. Question, D. (A), E. (B), F.(C), G. (D), H. Correct Answer
        Random rand = new Random();
        int num = item;
        
        for(int i = 1; i < 8 + 1; i++){
            // String letter = (String)cols[i] + String.valueOf(i);
            CellReference cellReferenceQues = new CellReference(String.valueOf(cols[i - 1]) + num);
            Row rowQues = sheet.getRow(cellReferenceQues.getRow());
            Cell cellQues = rowQues.getCell(cellReferenceQues.getCol());
            Ques = cellQues.toString(); 
            if(i == 1){
                Ques = Ques.replace(".0", "");

            }
            question_set.add(Ques);

      }
        
        return question_set;  
        
    }


    public static void main(String[] args) {
        question = new QuestionDirectory();
        String topic = "Protection";
        int item = 12;
        question.initiateWB(topic);
        // LinkedList<String> set = question.test(item, );
        // System.out.println(set);
    }

}
