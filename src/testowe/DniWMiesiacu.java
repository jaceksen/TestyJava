/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Jacek Seń <jaceksen@gmail.com>
 */
public class DniWMiesiacu {
    
    
    
    public static void main(String[] args) throws ParseException {
        
    
    int iYear = 2016;
    int iMonth = Calendar.FEBRUARY;
    int iDay = 1;
    
    int miesiac = iMonth + 1;
    
    Calendar mycal = new GregorianCalendar(iYear, iMonth, iDay);
    
    int liczbaDni = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
    
        System.out.println("Liczba dni: " + liczbaDni + " miesiąc: " + miesiac);
        
        
    //tworzę dwie daty
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date data1 = format.parse("2017-1-1");
        Date data2 = format.parse("2017-1-2");
        
    // tworzę dwa obiekty DanyDzien
        DanyDzien dzien100 = new DanyDzien(data1, "Zad1", 8);
        DanyDzien dzien101 = new DanyDzien(data2, "Zad1", 8);
        
    // wyświetlam wyniki
        System.out.println("Dzien 100: " + dzien100.getDzien() + " ** " + dzien100.getZadanie() + " ** " + dzien100.getLiczbaGodzin());
        System.out.println("Dzien 100: " + format.format(dzien100.getDzien()) + " ** " + dzien100.getZadanie() + " ** " + dzien100.getLiczbaGodzin());
        
    // tworzę listę DanychDni w miesiącu;
        List<DanyDzien> dni = new ArrayList<>();
        
        for(int i=1; i<=liczbaDni; i++){
            System.out.print("Dzień: " + i + " ");
            
            //tworzę format daty
//            StringBuilder sb = new StringBuilder();
//            sb.append(iYear);
//            sb.append("-");
//            sb.append(miesiac);
//            sb.append("-");
//            sb.append(i);
            String dataString = iYear + "-" + miesiac + "-" + i;
            System.out.println(dataString);
            
            dni.add(new DanyDzien(format.parse(dataString),"Zadanie10",7));
        }
        
        
        //wyświetlaj wyniki
        
        System.out.println("Godziny: " + dni.get(7).getLiczbaGodzin() + " , Dzień: " + format.format(dni.get(7).getDzien()) + ", Zadanie: " + 
                dni.get(7).getZadanie());
        System.out.println("");
        
        for(int i=0; i<=dni.size() - 1; i++){
            System.out.println("Godziny: " + dni.get(i).getLiczbaGodzin() + " , Dzień: " + format.format(dni.get(i).getDzien()) + ", Zadanie: " + 
                dni.get(i).getZadanie());
        }
    
    } //koniec main
    
    
}
