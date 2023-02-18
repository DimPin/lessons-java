import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

public class Program2 {
    public static void main(String[] args) {
        File path = new File("db.txt");
        System.out.print(getFormatData(Parse(path)));
    }

    public static String getFormatData(String[][] data) {
        String[] info = new String[] { "Студент ", " получил ", " по предмету "};
        StringBuilder SB = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                SB.append(info[j]);
                SB.append(data[i][j]);
            }
            SB.append("\n");
        }
        return SB.toString();
    }

    public static int countLines(File path) {
        int count = 0;

        try {
            BufferedReader BR = new BufferedReader(new FileReader(path));
            while (BR.readLine() != null) count++;
            BR.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

        return count;
    }

    public static String[][] Parse(File path) {
        int countLine = countLines(path);
        int count = 0;

        String[][] parseData = new String[countLine][3];

        try {
            FileReader FR = new FileReader(path);
            BufferedReader BR = new BufferedReader(FR);
            String line = "";

            for (int i = 0; i < countLine; i++) {
                line = BR.readLine();
                for (String value : line.split(",")) {
                    parseData[i][count] = value.split(":")[1].replace("\"", "");
                    count++;
                }
                count = 0;
            }

            BR.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

        return parseData;
    }
}