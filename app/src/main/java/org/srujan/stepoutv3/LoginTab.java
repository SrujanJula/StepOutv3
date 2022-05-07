package org.srujan.stepoutv3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;

public class LoginTab extends Fragment {

    EditText lemail, lpass;
    Button lbtn;
    TextView fpass;
    float v = 0;

    FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        boolean attachToRoot;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab, container, false);

        lemail = root.findViewById(R.id.email);
        lpass = root.findViewById(R.id.pass);
        lbtn = root.findViewById(R.id.login);
        fpass = root.findViewById(R.id.fpass);


        lemail.setTranslationY(800);
        lpass.setTranslationY(800);
        lbtn.setTranslationY(800);
        fpass.setTranslationY(800);

        lemail.setAlpha(v);
        lpass.setAlpha(v);
        lbtn.setAlpha(v);
        fpass.setAlpha(v);

        lemail.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        lpass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        lbtn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        fpass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }


}

