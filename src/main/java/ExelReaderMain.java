import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelReaderMain {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "E:\\WorkSpace\\Pre-productionEPAM\\ManualTestingExtendedEdition\\RegressionReport.xlsx";

        try {

            FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeSheet = workbook.getSheetAt(0);

            for (Row currentRow : dataTypeSheet) {

                for (Cell currentCell : currentRow) {

                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    } else if (currentCell.getCellTypeEnum() == CellType.BOOLEAN) {
                        System.out.print(currentCell.getNumericCellValue() + "--");

                    }
                }
                System.out.println();
            }
            workbook.close();
            excelFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
