package com.ces2.clase1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AstronomoController {

    @GetMapping("/astronomos")
    public String verAstronomos(Model model) {

        // -------- PARTE INTERFACES --------
        List<Astronomo> astronomos = new ArrayList<>();

        astronomos.add(new AstronomoSolar());
        astronomos.add(new AstronomoGalaxias());
        astronomos.add(new AstronomoExoplanetas());

        List<String> mensajesInterfaz = new ArrayList<>();

        for (Astronomo a : astronomos) {
            mensajesInterfaz.add(a.observarUniverso());
        }

        // -------- PARTE ABSTRACTA --------
        List<AstronomoAbstracto> astronomosAbs = new ArrayList<>();

        astronomosAbs.add(new AstronomoSolarAbs());
        astronomosAbs.add(new AstronomoGalaxiasAbs());
        astronomosAbs.add(new AstronomoExoplanetasAbs());

        List<String> mensajesAbstracto = new ArrayList<>();

        for (AstronomoAbstracto a : astronomosAbs) {
            mensajesAbstracto.add(a.observarUniverso());
        }

        model.addAttribute("mensajesInterfaz", mensajesInterfaz);
        model.addAttribute("mensajesAbstracto", mensajesAbstracto);

        return "astronomos";
    }
}