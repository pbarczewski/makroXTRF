package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Service service = new Service(new Job("12345", "name-blabla"));
        String mappedValue = service.mapName("Tilde GE", new Mapper().getMap());

        UrlBuilder urlBuilder = new UrlBuilder.Builder()
            .element(HtmlElements.LINK_OPEN)
            .schema(HtmlElements.SCHEMA)
            .host(HtmlElements.HOST)
            .setParameters(HtmlElements.FIRSTPARAMETER, service.getName())
            .setParameters(HtmlElements.SECONDPARAMETER, mappedValue)
            .element(HtmlElements.LINK_CLOSE)
            .element(HtmlElements.LINE_BREAK)
            .build();
    }
}
