package com.mycompany.ecommerce.utils;

import com.mycompany.ecommerce.domains.Cliente;
import com.mycompany.ecommerce.services.ClienteService;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

/**
 *
 * @author Piaia
 */
@Named
@FacesConverter(value = "marcaConverter", managed = true)
public class ClienteConverter implements Converter<Cliente> {

    @EJB
    private ClienteService clienteService;

    @Override
    public Cliente getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && value.trim().length() > 0) {
            try {
                return clienteService.getClientePorCodigo(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de conversão", "Não é um cliente válido."));
            }
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Cliente value) {
        if (value != null) {
            return String.valueOf(value.getCliCod());
        } else {
            return null;
        }
    }
}
