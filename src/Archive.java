import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Archive {
    public void zipFiles(String pathToArchive, String archivedObject){
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathToArchive));
            FileInputStream fis= new FileInputStream(archivedObject);)
        {
            ZipEntry entry1=new ZipEntry(archivedObject);
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
            System.out.println("Object archived");
        }
        catch(Exception ex){

            System.out.println("object was not archived");
        }
    }
}
