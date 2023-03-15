package com.example.lab10;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Data
@Named
@SessionScoped
public class Controller implements Serializable{
    private LbModule lbModule = new LbModule();

    public String toOutputD() {
        lbModule.createArrays();
        return "outputD";
    }

    public double maxY(){
        int index = lbModule.findIndexOfMaxY();
        return lbModule.getY(index);
    }
    public double maxX(){
        int index = lbModule.findIndexOfMaxY();
        return lbModule.getX(index);
    }
    public double minY(){
        int index = lbModule.findIndexOfMinY();
        return lbModule.getY(index);
    }
    public double minX(){
        int index = lbModule.findIndexOfMinY();
        return lbModule.getX(index);
    }
}
