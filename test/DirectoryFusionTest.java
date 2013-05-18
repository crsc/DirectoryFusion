
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DirectoryFusionTest {
    Directory dir1;
    Directory dir2;
    File file1;
    File file2;
            
    @Before
    public void DirectoryFusionTest(){
        dir1 = new Directory("dir1");
        dir2 = new Directory("dir2");
        file1 = new File("file1.txt");
        file2 = new File ("file2.txt");
    }

    @Test
    public void testDirectoryFusion() {
        dir1.addFile(file1);
        dir2.addFile(file2);
        DirectoryFusion instance = new DirectoryFusion();
        instance.directoryFusion(dir1, dir2);
        assertEquals(true, instance.directoryComparator(dir1,dir2));
    }
}