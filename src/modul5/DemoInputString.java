/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.io.*;

/**
 *
 * @author Sekar Arum
 */
public class DemoInputString 
    {
        public static void main(String[] args) throws IOException
        {
            System.out.println("Masukkan nama Anda : ");
            String nama;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            nama = br.readLine();
            System.out.println("Halo " + nama + ", sudahkah Anda mengerti Java?");
        }
    }
