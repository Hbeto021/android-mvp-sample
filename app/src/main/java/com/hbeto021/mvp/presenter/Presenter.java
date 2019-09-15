package com.hbeto021.mvp.presenter;

import com.hbeto021.mvp.model.Email;
import com.hbeto021.mvp.view.IView;

import java.util.Date;

/**
 * The middle guy between view and model
 * Remove any logic from view
 * Makes all the view logic
 * Presents usable data to the view layer and update the view
 */
public class Presenter implements IPresenter {

    private IView view;

    public Presenter(IView view) {
        this.view = view;
    }

    @Override
    public void sendEmail(String recipient, String subject, String message) {
        view.resetDetails();
        Email email = new Email(recipient, subject, message);
        if (email.fieldsAreComplete()) {
            if (email.isValidEmail()) {
                //sets the current date
                email.setDate(new Date(System.currentTimeMillis()));
                view.showMessageToUser("Email sent with success.");
                view.showEmailDetails(email.toString());
                view.resetInputs();
            } else {
                view.showMessageToUser("Recipient email is not a correct email, please insert a correct.");
            }
        } else {
            view.showMessageToUser("There are some empty fields.");
        }
    }
}
