import java.io.File;

public class Delete {

    public void deleteFile (String filePath){
        File file = new File(filePath);
            if(file.delete()){
                System.out.println("File deleted");
            } else
                System.out.println("File not was deleted");

    }
}
