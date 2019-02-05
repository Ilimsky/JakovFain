package J_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Дата: " + today);

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");
        String formattedDate = sdf.format(today);
        System.out.println("Дата (мм-дд-гг): " + formattedDate);

        sdf = new SimpleDateFormat("dd-MM-yy");
        formattedDate = sdf.format(today);
        System.out.println("Дата (дд-мм-гг): " + formattedDate);

        sdf = new SimpleDateFormat("EEE, MMM d, ''y");
        formattedDate = sdf.format(today);
        System.out.println("Дата (день недели, мес д, 'гг): " + formattedDate);

        sdf = new SimpleDateFormat("hh:mm:ss a");
        formattedDate = sdf.format(today);
        System.out.println("Время (чч:мм:сс) " + formattedDate);
    }
}
