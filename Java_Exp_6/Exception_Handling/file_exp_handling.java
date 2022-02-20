import java.io.*;
public class file_exp_handling {

    public static void main(String args[]) throws Exception {

        try {

        FileInputStream fin = new FileInputStream("text.txt");

        int ch;

        while((ch=fin.read())!=-1) 
            System.out.print((char)ch);
        
        fin.close();
        
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
