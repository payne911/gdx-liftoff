package com.github.payne.generator

interface Generator {
    fun generateFileStructure(input: GeneratorModel): Map<String, ByteArray>
}