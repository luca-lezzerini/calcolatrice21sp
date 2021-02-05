package it.sirfin.calcolatrice21sp.dto;

public class CalcolatriceResDto {

    private double risultato;

    public CalcolatriceResDto() {
    }

    public double getRisultato() {
        return risultato;
    }

    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }

    @Override
    public String toString() {
        return "CalcolatriceResDto{" + "risultato=" + risultato + '}';
    }
    
    

}
