package com.company;

public enum HtmlElements {
    LINK_OPEN("<a href='"),
    LINK_CLOSE("' target='blank'>MT quality survey/ankietę jakości MT</a>"),
    LINE_BREAK("</br>"),
    SCHEMA("http://"),
    HOST("www.placeholder.com/"),
    FIRSTPARAMETER("entry.1970406166"),
    SECONDPARAMETER("entry.1323522423");

    private String element;

    HtmlElements(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
