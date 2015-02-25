/**
 * Copyright 2015. ABN Software. All Rights reserved.<br>
 * <br>
 * Homepage .... http://www.ABNsoft.info<br>
 * <br>
 * Project ..... DocumentProject<br>
 * <br>
 * Author ...... AnNik<br>
 * E-Mail ...... ABN.DEV@mail.ru<br>
 * Created ..... 14 ����. 2015 �.<br>
 * <br>
 */
package com.example.documentproject.bean;


/**
 * @author annik
 *
 */
public enum Status {
    NEW("�����"),
    COMPLETED("��������"),
    APPROVED("�����������"),
    ;

    private String key;

    private Status( String key ) {

        this.key = key;
    }

    public String getValue() {

        return this.key;
    }

    /**
     * This method check value as {@link String} and return Enum.
     * 
     * @param statusValue
     * @return
     */
    public Status valueOf( Status statusValue ) {

        Status result = Status.NEW;
        for (Status statusItem : Status.values()) {
            if ( statusItem.equals( statusValue ) ) {
                result = statusItem;
                break;
            }
        }
        return result;
    }
}