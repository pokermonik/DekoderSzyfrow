/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsk_dekodery_kodery;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author poker
 */
public class MacierzB 
{
    public MacierzB()
    {  
    }
    
      public String szyfruj(String slowo, String klucz)
      {
        String klucz1 = this.transformString(klucz);
        String wynik="";
        float dlugoscKlucza= klucz1.length();
        float d =slowo.length()/dlugoscKlucza;
        int a=0;
        if(d%1!=0)
        {
            d= (float) Math.ceil(d);   
        }
        String tablica[] = new String[slowo.length()];
        for(int j=0;j<dlugoscKlucza;j++)
        {
            String temp="";
            for (int i=0;i<d;i++)
            {
                a = (klucz1.charAt(j)-'0');
                if(j+((int)dlugoscKlucza*i)>=slowo.length())
                {
                }
                else
                {
                    temp=temp+slowo.charAt(j+((int)dlugoscKlucza*i));
                }       
            }
            tablica[a-1]=temp;     
        }
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]!=null)
            {
                wynik=wynik+tablica[i];
            }
        }
        return wynik;
    }
      
    public String odszyfruj(String slowo, String klucz)
    {
        String klucz1 = this.transformString(klucz);
        String wynik="";
        int dlugoscKlucza= klucz1.length();
        int a=0;
        float d =slowo.length()/dlugoscKlucza;
        if(d%1!=0)
        {
            d= (float) Math.ceil(d);   
        }
        int ile= dlugoscKlucza-slowo.length()%dlugoscKlucza;
        int iloraz = (slowo.length() - ile+1) / dlugoscKlucza;
        if((slowo.length())%dlugoscKlucza!=0)
        {
            slowo=slowo+"  ";
            for(int x=0;x<ile;x++)
            {
                // wpisywanie X w puste miejsca slowa zeby udalo sie odszyfrowanie
                int miejsce =(iloraz+1)*(klucz1.charAt(x+ile-1)-'0')-1;
                slowo=slowo.substring(0, miejsce) + 'X' + slowo.substring(miejsce);
                if(a+(ile-1)*(klucz1.charAt(x+ile-1)-'0')+1==slowo.length())
                {  
                }
                else
                {
                    a=a+1;
                }
            }   
        }
        d =slowo.length()/dlugoscKlucza;
        int licznik=0; 
        char tablica[] = new char[slowo.length()];
        for(int j=0;j<dlugoscKlucza;j++)
        {
            for (int i=0;i<d;i++)
            {
                a = (klucz1.charAt(j)-'0');
                String jc = Integer.toString(j+1);
                int b= klucz1.indexOf(jc);
                if(a+dlugoscKlucza*i>slowo.length())
                {
                }
                else
                {
                     tablica[b+dlugoscKlucza*i]=slowo.charAt(licznik);       
                }
                licznik++;          
            }    
        }
        for(int i=0;i<tablica.length;i++)
        {
                if(tablica[i]=='X')
                {
                }
                else
                {   
                    wynik=wynik+tablica[i];    
                }
        }
        wynik=wynik.trim();
        return wynik;
    }
    
    private int getAlphabetValue(char c) 
    {
        return Character.toLowerCase(c) - 'a' + 1;
    }
    
    private String transformString(String input)
    {
        int[] result = new int[input.length()];
        Map<Character,Integer> mapaLiter = new HashMap<Character,Integer>();
        String wynik="";
        // zliczanie do mapy ilsoc wystapien danej litery
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(mapaLiter.containsKey(c))
            {   
                Integer replacement = mapaLiter.get(c);
                mapaLiter.replace(c, replacement+1);
            }
            else
            {
                mapaLiter.put(c, 1);
            }
        }
        int counter =0;
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            // sprawdzanie czy jakas litera wystapila kilka razy

            int value = getAlphabetValue(c)+counter;
            c = input.charAt(i);
            if(mapaLiter.get(c)>1)
            {   
                for (int l = 0; l < result.length; l++)
                { 
                    result[l]++;
                }
                // jesli wystapila, to kazde juz dodane inkrementujemy i kazde nastepne
                // ktore bedziemy wpisywac sa zwiekszone o counter (1 wiecej)
                // to co aktualnie dodajemy nie zwiekszamy
                counter++;
                Integer replacement = (Integer) mapaLiter.get(c);
                mapaLiter.replace(c, replacement-1);
            }  
            result[i]=value;
        }
        for(int z=0;z<result.length;z++)
        {
            wynik=wynik+result[z];
        }
        return wynik;
    }      
}
       