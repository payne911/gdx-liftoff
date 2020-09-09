package com.github.payne.generator.JAVA;

import com.github.payne.generator.JAVA.model.BasicData;
import com.github.payne.generator.JAVA.model.LanguagesData;
import lombok.Data;
import lombok.NonNull;

@Data
public class GeneratorModel {

    @NonNull
    private final BasicData basicData;
    {
        LanguagesData f = new LanguagesData();
    }
}
