package com.christmasLights.Panel;

import lombok.Builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Builder
public class Panel {
    private boolean[][] coordinatesPanel;
    private boolean isCreated;
    
    public Boolean create(int lightsPerColumn) {
        if (lightsPerColumn == 1000){
            this.coordinatesPanel = new boolean[lightsPerColumn][lightsPerColumn];
            this.isCreated = true;
        }
        return this.isCreated;
    }

    public Boolean checkLights(Integer[][] coordinatesLights) {
        final List<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < this.coordinatesPanel.length ; i++){
            for(int j = 0; j < this.coordinatesPanel[i].length  ; j++){
                if(this.coordinatesPanel[i][j]){
                    lista.add(i);
                    lista.add(j);
                }
            }
        }
        System.out.println(lista.size()/2);
        return !lista.isEmpty();
    }

    public void turnOn(Integer[][] coordinatesLights) {
        for (int m = 0; m < coordinatesLights.length ; m++) {
            for (int i = coordinatesLights[m][0]; i <= coordinatesLights[m][2]; i++) {
                for (int j = coordinatesLights[m][1]; j <= coordinatesLights[m][3]; j++) {
                    this.coordinatesPanel[i][j] = true;
                }
            }
        }
    }
}
