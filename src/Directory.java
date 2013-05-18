
import java.util.ArrayList;
import java.util.List;


public class Directory {
    
    private String name;
    List<File> fileList;

    public Directory(String name){
        this.name = name;
        fileList = new ArrayList();
    }
    
    public String name(){
        return name;
    }
    
    public void addFile(File file){
        fileList.add(file);
    }
    
    public int numberOfFiles(){
        return fileList.size();
    }
}
