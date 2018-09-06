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
public class NegativeNumberException extends Exception
{
       private int bilangan;
       //default constructor
       NegativeNumberException(){}
       //constructor dengan parameter bertipe string
       NegativeNumberException (String pesan)
       {
            super(pesan);
       }
       //constructor dengan parameter bertipe string dan int
       NegativeNumberException(String pesan, int nilai)
       {
           super(pesan);
           bilangan = nilai;
       }
       public int getBilangan()
       {
           return bilangan;
       }
}
