package com.github.payne.generator.JAVA;

import java.util.Map;

public interface IGenerator {
    Map<String, byte[]> generateFileStructure(GeneratorModel generatorModel);
}
