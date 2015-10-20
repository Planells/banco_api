<%-- 
    Document   : findByName.json
    Created on : 02-oct-2015, 9:00:18
    Author     : German
--%>

<%@page import="com.fpmislata.banco.bussiness.service.impl.EntidadBancariaServiceImpl"%>
<%@page import="com.fpmislata.banco.bussiness.service.EntidadBancariaService"%>
<%@page import="com.fpmislata.banco.bussiness.domain.EntidadBancaria"%>
<%@page import="java.util.List"%>

<%
    EntidadBancariaService entidadBancariaService = new EntidadBancariaServiceImpl();
    List<EntidadBancaria>entidadesBancarias=entidadBancariaService.findByNombre("bancopepe");
    int i = 0;
     %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

[
<% 
             for (EntidadBancaria entidadBancaria : entidadesBancarias) {            
            
            %>
    
{
"idEntidadBancaria":<%=entidadBancaria.getIdEntidadBancaria()%>,
"nombre":"<%=entidadBancaria.getNombre()%>",
"codigoEntidad":"<%=entidadBancaria.getCodigoEntidad()%>",
"fechaCreacion":<%=entidadBancaria.getFechaCreacion().toString()%>,
"direccion":"<%=entidadBancaria.getDireccion()%>",
"cif":"<%=entidadBancaria.getCif()%>"
}

 <%
           
           
           if( i++ < (entidadesBancarias.size()-1)){
              %>
              ,
           <%
               
           }
            %>
            

 <%           
           
           }
            %>
            
            ]
