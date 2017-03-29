package com.algaworks.erp.controller;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.algaworks.erp.model.RamoAtividade;

//@FacesConverter(forClass = RamoAtividade.class)
public class RamoAtividadeConverter implements Converter {
    
    private List<RamoAtividade> listaRamoAtividades;
    
//    @Inject
//    private RamoAtividades ramoAtividades;

//    public RamoAtividadeConverter() {
//    }
    
    public RamoAtividadeConverter(List<RamoAtividade> listaRamoAtividades) {
    	this.listaRamoAtividades = listaRamoAtividades;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        }
        
        Long id = Long.valueOf(value);
        
        return buscar(id);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }
        
        RamoAtividade ramoAtividade = (RamoAtividade) value;
        
        return ramoAtividade.getId().toString();
    }
    
    private RamoAtividade buscar(Long id) {
    	for (RamoAtividade ramoAtividade: listaRamoAtividades) {
            if (id.equals(ramoAtividade.getId())) {
            	return ramoAtividade;
                
            }
        }
    	
    	return null;//ramoAtividades.porId(id);
    }
}