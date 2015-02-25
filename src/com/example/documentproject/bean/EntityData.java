/**
 * Copyright 2015. ABN Software. All Rights reserved.<br>
 * <br>
 * Homepage .... http://www.ABNsoft.info<br>
 * <br>
 * Project ..... DocumentProject<br>
 * <br>
 * Author ...... AnNik<br>
 * E-Mail ...... ABN.DEV@mail.ru<br>
 * Created ..... 14 февр. 2015 г.<br>
 * <br>
 */
package com.example.documentproject.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author annik
 *
 */
@SuppressWarnings( "serial" )
public class EntityData implements Serializable {

    private int id;

    private Date date;

    private Status status;

    /**
     * Contructor.
     * 
     * @param id
     * @param date
     * @param status
     */
    public EntityData( int id, Date date, Status status ) {

        this.id = id;
        this.date = date;
        this.status = status;
    }

    public int getId() {

        return id;
    }

    public void setId( int id ) {

        this.id = id;
    }

    public Date getDate() {

        return date;
    }

    public void setDate( Date date ) {

        this.date = date;
    }

    public String getStatus() {

        return status.getValue();
    }

    public void setStatus( Status status ) {

        this.status = status;
    }

}
