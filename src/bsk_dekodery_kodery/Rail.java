/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsk_dekodery_kodery;

/**
 *
 * @author poker
 */
public class Rail {

    public Rail()
    {   
    }
    public String szyfruj(String slowo, int dlugoscPlotka)
    {
        char tab[][] = new char[slowo.length()][dlugoscPlotka];
        int j=1;
        int kierunek=1;
        int warunek=dlugoscPlotka;
        for(int i=0;i<slowo.length();i++)
        {
            tab[i][j-1]=slowo.charAt(i);
            if(j==warunek  && i>0)
            {
                kierunek=kierunek * -1;
                warunek=warunek+kierunek*(dlugoscPlotka-1);  
            }
            j=j+kierunek;
        }
        String wynik="";
        for(j=0;j<dlugoscPlotka;j++)
            {
                for (int i=0;i<slowo.length();i++)
                {
                    if(tab[i][j]!=0)
                    {
                        wynik=wynik+tab[i][j];
                    }           
                }
            }
        return wynik;
    }
    public String odszyfruj(String slowo, int dlugoscPlotka)
    {
        char[][] tab = new char[slowo.length()][dlugoscPlotka];
        int j = 1;
        int kierunek = 1;
        int warunek = dlugoscPlotka;
        for (int i = 0; i < slowo.length(); i++) 
        {
            tab[i][j - 1] = '-';
            if (j == warunek && i > 0)
            {
                kierunek = kierunek * -1;
                warunek = warunek + kierunek * (dlugoscPlotka - 1);
            }
            j = j + kierunek;
        }
        int idx = 0;
        for (j = 0; j < dlugoscPlotka; j++)
        {
            for (int i = 0; i < slowo.length(); i++) 
            {
                if (tab[i][j] == '-') 
                {
                    tab[i][j] = slowo.charAt(idx++);
                }
            }
        }
        String wynik = "";
        j = 1;
        kierunek = 1;
        warunek = dlugoscPlotka;
        for (int i = 0; i < slowo.length(); i++) 
        {
            wynik += tab[i][j - 1];
            if (j == warunek && i > 0) 
            {
                kierunek = kierunek * -1;
                warunek = warunek + kierunek * (dlugoscPlotka - 1);
            }
            j = j + kierunek;
        }
        return wynik;
    } 
}
