package com.csc205.project2;

public abstract class AbstractShape implements ThreeDimensionalShape{
    protected double surfaceArea;
    protected double volume;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" {surface area=").append(surfaceArea);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
