/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion.controladores;

import com.fpmislata.banco.bussiness.domain.EntidadBancaria;
import com.fpmislata.banco.bussiness.service.EntidadBancariaService;
import com.fpmislata.presentacion.JsonTransformer;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author German
 */
@Controller
public class EntidadBancariaController {

    @Autowired
    EntidadBancariaService entidadBancariaService;
    @Autowired
    JsonTransformer jsonTransformer;

    @RequestMapping(value = "/entidadbancaria", method = RequestMethod.GET, produces = "application/json")
    public void findall(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        try {
            String jsonUsuario = jsonTransformer.toJson(entidadBancariaService.findAll());
            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            httpServletResponse.setContentType("application/json; charset=UTF-8");
            httpServletResponse.getWriter().println(jsonUsuario);

        } catch (Exception ex) {
            ex.printStackTrace(httpServletResponse.getWriter());
        }

    }

    @RequestMapping(value = "/entidadbancaria/{idEntidadBancaria}", method = RequestMethod.GET, produces = "application/json")
    public void get(@PathVariable("idEntidadBancaria") int idEntidadBancaria, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        try {
            EntidadBancaria entidadBancaria = entidadBancariaService.get(idEntidadBancaria);

            if (entidadBancaria == null) {
                httpServletResponse.setStatus(HttpServletResponse.SC_NO_CONTENT);
            } else {
                String jsonUsuario = jsonTransformer.toJson(entidadBancaria);
                httpServletResponse.setStatus(HttpServletResponse.SC_OK);
                httpServletResponse.setContentType("application/json; charset=UTF-8");
                httpServletResponse.getWriter().println(jsonUsuario);
            }

        } catch (Exception ex) {
            ex.printStackTrace(httpServletResponse.getWriter());
        }
    }

}
