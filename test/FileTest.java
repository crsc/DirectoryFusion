import org.junit.Test;
import static org.junit.Assert.*;

public class FileTest {
    

    @Test
    public void file() {
        File file = new File("prueba.txt");
        assertEquals("prueba.txt", file.name());
    }
}