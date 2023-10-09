/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bsk_dekodery_kodery;

import java.util.Scanner;

/**
 *
 * @author poker
 */

public class BSK_Dekodery_Kodery {
    
        static void action2(Scanner scanner)
        {
            System.out.println("Wprowadz haslo");
        }
        static void action3 (Scanner scanner)
        {
            System.out.println("Wprowadz dlugosc Plotka");
        }
        static void action4 (Scanner scanner)
        {
            System.out.println("Wprowadz klucz");
        }
        static boolean action(Scanner scanner)
        {
            System.out.println("Ktora akcja?");
            System.out.println("1.Szyfrowanie");
            System.out.println("2.Deszyfrowanie");
                 int method= scanner.nextInt();
                    switch(method)
                    {
                        case 1:
                            return true;
                            
                            
                        case 2:
                            return false;
                            
                        default:
                            return false;
                    }
            
        }
        

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
  
          Rail r = new Rail();
  
        MacierzA m_a = new MacierzA();

        MacierzB m_b = new MacierzB();
        Scanner myObj = new Scanner(System.in);
        while(true)
        {
            boolean szyfr=false;
            System.out.println("Który Algorytm?");
            System.out.println("1.Rail Fence");
            System.out.println("2.Macierzowy A");
            System.out.println("3.Macierzowy B");
            int algorithm = myObj.nextInt();
            System.out.println("1.Szyfrowanie");
            System.out.println("2.Deszyfrowanie");
                 int method= myObj.nextInt();
                    switch(method)
                    {
                        case 1:
                            
                            szyfr=true;
                            
                        case 2:
                            szyfr=false;    
                    }
                    System.out.println("Wpisz slowo");
                    String slowo=myObj.next();
                    if(algorithm==1)
                    {
                        System.out.println("Wpisz dlugosc plotka");
                        int klucz =myObj.nextInt();
                        if(szyfr==true)
                        {
                            System.out.println(r.szyfruj(slowo, klucz));
                        }
                        else
                        {
                            System.out.println(r.odszyfruj(slowo, klucz));
                        }
                    }
                    else
                    {
                         System.out.println("Wpisz klucz");
                         String klucz =myObj.next();
                         if(algorithm==2)
                         {
                            if(szyfr==true)
                            {
                                System.out.println(m_a.szyfruj(slowo, klucz));
                            }
                            else
                            {
                                System.out.println(m_a.odszyfruj(slowo, klucz));
                            }
                         }
                         else
                         {
                             if(szyfr==true)
                             {
                                 System.out.println(m_b.szyfruj(slowo, klucz));
                             }
                             else
                             {
                                 System.out.println(m_b.szyfruj(slowo, klucz));
                             }
                         }
                    }
               
           
                   
                    
        }
 
        
// TODO code application logic here
    }
    
}
