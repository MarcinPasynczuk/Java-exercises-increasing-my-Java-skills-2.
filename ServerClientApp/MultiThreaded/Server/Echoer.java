import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Echoer extends Thread{
    private Socket socket;
    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
 try {
     BufferedReader input = new BufferedReader(
     new InputStreamReader(socket.getInputStream()));
     PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

     while (true){
         String echoString = input.readLine();
         System.out.println("Recived input: " +echoString);
         if(echoString.equals("exit")){
             break;
         }

         try {
            Thread.sleep(15000);
         } catch (InterruptedException e) {
             System.out.println("Thread problem");
         }

        output.println(echoString);
     }


 } catch (Exception e) {
     System.out.println("Oops: " + e.getMessage());
 } finally {
     try {
         socket.close();
     } catch (IOException e) {
         // ok
     }

 }
    }
}
