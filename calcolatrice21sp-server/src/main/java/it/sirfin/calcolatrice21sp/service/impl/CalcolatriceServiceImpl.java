package it.sirfin.calcolatrice21sp.service.impl;

import it.sirfin.calcolatrice21sp.service.CalcolatriceService;
import org.springframework.stereotype.Service;

/**
 * Implementa l'interfaccia del servizio e, essendo annotata come @Service
 * viene iniettata, come Singleton, dove è presente @Autowired.
 * N.B.: possiamo iniettare con @Autowired anche la classe direttamente
 * ma questo vanifica l'Inversione del Controllo
 * @author Luca Lezzerini
 */
@Service
public class CalcolatriceServiceImpl implements CalcolatriceService {

    @Override
    public double somma(double a, double b) {
        return a + b;
    }

    @Override
    public double sottrai(double a, double b) {
        return a - b;
    }

    @Override
    public double moltiplica(double a, double b) {
        return a * b;
    }

    @Override
    public double dividi(double a, double b) {
        return a / b;
    }

    @Override
    public double modulo(double a, double b) {
        return a % b;
    }

}
