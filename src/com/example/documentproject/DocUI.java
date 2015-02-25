package com.example.documentproject;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings( "serial" )
@Theme( "documentproject" )
public class DocUI extends UI {

    /**
     * @author annik
     */
    @WebServlet( value = "/*", asyncSupported = true )
    @VaadinServletConfiguration( productionMode = false, ui = DocUI.class )
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init( VaadinRequest request ) {

        DocEditor editor = new DocEditor();
        setContent( editor );

    }
}