package com.christmasLights.Panel;

import lombok.Builder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

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

    public Boolean checkLights() {
        for(int i = 0; i < this.coordinatesPanel.length ; i++){
            for(int j = 0; j < this.coordinatesPanel[i].length  ; j++){
                if(!this.coordinatesPanel[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void turnOn() {
        for(int i = 0; i < this.coordinatesPanel.length ; i++){
            for(int j = 0; j < this.coordinatesPanel[i].length  ; j++){
                this.coordinatesPanel[i][j] = true;
            }
        }
    }
}
