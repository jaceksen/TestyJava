/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowe;

import java.util.Date;

/**
 *
 * @author Jacek Seń <jaceksen@gmail.com>
 */

public class DanyDzien {
    
    private Date dzien;
    private String zadanie;
    private int liczbaGodzin;

    public DanyDzien() {
    }
    
    public DanyDzien(Date dzien, String zadanie, int liczbaGodzin) {
        this.dzien = dzien;
        this.zadanie = zadanie;
        this.liczbaGodzin = liczbaGodzin;
    }
    
    public Date getDzien() {
        return dzien;
    }

    public void setDzien(Date dzien) {
        this.dzien = dzien;
    }

    public String getZadanie() {
        return zadanie;
    }

    public void setZadanie(String zadanie) {
        this.zadanie = zadanie;
    }

    public int getLiczbaGodzin() {
        return liczbaGodzin;
    }

    public void setLiczbaGodzin(int liczbaGodzin) {
        this.liczbaGodzin = liczbaGodzin;
    }
    
    
    
    
}
