package org.srujan.stepoutv3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTab extends Fragment {

    EditText sEmail, sPass, Cpass,Mob;
    Button sBtn;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        boolean attachToRoot;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab, container, false);

        sEmail = root.findViewById(R.id.semail);
        sPass = root.findViewById(R.id.spass);
        sBtn = root.findViewById(R.id.signup);
        Cpass = root.findViewById(R.id.cpass);


        sEmail.setTranslationY(800);
        sPass.setTranslationY(800);
        sBtn.setTranslationY(800);
        Cpass.setTranslationY(800);

        sEmail.setAlpha(v);
        sPass.setAlpha(v);
        sBtn.setAlpha(v);
        Cpass.setAlpha(v);

        sEmail.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        sPass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        sBtn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        Cpass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;

    }
}

