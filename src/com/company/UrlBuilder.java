package com.company;

public class UrlBuilder {
    private HtmlElements schema;
    private HtmlElements host;
    private final static StringBuilder stringBuilder = new StringBuilder();
    private static int numOfParams = 0;

    private UrlBuilder(Builder builder) {
        this.schema = builder.schema;
        this.host = builder.host;
    }

    @Override
    public String toString() {
        return "" + schema.getElement() + host.getElement();
    }

    public static StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public static class Builder {
        private HtmlElements schema;
        private HtmlElements host;


        public Builder element(HtmlElements element) {
            stringBuilder.append(element.getElement());
            return this;
        }
        public Builder schema(HtmlElements schema) {
            this.schema = schema;
            stringBuilder.append(schema.getElement());
            return this;
        }

        public Builder host(HtmlElements host) {
            this.host = host;
            stringBuilder.append(host.getElement());
            return this;
        }

        public Builder setParameters(HtmlElements parameter, String value) {
            if(numOfParams > 0) {
                stringBuilder.append(Delimeters.AMP.getDelimeter());

            }
            stringBuilder.append(parameter.getElement());
            stringBuilder.append(Delimeters.EQ.getDelimeter());
            stringBuilder.append(value);
            numOfParams++;
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilder(this);
        }
    }
}
