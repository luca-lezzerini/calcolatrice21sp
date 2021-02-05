package it.sirfin.calcolatrice21sp.controller;

import it.sirfin.calcolatrice21sp.dto.CalcolatriceReqDto;
import it.sirfin.calcolatrice21sp.dto.CalcolatriceResDto;
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

    @RequestMapping("/somma")
    @ResponseBody
    public CalcolatriceResDto somma(@RequestBody CalcolatriceReqDto dto) {
        System.out.println("Ricevuto DTO = " + dto);
        double r = dto.getOp1() + dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        System.out.println("Restituisco DTO = " + risp);
        return risp;
    }

    @RequestMapping("/moltiplica")
    @ResponseBody
    public CalcolatriceResDto moltiplica(@RequestBody CalcolatriceReqDto dto) {
        double r = dto.getOp1() * dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/dividi")
    @ResponseBody
    public CalcolatriceResDto dividi(@RequestBody CalcolatriceReqDto dto) {
        double r = dto.getOp1() / dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/sottrai")
    @ResponseBody
    public CalcolatriceResDto sottrai(@RequestBody CalcolatriceReqDto dto) {
        double r = dto.getOp1() - dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

    @RequestMapping("/modulo")
    @ResponseBody
    public CalcolatriceResDto modulo(@RequestBody CalcolatriceReqDto dto) {
        double r = dto.getOp1() % dto.getOp2();
        CalcolatriceResDto risp = new CalcolatriceResDto();
        risp.setRisultato(r);
        return risp;
    }

}
