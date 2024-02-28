import java.io.*;
import java.util.StringJoiner;

public class Main {
    public static final String PATH_DIR = "Lesson_6";
    public static InputStream is = null;

    public static void main(String[] args) {
        //создали файл
        File fileCsv = new File(PATH_DIR, "test.csv");
        if (!fileCsv.exists()) {
            try {
                fileCsv.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        writerCsv(appDataToCsv(), fileCsv);
        readerCsv(fileCsv);
    }

    //подготовили данные к формату csv
    public static StringBuilder appDataToCsv() {
        //создали объект с данными
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][]{{100, 200, 123}, {300, 400, 500}});
        //подготовим к csv формату
        StringBuilder stringBuilder = new StringBuilder();
        StringJoiner resultStringArr = new StringJoiner(";");
        for (String header : appData.getHeader()) {
            resultStringArr.add(header);
        }
        stringBuilder.append(resultStringArr).append("\n");
        int[][] data = appData.getData();
        StringJoiner resultIntArr;
        for (int i = 0; i < data.length; i++) {
            resultIntArr = new StringJoiner(";");
            for (int j = 0; j < data[0].length; j++) {
                resultIntArr.add(Integer.toString(data[i][j]));
            }
            stringBuilder.append(resultIntArr).append("\n");
        }
        //System.out.println(stringBuilder);
        return stringBuilder;
    }

    public static void writerCsv(StringBuilder stringBuilder, File file) {
        try (Writer writer = new FileWriter(file)) {
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readerCsv(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}