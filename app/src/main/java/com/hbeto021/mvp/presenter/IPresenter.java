package com.hbeto021.mvp.presenter;

/**
 * Interface that provides methods for Presenter
 */
public interface IPresenter {

    void sendEmail(String recipient, String subject, String message);
}
