package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Controller

public class CitatController {

    private final Random random = new Random();

//    chci vytvořit seznam ze stringů a potom vložím do objektu "citat" resp. "pozadi" n-tou (náhodné číslo) položku ze seznamu  )

//    List<String> seznamCitatu = Arrays.asList("<strong>Debugging</strong> /de·bugh·ing/ <em>verb</em><br/>The Classic Mystery Game where you are the detective, the victim, and the murderer.", "A user interface is like a joke. If you have to explain it, it's not that good.",
//            "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
//            "I have a joke on programming but it only works on my computer.",
//            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
//            "When I wrote this code, only God & I understood what it did. Now… Only God knows.", "<strong>Programmer</strong>  <em>noun</em><br/> A machine that turns coffee into code.",
//            "Real programmers count from 0.");
//
//
//    List<String> seznamObrazku = Arrays.asList("https://source.unsplash.com/G9i_plbfDgk/1600x900", "https://source.unsplash.com/4Zaq5xY5M_c/1600x900", "https://source.unsplash.com/h0Vxgz5tyXA/1600x900"
//            , "https://source.unsplash.com/vC8wj_Kphak/1600x900", "https://source.unsplash.com/yI3weKNBRTc/1600x900", "https://source.unsplash.com/DbwYNr8RPbg/1600x900", "https://source.unsplash.com/cxE7SXKnzv0/1600x900", "https://source.unsplash.com/TIvFLeqZ4ec/1600x900");


    @GetMapping("/citaty")
    public ModelAndView zobrazeniCitatu() {
        int nahodneCislo = random.nextInt(7) + 1;
        ModelAndView result = new ModelAndView("citaty");
//    result.addObject("citat", seznamCitatu.get(nahodneCislo));
//    result.addObject("pozadi", "background-image: url(" + (seznamObrazku.get(nahodneCislo)) + ")");
        result.addObject("citat", "Ahoj");
        result.addObject("pozadi", "background-image: url(https://source.unsplash.com/vN6W1wWbMjw/1600x900)");
        return result;
    }

}
