package com.projetos.relatoriocomjasper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/imprimir.do")
    public ModelAndView index(){
        ModelAndView modelandView = new ModelAndView("index");
        return modelandView;
    }
}
