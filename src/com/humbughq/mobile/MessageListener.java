package com.humbughq.mobile;

public interface MessageListener {

    public enum LoadPosition {
        ABOVE, BELOW, NEW, INITIAL,
    }

    void onMessages(Message[] messages, LoadPosition pos);

}