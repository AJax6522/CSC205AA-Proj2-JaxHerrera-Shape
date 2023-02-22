package com.csc205.project2;

public class Cube extends AbstractShape{

    private double width;

    public Cube(double width) {
        this.width = width;
        this.surfaceArea = computeSurfaceArea();
        this.volume = computeVolume();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.surfaceArea = computeSurfaceArea();
        this.volume = computeVolume();
    }

    private double computeSurfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    private double computeVolume() {
        return Math.pow(width, 3);
    }

    @Override
    public double surfaceArea() {
        return surfaceArea;
    }

    @Override
    public double volume() {
        return volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.insert(0, "Cube {width=" + width);
        sb.append('}');
        return sb.toString();
    }
}
