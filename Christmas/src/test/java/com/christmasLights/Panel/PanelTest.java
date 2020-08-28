package com.christmasLights.Panel;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class PanelTest {

    @Test
    void should_returnFalse_when_panelIsIncorrectly(){
        int lightsPerColumn = 2000;
        //given
        final Panel panel = Panel.builder()
                .build();
        //when
        final Boolean checkLights = panel.create(lightsPerColumn);
        //then
        assertThat(checkLights).isFalse();
    }
    
    @Test
    void should_returnTrue_when_lightsAreCheckedOn(){
        //given
        final Panel panel = Panel.builder().build();
        panel.create(1000);
        final Integer[][] coordinatesLights = new Integer[2][4];
        coordinatesLights[0][0] = 0;
        coordinatesLights[0][1] = 0;
        coordinatesLights[0][2] = 2;
        coordinatesLights[0][3] = 2;
        coordinatesLights[1][0] = 3;
        coordinatesLights[1][1] = 3;
        coordinatesLights[1][2] = 4;
        coordinatesLights[1][3] = 4;

        //when
        panel.turnOn(coordinatesLights);
        final Boolean checkLightsAreTurnedOn = panel.checkLights(coordinatesLights);

        //then
        assertThat(checkLightsAreTurnedOn).isTrue();
    }
}
