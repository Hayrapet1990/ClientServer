package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(30120);
            Socket client = ss.accept(); // BLOCKING
        InputStream serverRead = client.getInputStream();
        OutputStream serverWrite = client.getOutputStream();
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(serverRead));
        BufferedWriter bufferedOutputStream = new BufferedWriter(new OutputStreamWriter(serverWrite))){
        String problem =bufferedInputStream.readLine();
        System.out.println(problem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("write answer");
        String answer =scanner.nextLine();
        bufferedOutputStream.write(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

