package com.hbeto021.mvp.presenter;

/**
 * Interface that provides methods for MainActivity
 * This methods updates the view and are called for Presenter
 *
 */
public interface IView {

    void getMessageToUser(String message);

    void getEmailDetais(String emailDetails);

    void resetEdtFields();

    void resetTvFields();

}
