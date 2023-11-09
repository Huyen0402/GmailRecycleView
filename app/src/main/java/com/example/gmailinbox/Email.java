package com.example.gmailinbox;

public class Email {
    private String senderName;
    private String subject;
    private String preview;
    private String timestamp;

    public Email(String senderName, String subject, String preview, String timestamp) {
        this.senderName = senderName;
        this.subject = subject;
        this.preview = preview;
        this.timestamp = timestamp;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSubject() {
        return subject;
    }

    public String getPreview() {
        return preview;
    }

    public String getTimestamp() {
        return timestamp;
    }
}