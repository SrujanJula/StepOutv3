package org.srujan.stepoutv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    EditText forgot_email;
    TextView back;
    Button submit;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        forgot_email = findViewById(R.id.forgot_email);
        back = findViewById(R.id.back_to_login);
        submit = findViewById(R.id.forgot_btn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassword.this, LoginActivity.class));
                finish();
            }
        });
    }
}