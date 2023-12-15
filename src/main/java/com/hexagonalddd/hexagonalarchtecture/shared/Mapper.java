package com.hexagonalddd.hexagonalarchtecture.shared;

import org.modelmapper.ModelMapper;

public class Mapper {
    private static ModelMapper mapper = null;

    private Mapper() {
    }

    private static ModelMapper getMapper() {
        if (mapper == null) {
            mapper = new ModelMapper();
        }
        return mapper;
    }

    public static <T> T converte(Object origin, Class<T> destiny) {
        return Mapper.getMapper().map(origin, destiny);
    }

    public static void copyEntity(Object origin, Object destiny) {
        Mapper.getMapper().map(origin, destiny);
    }

}
