import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class PrintFile {
    public static void main(String[] args) {

        if (args.length <1){
            System.out.println("Specify file name!");
            return;}
        String fileName=args[0];
        System.out.println("Opening file" +fileName);

        try{
            Stream<String> lines= Files.lines (Paths.get(fileName));
            lines.forEach(System.out::println);}

        catch (IOException ex){
            System.out.println("File not found");
            ex.printStackTrace();
        }
    }
}
