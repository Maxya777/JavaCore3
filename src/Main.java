import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static StringBuilder str = new StringBuilder();

    public static void createFolder(File file) {
        if (file.mkdir()) {
            str.append("Папка " + file + " создана");
            str.append("\n");
        }
    }

    public static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                str.append("Файл " + file + " был создан");
                str.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        File src = new File("C://Games//src");
        File res = new File("C://Games//res");
        File saveGames = new File("C://Games//saveGames");
        File temp = new File("C://Games//temp");
        File main = new File("C://Games//src//main");
        File test = new File("C://Games//src//test");
        File drawables = new File("C://Games//res//drawables");
        File vectors = new File("C://Games//res//vectors");
        File icons = new File("C://Games//res//icons");
        File mainFile = new File("C://Games//src//main//Main.java");
        File utilsFile = new File("C://Games//src//main//Utils.java");
        File tempFile = new File("C://Games//temp//Temp.txt");

        createFolder(src);
        createFolder(res);
        createFolder(saveGames);
        createFolder(temp);
        createFolder(main);
        createFolder(test);
        createFolder(drawables);
        createFolder(vectors);
        createFolder(icons);
        createFile(mainFile);
        createFile(utilsFile);
        createFile(tempFile);


        try (FileWriter writer = new FileWriter("C://Games//temp//Temp.txt", false)) {
            writer.append(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
