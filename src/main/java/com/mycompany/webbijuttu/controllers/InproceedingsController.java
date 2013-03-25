/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webbijuttu.controllers;

import com.mycompany.webbijuttu.domain.Inproceedings;
import com.mycompany.webbijuttu.services.InproceedingsService;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jirihamb
 */
@Controller
public class InproceedingsController {
    
    @Autowired
    private InproceedingsService service;
    @PostConstruct
    public void init(){
        Inproceedings in;
        for(int i=0;i<10;i++){
        in = new Inproceedings();
        in.setBibTexId(UUID.randomUUID().toString());
        in = service.create(in);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "list")
    public String list(Model model){
        model.addAttribute("serviceLista", service.list());
        return "/WEB-INF/view/Welcome.jsp";
    }
    
}
