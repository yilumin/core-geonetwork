package org.fao.geonet.services.metadata.format.groovy.util;

import org.fao.geonet.services.metadata.format.groovy.Functions;
import org.jdom.JDOMException;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Represents the group name and icon of a type of links.  IE Dataset, parent, children, etc...
 *
 * @author Jesse on 11/20/2014.
 */
public class LinkType {
    /**
     * The untranslated name of the link.
     */
    @Nonnull
    public final String name;
    /**
     * The url of the icon for this link group.  This may be null.
     */
    @Nullable
    public final String icon;

    public LinkType(@Nonnull String name, @Nullable String icon) {
        Objects.requireNonNull(name);
        this.name = name;
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkType linkType = (LinkType) o;

        if (!name.equals(linkType.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName(Functions functions) throws JDOMException, IOException {
        return functions.translate(name);
    }
}
