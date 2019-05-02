package com.hbeto021.mvp.model;

import com.hbeto021.mvp.utils.DateUtils;

import java.util.Date;

public class Email {

    private String recipient;
    private String subject;
    private String message;
    private Date date;

    public Email(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    public String getRecipient() {
        if (recipient == null) {
            recipient = "";
        }
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        if (subject == null) {
            subject = "";
        }
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        if (message == null) {
            message = "";
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Validates if fields are empty or not
     */
    public boolean fieldsAreComplete() {
        return !getRecipient().isEmpty() && !getSubject().isEmpty() && !getMessage().isEmpty();
    }

    /**
     * Validates if recipient email is correct or not
     */
    public boolean recipientIsValid() {
        return (!getSubject().isEmpty() && getRecipient().contains("@") && getRecipient().contains(".com") &&
                !getRecipient().substring(0, getRecipient().indexOf("@")).isEmpty() &&
                !getRecipient().substring(getRecipient().indexOf("@") + 1, getRecipient().indexOf(".com")).isEmpty());
    }


    @Override
    public String toString() {
        return "Email sent to: " + getRecipient() +
                "\n" +
                "Subject: " + getSubject() +
                "\n" +
                "Message: " + getMessage() +
                "\n" +
                "Date: " + DateUtils.dateToString(getDate());


    }
}
