package com.github.czyzby.lml.parser.impl.attribute.table;

import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Value;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlAttribute;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.util.LmlUtilities;

/** See {@link Table#padLeft(Value)} . See
 * {@link LmlUtilities#parseHorizontalValue(LmlParser, LmlTag, com.badlogic.gdx.scenes.scene2d.Actor, String)} and
 * {@link LmlUtilities#parseVerticalValue(LmlParser, LmlTag, com.badlogic.gdx.scenes.scene2d.Actor, String)} for more
 * info on value parsing. To avoid collision with cell attributes, this attribute is mapped to "tablePadLeft".
 *
 * @author MJ */
public class TablePadLeftLmlAttribute implements LmlAttribute<Table> {
    @Override
    public Class<Table> getHandledType() {
        return Table.class;
    }

    @Override
    public void process(final LmlParser parser, final LmlTag tag, final Table actor, final String rawAttributeData) {
        final Value horizontalPad = LmlUtilities.parseHorizontalValue(parser, tag, actor, rawAttributeData);
        actor.padLeft(horizontalPad);
    }
}
