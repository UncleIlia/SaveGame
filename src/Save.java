import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {

    public void saveGame(String path, GameProgress condition){

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(condition);
            System.out.println("Object saved");
        } catch (IOException ex){
            System.out.println("Object was not saved");
        }

    }
}
