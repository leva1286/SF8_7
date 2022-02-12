import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  dd MM yyyy");
        System.out.println(dateFormat.format(calendar.getTime()));

        File file = new File("D:\\","isDirectory");
        System.out.println("Деректория создана: " + file.mkdir());

        for (int i = 0; i < 3; i++) {
            File file1 = new File("D:\\isDirectory", "test" + i);
            System.out.println("Файл создан: " + file1.createNewFile());
        }

            String[] inDirectory = file.list();
        for (int i = 0; i < Objects.requireNonNull(inDirectory).length; i++) {
            File fiel = new File("D:\\isDirectory", inDirectory[i]);
            System.out.println("Файл удален " + fiel.delete());
        }

        System.out.println("Деректория удалена: " + file.delete());
    }
}
