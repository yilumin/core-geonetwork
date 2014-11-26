package org.fao.geonet.services.metadata.format.groovy.util;

/**
 * Represent a link and the text for the link.
 *
 * @author Jesse on 11/18/2014.
 */
public class Link {
    private final String href;
    private final String text;

    public Link(String href, String text) {
        this.href = href;
        this.text = text;
    }

    public String getHref() {
        return href.replace("&", "&amp;");
    }

    public String getText() {
        return text.replace("&", "&amp;");
    }
}
