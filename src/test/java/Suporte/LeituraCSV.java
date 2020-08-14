package Suporte;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraCSV {
    public static void main(String[] args) {
        try {
            //csv file containing data
            String strFile = "C:\\Projetos\\openCSV\\csv\\exemplo.csv";
            CSVReader reader = new CSVReader(new FileReader(strFile));
            String [] nextLine;
            int lineNumber = 0;
            while ((nextLine = reader.readNext()) != null) {
                lineNumber++;

                // nextLine[] is an array of values from the line
                System.out.println(lineNumber + "-" + nextLine[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
