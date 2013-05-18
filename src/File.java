import java.util.Calendar;
import java.util.Date;

public class File {
    Date date;
    String name;

    public File(String name) {
        this.date = Calendar.getInstance().getTime();
        this.name = name;
    }
    
    public String name(){
        return this.name;
    }
}
