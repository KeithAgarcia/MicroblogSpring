package com.theironyard;

/**
 * Created by Keith on 5/8/17.
 */


public class Message {
    private static int MESSAGE_COUNT = 0;
    private int id;
    private String messageText;

    public Message(String messageText) {
        this.messageText = messageText;
        // set id equal to whatever message count is
        id = MESSAGE_COUNT;

        // increment the number of messages we have
        MESSAGE_COUNT++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}