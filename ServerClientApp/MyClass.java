import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.io.*;

import static java.lang.Math.pow;

class Main{
    public static void main(String []argh){

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while(true) {
                String echoString = input.readLine();
                if(echoString.equals("exit")) {
                    break;
                }
                output.println("Echo from server: " + echoString);
            }


        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());

        }



    }
}