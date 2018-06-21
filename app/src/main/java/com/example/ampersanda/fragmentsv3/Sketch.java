package com.example.ampersanda.fragmentsv3;

import processing.core.PApplet;

public class Sketch extends PApplet {
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
