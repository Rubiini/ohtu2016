/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author samukaup
 */
public class Nollaa extends Komento {

    public Nollaa(JTextField tuloskentta, JTextField syotekentta, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, sovellus);
    }

    @Override
    protected void operaatio(int arvo) {
        sovellus.nollaa();
    }
    
}
