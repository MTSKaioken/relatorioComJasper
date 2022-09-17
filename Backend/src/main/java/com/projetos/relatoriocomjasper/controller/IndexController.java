package com.projetos.relatoriocomjasper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

//    @RequestMapping("/imprimir.do")
//    public ModelAndView index(){
//        ModelAndView modelandView = new ModelAndView("/admin/homepage");
//        return modelandView;
//    }

    @RequestMapping("/logar.do")
    public ModelAndView login(){
        ModelAndView modelandView = new ModelAndView("login");
        return modelandView;
    }

    @RequestMapping("/cadastrar.do")
    public ModelAndView cadastrar(){
        ModelAndView modelandView = new ModelAndView("cadastrar");
        return modelandView;
    }

    @RequestMapping("/contato.do")
    public ModelAndView contato(){
        ModelAndView modelandView = new ModelAndView("contato");
        return modelandView;
    }
}
