package com.materialdesing.andres.cardview.models;

/**
 * Created by andres on 8/12/17.
 */

public class Tutor {

    private String name;
    private int color;
    private Long Id;


    public Tutor(){

    }

    public Tutor(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getColorResource() {
        return color;
    }

    public void setColorResource(int color_resource) {
        this.color = color_resource;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
