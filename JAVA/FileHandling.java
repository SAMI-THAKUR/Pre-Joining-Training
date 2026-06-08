import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        // File Class
        File fl = new File("sample.txt");
        try{
            // createNewFile (create a file if it does not exist)
            if(fl.createNewFile()){
                System.out.println("new file created");
            }else{
                System.out.println("file already exists");
            }

            // FileWriter (existing data gets overwritten)
            FileWriter writer = new FileWriter(fl);
            writer.write("Name : Sami\n");
            writer.write("Age : 21\n");
            writer.write("Branch : AI & DS\n");

            writer.close();

            System.out.println("Data Written Successfully");

            // read file using Scanner
            Scanner reader = new Scanner(fl);
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
            reader.close();

            // BufferedWriter (faster writing using buffering)
            BufferedWriter bw = new BufferedWriter(new FileWriter(fl));
            bw.write("/n using buffer write");
            bw.close();

            // BufferReader (faster reading using buffering)
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

            // Append write (dont want to overwrite the file)
            writer = new FileWriter(fl, true);
            writer.write("APPEND THE DATE");

            // File Information

            System.out.println("\nFile Name : "+ fl.getName());
            System.out.println("Path : "+ fl.getAbsolutePath());
            System.out.println("Readable : "+ fl.canRead());
            System.out.println("Writable : "+ fl.canWrite());
            System.out.println("Size : "+ fl.length());

        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
