package com.github.czyzby.lml.vis.parser.impl.attribute.building;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlBuildingAttribute;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.vis.parser.impl.tag.builder.StringRangeLmlActorBuilder;

/** Sets the step of a string range. Mapped to "step".
 *
 * @author MJ */
public class StringStepLmlAttribute implements LmlBuildingAttribute<StringRangeLmlActorBuilder> {
    @Override
    public Class<StringRangeLmlActorBuilder> getBuilderType() {
        return StringRangeLmlActorBuilder.class;
    }

    @Override
    public boolean process(final LmlParser parser, final LmlTag tag, final StringRangeLmlActorBuilder builder,
            final String rawAttributeData) {
        builder.setStep(parser.parseString(rawAttributeData));
        return FULLY_PARSED;
    }
}
