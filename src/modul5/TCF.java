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
public class TCF 
    {
        public TCF (){}
        public static void main(String args[])
        {
            int nol = 0;
            int angka = 10;
            
            try
            {
                int hasil = angka/nol;
                System.out.println("Hasil = " +hasil);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Terjadi pembagian dengan nol.Exception ditangkap.");
            }
            finally
            {
                System.out.println("kalimat di blok finally");
            }
            System.out.println("kalimat di luar blok try-catch-finally");
        }
    }
