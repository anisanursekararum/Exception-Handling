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
public class DemoMembuatEksepsi3 
    {
        public static int hitungFaktorial (int n)
        throws  NegativeNumberException 
        {
            if (n < 0)
            {
            throw new NegativeNumberException ("Bilangan tidak boleh negatif", n);
            }
            int hasil = 1;
            for (int i=n; i>=1; i--)
            {
                hasil *= i;
            }
            return hasil;
        }
        public static void main (String[] args)
        {
            System.out.println("Pada saat menghitung 5!");
            try
            {
                System.out.println("Hasil = " + hitungFaktorial(5));
            }
            catch (NegativeNumberException nne)
            {
                System.out.println("Bilangan = " + nne.getBilangan());
            }
            System.out.println("\n Pada saat menghitung -5!");
            try
            {
                System.out.println("Hasil = " + hitungFaktorial(-5));
            }
            catch(NegativeNumberException nne)
            {
                System.out.println("Bilangan : " + nne.getBilangan()); 
                nne.printStackTrace();
            }
        }
    }
