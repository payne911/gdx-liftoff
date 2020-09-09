package com.github.payne.generator.JAVA.model;

import com.github.payne.generator.JAVA.model.LanguagesData.VersionedLanguage;
import com.github.payne.generator.JAVA.model.enums.Language;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LanguagesData extends UniqueItemsContainer<VersionedLanguage> {

    @Data
    @Setter(AccessLevel.NONE)
    public static class VersionedLanguage {
        private final String version;
        private final Language language;
    }
}
