/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author German
 */
public class BusinessException extends Exception {
    
     private List<BusinessMessage> businessMessages = new ArrayList();

    public BusinessException() {
    }
     
    public BusinessException(List <BusinessMessage> businessMessages) {
        this.businessMessages=businessMessages;
    } 
    
    
    
    public List<BusinessMessage> getBusinessMessages() {
        return businessMessages;
    }

    public void setBusinessMessages(List<BusinessMessage> businessMessages) {
        this.businessMessages = businessMessages;
    }
    
    
    
}
