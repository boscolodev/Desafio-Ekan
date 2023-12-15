package com.hexagonalddd.hexagonalarchtecture.shared;

import org.modelmapper.ModelMapper;

public class Mapper {
    private static ModelMapper instance = null;

    private Mapper() {
    }

    private static ModelMapper getMapper() {
        if (instance == null) {
            instance = new ModelMapper();
        }
        return instance;
    }

    public static <T> T converte(Object origin, Class<T> destiny) {
        return Mapper.getMapper().map(origin, destiny);
    }

    public static void copyEntity(Object origin, Object destiny) {
        Mapper.getMapper().map(origin, destiny);
    }

}
