import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileTest {
    

    @Test
    public void file() {
        File file = new File("prueba.txt");
        assertEquals("prueba.txt", file.name());
    }
}