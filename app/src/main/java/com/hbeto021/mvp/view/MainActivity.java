package com.hbeto021.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hbeto021.mvp.R;
import com.hbeto021.mvp.model.Email;
import com.hbeto021.mvp.presenter.IPresenter;
import com.hbeto021.mvp.presenter.IView;
import com.hbeto021.mvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IView {

    private EditText edtRecipient, edtSubject, edtMessage;
    private TextView tvEmailDetails;
    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);

        initViews();
    }


    private void initViews() {
        edtRecipient = findViewById(R.id.edt_recipient);
        edtSubject = findViewById(R.id.edt_subject);
        edtMessage = findViewById(R.id.edt_message);
        tvEmailDetails = findViewById(R.id.tv_email_details);

        Button btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.sendEmail(edtRecipient.getText().toString(), edtSubject.getText().toString(),
                        edtMessage.getText().toString());
            }
        });
    }

    @Override
    public void getMessageToUser(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getEmailDetais(String emailDetails) {
        tvEmailDetails.setText(emailDetails);
    }

    @Override
    public void resetEdtFields() {
        edtRecipient.setText("");
        edtSubject.setText("");
        edtMessage.setText("");
    }

    @Override
    public void resetTvFields() {
        tvEmailDetails.setText("");
    }
}
