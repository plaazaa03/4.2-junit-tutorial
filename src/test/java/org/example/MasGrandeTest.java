package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasGrandeTest {

    @Test
    @DisplayName("Array vacío")
    void pruebaArrayVacio() {
        int[] a = {};
        assertEquals(0, MasGrande.max(a));
    }

    @Test
    @DisplayName("Array con un solo elemento")
    void pruebaArrayUnElemento() {
        int[] a = {3};
        assertEquals(3, MasGrande.max(a));
    }

    @Test
    @DisplayName("Array con varios elementos")
    void pruebaArrayVariosElementos() {
        int[] a = {1, 2, 3, 4};
        assertEquals(4, MasGrande.max(a));
    }

    @Test
    @DisplayName("Array desordenado")
    void pruebaArrayDesordenado() {
        int[] a = {5, 2, 3, 4};
        assertEquals(5, MasGrande.max(a));
    }

    @Test
    @DisplayName("Array con valor mínimo")
    void pruebaArrayConMinimo() {
        int[] a = {Integer.MIN_VALUE, 1, 2, 3, 4, 5, };
        assertEquals(5, MasGrande.max(a));
    }

    @Test
    @DisplayName("Array con valor máximo")
    void pruebaArrayConMaximo() {
        int[] a = {1, 2, 3, 4, 5, Integer.MAX_VALUE};
        assertEquals(Integer.MAX_VALUE, MasGrande.max(a));
    }
}