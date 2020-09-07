package com.github.payne.generator

interface Generator {
    // todo: decide on the Data Structure (potentially a DAG instead ?)
    fun generateFileStructure(input: GeneratorModel): Map<String, ByteArray>
}