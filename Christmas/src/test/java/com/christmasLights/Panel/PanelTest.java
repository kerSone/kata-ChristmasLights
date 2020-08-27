package com.christmasLights.Panel;

import org.assertj.core.api.Assertions;
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
    void should_returnTrue_when_lightsAreTurnedOn(){
        //given
        final Panel panel = Panel.builder().build();
        panel.create(1000);
        panel.turnOn();
        //when

        final Boolean checkLightsAreTurnedOn = panel.checkLights();

        //then
        assertThat(checkLightsAreTurnedOn).isTrue();

    }
}
