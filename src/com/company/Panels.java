package com.company;

import javax.swing.*;
import java.awt.*;

public class Panels extends JPanel {

    private PanelDown panelDown = new PanelDown();
    private PanelRight panelRight = new PanelRight();
    private PanelLeft panelLeft = new PanelLeft();
    private PanelCenter panelCenter = new PanelCenter();

    Panels(){
        setComponentsPanels();
    }

    public void setComponentsPanels(){

        this.setLayout(new BorderLayout());
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelLeft, BorderLayout.LINE_START);
        this.add(panelRight, BorderLayout.LINE_END);

    }

}