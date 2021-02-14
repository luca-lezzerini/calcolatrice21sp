package it.sirfin.calcolatrice21sp.controller;

import it.sirfin.calcolatrice21sp.dto.CalcolatriceReqDto;
import it.sirfin.calcolatrice21sp.dto.CalcolatriceResDto;
import it.sirfin.calcolatrice21sp.service.CalcolatriceService;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hp Desktop
 */
@CrossOrigin("*")
@RestController
public class CalcolatriceController {
//Cioa
    //Commento
    // Inietta l'implementazione configurata (altrove) dell'interfaccia
    // CalcolatriceService (ossia la classe che la implementa è che è annotata @Service)
    // l'istanza iniettata è gestita come Singleton
    @Autowired
    CalcolatriceService calcolatriceService;

    @RequestMapping("/somma")
    @ResponseBody
    public CalcolatriceResDto somma(@RequestBody CalcolatriceReqDto dto) {
        System.out.println("Ricevuto DTO = " + dto);

        // invoca il servizio usando la classe iniettata sopra
        double r = calcolatriceService.somma(dto.getOp1(), dto.getOp2());
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        System.out.println("Restituisco DTO = " + risp);
        return risp;
    }

    @RequestMapping("/moltiplica")
    @ResponseBody
    public CalcolatriceResDto moltiplica(@RequestBody CalcolatriceReqDto dto) {
        // invoca il servizio usando la classe iniettata sopra
        double r = calcolatriceService.moltiplica(dto.getOp1(), dto.getOp2());
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/dividi")
    @ResponseBody
    public CalcolatriceResDto dividi(@RequestBody CalcolatriceReqDto dto) {
        // invoca il servizio usando la classe iniettata sopra
        double r = calcolatriceService.dividi(dto.getOp1(), dto.getOp2());
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/sottrai")
    @ResponseBody
    public CalcolatriceResDto sottrai(@RequestBody CalcolatriceReqDto dto) {
        // invoca il servizio usando la classe iniettata sopra
        double r = calcolatriceService.sottrai(dto.getOp1(), dto.getOp2());
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/modulo")
    @ResponseBody
    public CalcolatriceResDto modulo(@RequestBody CalcolatriceReqDto dto) {
        // invoca il servizio usando la classe iniettata sopra
        double r = dto.getOp1() % dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/casuale")
    @ResponseBody
    public CalcolatriceResDto casuale(@RequestBody CalcolatriceReqDto dto) {
        // invoca il servizio usando la classe iniettata sopra
        double r =calcolatriceService.casuale(dto.getOp1(), dto.getOp2());
        CalcolatriceResDto rips = new CalcolatriceResDto();
        rips.setRisultato(r);
        return rips;
    }
}
