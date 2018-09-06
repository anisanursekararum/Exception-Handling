/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author Sekar Arum
 */
public class DemoThrow 
    {
        public static void main(String args[])
        {
            DataMhs obj = new DataMhs();
            obj.setNim("101533402134");
            obj.setNama("Rudi");
            obj.setNilai(80);
            
            System.out.println("NIM : " + obj.getNim());
            System.out.println("Nama : " + obj.getNama());
            System.out.println("Nilai : " + obj.getNilai());
        }
    }
