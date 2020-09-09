package com.github.payne.generator.JAVA;

import java.util.HashMap;
import java.util.Map;

public class Generator implements IGenerator {

    private final Map<String, byte[]> virtualFileStructure = new HashMap<>();

    @Override
    public Map<String, byte[]> generateFileStructure(GeneratorModel generatorModel) {

        return virtualFileStructure;
    }
}
