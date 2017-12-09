package com.materialdesing.andres.cardview.models;

/**
 * Created by andres on 1/12/17.
 */

public class Materia {

    public String name;
    public int poster;

    public Materia(){

    }

    public Materia(String name, int poster){
        this.name = name;
        this.poster = poster;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPoster(){
        return this.poster;

    }
    public void setPoster(int poster){
        this.poster = poster;
    }



}
