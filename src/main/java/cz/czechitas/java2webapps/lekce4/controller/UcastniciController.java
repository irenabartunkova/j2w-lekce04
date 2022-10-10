package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/ucastnici")
public class UcastniciController {
    private List<Ucastnik> ucastnici = List.of(
            new Ucastnik("Medvídek", "Pů", "Stokorcový les", "https://cdn.alza.cz/ImgW.ashx?fd=f16&cd=EK40151"),
            new Ucastnik("Čarodějnice", "Malá", "jeskyně", "https://cdn.alza.cz/ImgW.ashx?fd=f16&cd=TRG002m")

    );
    @GetMapping("/")
    public ModelAndView seznam() {

        ModelAndView modelAndView = new ModelAndView("/ucastnici/index");
        modelAndView.addObject("ucastníci", ucastnici);
        return modelAndView;
            }
    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {

        ModelAndView modelAndView = new ModelAndView("/ucastnici/detail");
        modelAndView.addObject("ucastnik", ucastnici.get(id));

        return modelAndView;

}
}