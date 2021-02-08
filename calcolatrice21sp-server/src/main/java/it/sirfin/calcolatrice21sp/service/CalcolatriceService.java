package it.sirfin.calcolatrice21sp.service;

/**
 * Definisce l'interfaccia della dipendenza da iniettare
 * 
 */
public interface CalcolatriceService {

    double somma(double a, double b);

    double sottrai(double a, double b);

    double moltiplica(double a, double b);

    double dividi(double a, double b);

    double modulo(double a, double b);
}
