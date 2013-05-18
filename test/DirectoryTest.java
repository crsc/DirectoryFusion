import org.junit.Test;
import static org.junit.Assert.*;

public class DirectoryTest {

    @Test
    public void directory() {
        Directory directory = new Directory("directory1");
        assertEquals(directory.name(),"directory1");
    }
    
    @Test
    public void numberOfFiles() {
        Directory directory = new Directory("dir1");
        File file = new File("file1");
        directory.addFile(file);
        assertEquals(directory.numberOfFiles(), 1);
    }
}