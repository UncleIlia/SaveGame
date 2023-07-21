public class Main {

    public static void main(String[] args) {

        GameProgress condition1 = new GameProgress(1, 2, 3, 5.0);
        GameProgress condition2 = new GameProgress(2, 3, 4, 10.0);
        GameProgress condition3 = new GameProgress(3, 4, 5, 15.0);

        Save saveObject = new Save();

        saveObject.saveGame("D://Games1//savegames//condition1.txt", condition1);
        saveObject.saveGame("D://Games1//savegames//condition2.txt", condition2);
        saveObject.saveGame("D://Games1//savegames//condition3.txt", condition3);

        Archive archive = new Archive();

        archive.zipFiles("D://Games1//savegames//condition.zip", "D://Games1//savegames//condition1.txt");
        archive.zipFiles("D://Games1//savegames//condition.zip", "D://Games1//savegames//condition2.txt");
        archive.zipFiles("D://Games1//savegames//condition.zip", "D://Games1//savegames//condition3.txt");

        Delete delete = new Delete();

        delete.deleteFile("D://Games1//savegames//condition1.txt");
        delete.deleteFile("D://Games1//savegames//condition2.txt");
        delete.deleteFile("D://Games1//savegames//condition3.txt");
    }
}
