package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Service service = new Service(new Job("12345", "name-blabla",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi blandit cursus gravida. " +
                "Cras ut ipsum sapien. Vivamus commodo libero placerat risus porttitor, in volutpat erat rhoncus. " +
                "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. " +
                "Sed pulvinar lacus sit amet lectus sodales fringilla. Nunc ac justo turpis. Aliquam erat volutpat. " +
                "Aliquam hendrerit eleifend odio nec porttitor. Integer ullamcorper tempus commodo. Proin vel maximus purus. " +
                "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. " +
                "Phasellus sodales lorem nibh, eu consectetur tellus molestie gravida."));
        String mappedValue = service.mapName("Tilde GE", new MapTest().getMap());
        String description = service.getDescription();
        UrlBuilder urlBuilder = new UrlBuilder.Builder()
            .join(description)
            .element(HtmlElements.LINE_BREAK)
            .element(HtmlElements.LINK_OPEN)
            .schema(HtmlElements.SCHEMA)
            .host(HtmlElements.HOST)
            .setParameters(HtmlElements.FIRSTPARAMETER, service.getName())
            .setParameters(HtmlElements.SECONDPARAMETER, mappedValue)
            .element(HtmlElements.LINK_CLOSE)
            .build();

        System.out.println(UrlBuilder.getStringBuilder());
    }
}
