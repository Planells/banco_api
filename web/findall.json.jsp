<%-- 
    Document   : findall.json
    Created on : 01-oct-2015, 13:53:24
    Author     : German
--%>

<%@page import="com.fpmislata.presentacion.jackson.JsonTransformerImplJackson"%>
<%@page import="com.fpmislata.presentacion.JsonTransformer"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.fpmislata.banco.bussiness.service.impl.EntidadBancariaServiceImpl"%>
<%@page import="com.fpmislata.banco.bussiness.service.EntidadBancariaService"%>
<%@page import="com.fpmislata.banco.bussiness.domain.EntidadBancaria"%>
<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%
    JsonTransformer jsonTransformer= new JsonTransformerImplJackson();
    EntidadBancariaService entidadBancariaService = new EntidadBancariaServiceImpl();  
    String jsonUsuario=jsonTransformer.toJson(entidadBancariaService.findAll());
    out.println(jsonUsuario);
    
 %>




    



   
           