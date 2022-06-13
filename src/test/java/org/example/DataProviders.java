package org.example;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataProviders {

    /**
     * Providing Integer numbers
     */
    static Stream<Arguments> integerProvider() {
        return Stream.of(
                Arguments.of(3, 5, 8));
    }

    /**
     * Providing Double numbers
     */
    static Stream<Arguments> doubleProvider() {
        return Stream.of(
                Arguments.of(1.2, 3.0, 5.2));
    }

    /**
     * Providing Float numbers
     */
    static Stream<Arguments> floatProvider() {
        return Stream.of(
                Arguments.of(2.356f, 5.644f, 8.00f));
    }

    /**
     * Providing Long numbers
     */
    static Stream<Arguments> longProvider() {
        return Stream.of(
                Arguments.of(15L, 5L, 20L));
    }

    static Stream<Arguments> namesProvider() {
        return Stream.of(
                Arguments.of("Martin", "Bachev", "Martin Bachev"),
                Arguments.of("Neli", "Vucheva", "Neli Vucheva"),
                Arguments.of("Andrei", "Kirkorov", "Andrei Kirkorov"));
    }


}
