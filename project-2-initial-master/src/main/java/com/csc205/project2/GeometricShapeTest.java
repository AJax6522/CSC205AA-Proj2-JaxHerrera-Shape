package com.csc205.project2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometricShapeTest {

    @Test
    public void testSphereSurfaceArea() {
        Sphere sphere = new Sphere(2.0);
        double expected = 50.26548245743669;
        double actual = sphere.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testSphereVolume() {
        Sphere sphere = new Sphere(2.0);
        double expected = 33.510321638291124;
        double actual = sphere.volume();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCubeSurfaceArea() {
        Cube cube = new Cube(5.0);
        double expected = 150.0;
        double actual = cube.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCubeVolume() {
        Cube cube = new Cube(5.0);
        double expected = 125.0;
        double actual = cube.volume();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCylinderSurfaceArea() {
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        double expected = 31.41592653589793;
        double actual = cylinder.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCylinderVolume() {
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        double expected = 12.566370614359172;
        double actual = cylinder.volume();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testConeSurfaceArea() {
        Cone cone = new Cone(3.0, 4.0);
        double expected = 50.26548245743669;
        double actual = cone.surfaceArea();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testConeVolume() {
        Cone cone = new Cone(3.0, 4.0);
        double expected = 37.69911184307752;
        double actual = cone.volume();
        assertEquals(expected, actual, 0.0001);
    }
}

