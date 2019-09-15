package com.hbeto021.mvp.view;

/**
 * Interface that provides methods for MainActivity
 * This methods updates the view and are called for Presenter
 *
 */
public interface IView {

    void showMessageToUser(String message);

    void showEmailDetails(String emailDetails);

    void resetInputs();

    void resetDetails();

}
