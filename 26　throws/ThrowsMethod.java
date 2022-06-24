import java.io.*;
public class ThrowsMethod {
    public static void main(String[] args) {
        WriteFile wf = new WriteFile();
        try {
            wf.open();
            wf.write();
        } catch(IOException e ) {
            System.out.println("IOException���������܂���");
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Exception���������܂����B");
            e.printStackTrace();
        }finally {
            wf.close();
        }
    }
}