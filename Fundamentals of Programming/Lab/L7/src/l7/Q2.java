/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;

/**
 *
 * @author HP
 */
public class Q2 {

    public static void main(String[] args) {
        //Q2
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter out = new PrintWriter(new FileOutputStream("index.html"));
            while (in.hasNextLine()) {
                out.println(in.nextLine());
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
