package com.kloudtek.advmqclient.spring;

import java.util.HashMap;
import java.util.Map;

public class MQMessage<X> {
    private X content;
    private final Map<String, Object> attributes = new HashMap<String, Object>();

    public MQMessage() {
    }

    public MQMessage(X content) {
        this.content = content;
    }


    public MQMessage(X content, Map<String, Object> attributes) {
        this.content = content;
        this.attributes.putAll(attributes);
    }

    public X getContent() {
        return content;
    }

    public void setContent(X content) {
        this.content = content;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }
}
