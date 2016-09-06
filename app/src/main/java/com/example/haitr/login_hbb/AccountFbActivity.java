package com.example.haitr.login_hbb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;

import Class.Account_Facebook;

public class AccountFbActivity extends AppCompatActivity {
    private TextView txtuserName, txtuserEmail, txtuserGender, txtuserBirthday;
    private ProfilePictureView profilePictureView;
    private LoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_facebook);
        txtuserEmail = (TextView) findViewById(R.id.txtEmail);
        txtuserName = (TextView) findViewById(R.id.txtName);
        txtuserGender = (TextView) findViewById(R.id.txtGender);
        txtuserBirthday = (TextView) findViewById(R.id.txtBirthday);
        loginButton = (LoginButton) findViewById(R.id.fb_logout);
        profilePictureView = (ProfilePictureView) findViewById(R.id.profilepicture);
        Account_Facebook account_facebook;
        Intent intent = getIntent();
        account_facebook = (Account_Facebook) intent.getSerializableExtra("profile");
        txtuserEmail.setText(account_facebook.getEmail());
        txtuserName.setText(account_facebook.getName());
        txtuserGender.setText(account_facebook.getGender());
        txtuserBirthday.setText(account_facebook.getBirthday());
        profilePictureView.setPresetSize(ProfilePictureView.NORMAL);
        profilePictureView.setProfileId(account_facebook.getId());

    }

}
