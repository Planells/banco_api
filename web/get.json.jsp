<%-- 
    Document   : get.json
    Created on : 01-oct-2015, 13:27:59
    Author     : German
--%>
<%@page import="com.fpmislata.presentacion.jackson.JsonTransformerImplJackson"%>
<%@page import="com.fpmislata.presentacion.JsonTransformer"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.fpmislata.banco.bussiness.service.impl.EntidadBancariaServiceImpl"%>
<%@page import="com.fpmislata.banco.bussiness.service.EntidadBancariaService"%>
<%@page import="com.fpmislata.banco.bussiness.domain.EntidadBancaria"%>

<%
    JsonTransformer jsonTransformer= new JsonTransformerImplJackson();
    EntidadBancariaService entidadBancariaService = new EntidadBancariaServiceImpl();
    EntidadBancaria entidadBancaria = entidadBancariaService.get(Integer.parseInt(request.getParameter("idEntidadBancaria")));
    String jsonUsuario=jsonTransformer.toJson(entidadBancaria);   
    out.println(jsonUsuario);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

