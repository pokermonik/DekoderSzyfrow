/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsk_dekodery_kodery;
/**
 *
 * @author poker
 */
public class MacierzA {
    
    public MacierzA()
    {
        
    }
    public String szyfruj(String slowo, String klucz)
    {
        String klucz1 = klucz.replace("-","");
        String wynik="";
        float dlugoscKlucza= klucz1.length();
        float d =slowo.length()/dlugoscKlucza;
        if(d%1!=0)
        {
            d= (float) Math.ceil(d);   
        }
        for(int j=0;j<d;j++)
        {
            for (int i=0;i<dlugoscKlucza;i++)
            {
                int a = (klucz1.charAt(i)-'0');
                
                if((a+j*dlugoscKlucza-1>=slowo.length()))
                {
                }
                else
                {
                     wynik=wynik+slowo.charAt(a+j*(int)dlugoscKlucza-1);  
                }
            }
        }
        return wynik;
    }
    public String odszyfruj(String slowo, String klucz)
    {
        String klucz1 = klucz.replace("-","");
        String wynik="";
        char tab[] = new char [slowo.length()+klucz.length()];
        float dlugoscKlucza= klucz1.length();
        float d =slowo.length()/dlugoscKlucza;
        float f = slowo.length()%dlugoscKlucza; // NP 3 reszty z 4 czyli 1 brakuje
        f=dlugoscKlucza-f;
        if(d%1!=0)
        {   
            d= (float) Math.ceil(d);   
        }
        int licznik=0;
        for(int j=0;j<d;j++)
        {
            for (int i=0;i<dlugoscKlucza;i++)
            {
                int a = (klucz1.charAt(i)-'0');
                
                licznik++;
                if(licznik==slowo.length()-dlugoscKlucza && f==1)
                {
                    for (int s=0;s<f;s++)
                    {
                        char c = klucz1.charAt(i);
                        if(dlugoscKlucza!=i+1)
                        {
                            char c1 = klucz1.charAt(i+1);
                            klucz1 = klucz1.replace(c, c1);
                        }    
                    }
                }
                if((j*(int)dlugoscKlucza+i>=slowo.length()))
                {
                }
                else
                {
                    tab[a+((int)dlugoscKlucza*j)]=slowo.charAt(j*(int)dlugoscKlucza+i);
                }
            }
        }

        for(int i=0;i<tab.length;i++)
        {
            wynik=wynik+tab[i];
        }
        wynik=wynik.replaceAll("\\W","");
            
        return wynik;
    }
}
