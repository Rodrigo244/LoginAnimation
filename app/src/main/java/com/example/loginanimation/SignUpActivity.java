package com.example.loginanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

    TextView nuevoUsuario, bienvenidoLabel;
    ImageView logoImageView;
    TextInputLayout usuarioSignUpTextField, passwordTextField;
    MaterialButton btnRegistar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        logoImageView = findViewById(R.id.signUpImage);
        bienvenidoLabel = findViewById(R.id.bienvenidoLabel);
        usuarioSignUpTextField = findViewById(R.id.emailTextField);
        passwordTextField = findViewById(R.id.passwordTextField);
        nuevoUsuario = findViewById(R.id.labelNuevoUser);

        nuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionBack();
            }
        });
    }


    @Override
    public void onBackPressed(){
        transitionBack();
    }


    public void transitionBack(){
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}