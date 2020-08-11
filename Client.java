package org.example;
import java.io.*;
import java.util.Scanner;
import java.net.Socket;

public class Client {
int a;
int ag;
    public static void main(String[] args)  {

         try (Socket s = new Socket("192.168.2.53", 30120);
              InputStream clientRead = s.getInputStream();
              OutputStream clientWrite = s.getOutputStream();
              BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(clientRead));
              BufferedWriter bufferedOutputStream = new BufferedWriter(new OutputStreamWriter(clientWrite))) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("write problem");
             String text =scanner.nextLine();
             bufferedOutputStream.write(text);
             String answer =bufferedInputStream.readLine();
             System.out.println(answer);
     } catch (IOException e) {
             e.printStackTrace();
         }
    }
    }
