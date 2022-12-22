import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.io.*;

import static java.lang.Math.pow;

class Main{
    public static void main(String []argh){

        try (ServerSocket serverSocket = new ServerSocket(5000)) {


            while(true) {
//                Socket socket = serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();
                new Echoer(serverSocket.accept()).start();
            }


        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());

        }



    }
}
