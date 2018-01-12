package com.example.sidkathuria14.myapplication.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sidkathuria14.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.example.sidkathuria14.myapplication.R.string.sign_out;


public class SigninActivity extends AppCompatActivity
//        implements
//        View.OnClickListener {
{
//private static final String TAG = "EmailPassword";
//
//private TextView mStatusTextView;
//private TextView mDetailTextView;
//private EditText mEmailField;
//private EditText mPasswordField;
//        Button email_sign_in_button,email_create_account_button,sign_out_button,verify_email_button;
//        LinearLayout email_password_buttons,signed_in_buttons;
//
//// [START declare_auth]
//private FirebaseAuth mAuth;
//// [END declare_auth]
//LinearLayout email_password_fields;
//@Override
//public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test_layout);
//
//        // Views
//        mStatusTextView = (TextView)findViewById(R.id.status);
//        mDetailTextView = (TextView)findViewById(R.id.detail);
//        mEmailField = (EditText)findViewById(R.id.field_email);
//        mPasswordField = (EditText)findViewById(R.id.field_password);
//        signed_in_buttons = (LinearLayout) findViewById(R.id.signed_in_buttons);
//        email_password_buttons = (LinearLayout)findViewById(R.id.email_password_buttons);
//        email_password_fields = (LinearLayout) findViewById(R.id.email_password_fields);
//        // Buttons
////        findViewById(R.id.email_sign_in_button).setOnClickListener(this);
////        findViewById(R.id.email_create_account_button).setOnClickListener(this);
////        findViewById(R.id.sign_out_button).setOnClickListener(this);
////        findViewById(R.id.verify_email_button).setOnClickListener(this);
//        email_sign_in_button = (Button)findViewById(R.id.email_sign_in_button);
//        email_sign_in_button.setOnClickListener(this);
//email_create_account_button = (Button)findViewById(R.id.email_create_account_button);
//        email_create_account_button.setOnClickListener(this);
//        sign_out_button = (Button)findViewById(R.id.sign_out_button);
//        sign_out_button.setOnClickListener(this);
//        verify_email_button = (Button)findViewById(R.id.verify_email_button);
//        verify_email_button.setOnClickListener(this);
//        // [START initialize_auth]
//        mAuth = FirebaseAuth.getInstance();
//        // [END initialize_auth]
//        }
//
//// [START on_start_check_user]
//@Override
//public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
////    updateUI(currentUser);
//        if(currentUser !=null )
//        {
//                startActivity(new Intent(SigninActivity.this,MapsActivity.class));
//        }
//        else {
//                updateUI(currentUser);
//        }
////    if(mAuth.getCurrentUser() != null) {
////
////        Log.d(TAG, "onStart: " + "null user");
////    startActivity(new Intent(SigninActivity.this,MapsActivity.class));
////    }
//
//
//        }
//// [END on_start_check_user]
//
//private void createAccount(String email, String password) {
//        Log.d(TAG, "createAccount:" + email);
//        if (!validateForm()) {
//        return;
//        }
//
//
//
//        // [START create_user_with_email]
//        mAuth.createUserWithEmailAndPassword(email, password)
//        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//@Override
//public void onComplete(@NonNull Task<AuthResult> task) {
//        if (task.isSuccessful()) {
//        // Sign in success, update UI with the signed-in user's information
//        Log.d(TAG, "createUserWithEmail:success");
//        FirebaseUser user = mAuth.getCurrentUser();
//        updateUI(user);
//        } else {
//        // If sign in fails, display a message to the user.
//        Log.w(TAG, "createUserWithEmail:failure", task.getException());
//        Toast.makeText(SigninActivity.this, "Authentication failed.",
//        Toast.LENGTH_SHORT).show();
//        updateUI(null);
//        }
//
//        // [START_EXCLUDE]
//
//        // [END_EXCLUDE]
//        }
//        });
//        // [END create_user_with_email]
//        }
//
//private void signIn(String email, String password) {
//        Log.d(TAG, "signIn:" + email);
//        if (!validateForm()) {
//        return;
//        }
//
//
//
//        // [START sign_in_with_email]
//        mAuth.signInWithEmailAndPassword(email, password)
//        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//@Override
//public void onComplete(@NonNull Task<AuthResult> task) {
//        if (task.isSuccessful()) {
//        // Sign in success, update UI with the signed-in user's information
//        Log.d(TAG, "signInWithEmail:success");
//        FirebaseUser user = mAuth.getCurrentUser();
//        updateUI(user);
//           startActivity(new Intent(SigninActivity.this,MapsActivity.class));
////            finish();
//        } else {
//        // If sign in fails, display a message to the user.
//        Log.w(TAG, "signInWithEmail:failure", task.getException());
//        Toast.makeText(SigninActivity.this, "Authentication failed.",
//        Toast.LENGTH_SHORT).show();
//        updateUI(null);
//        }
//
//        // [START_EXCLUDE]
//        if (!task.isSuccessful()) {
//        mStatusTextView.setText("auth failed");
//        }
//
//        // [END_EXCLUDE]
//        }
//        });
//        // [END sign_in_with_email]
//        }
//
//public void signOut() {
//        mAuth.signOut();
//        updateUI(null);
//        }
//
//private void sendEmailVerification() {
//        // Disable button
//        findViewById(R.id.verify_email_button).setEnabled(false);
//
//// Send verification email
//// [START send_email_verification]
//final FirebaseUser user = mAuth.getCurrentUser();
//        user.sendEmailVerification()
//        .addOnCompleteListener(this, new OnCompleteListener<Void>() {
//@Override
//public void onComplete(@NonNull Task<Void> task) {
//        // [START_EXCLUDE]
//        // Re-enable button
//        findViewById(R.id.verify_email_button).setEnabled(true);
//
//        if (task.isSuccessful()) {
//        Toast.makeText(SigninActivity.this,
//        "Verification email sent to " + user.getEmail(),
//        Toast.LENGTH_SHORT).show();
//        } else {
//        Log.e(TAG, "sendEmailVerification", task.getException());
//        Toast.makeText(SigninActivity.this,
//        "Failed to send verification email.",
//        Toast.LENGTH_SHORT).show();
//        }
//        // [END_EXCLUDE]
//        }
//        });
//        // [END send_email_verification]
//        }
//
//private boolean validateForm() {
//        boolean valid = true;
//
//        String email = mEmailField.getText().toString();
//        if (TextUtils.isEmpty(email)) {
//        mEmailField.setError("Required.");
//        valid = false;
//        } else {
//        mEmailField.setError(null);
//        }
//
//        String password = mPasswordField.getText().toString();
//        if (TextUtils.isEmpty(password)) {
//        mPasswordField.setError("Required.");
//        valid = false;
//        } else {
//        mPasswordField.setError(null);
//        }
//
//        return valid;
//        }
//
//private void updateUI(FirebaseUser user) {
//
//        if (user != null) {
//                Log.d(TAG, "updateUI: "+ "not null");
////            startActivity(new Intent(SigninActivity.this,MapsActivity.class));
////            finish();
//        mStatusTextView.setText(getString(R.string.emailpassword_status_fmt,
//        user.getEmail(), user.isEmailVerified()));
//        mDetailTextView.setText(getString(R.string.firebase_status_fmt, user.getUid()));
//
////        findViewById(R.id.email_password_buttons).
////                setVisibility(View.GONE);
////        findViewById(R.id.email_password_fields).
////                setVisibility(View.GONE);
////        findViewById(R.id.signed_in_buttons).
////                setVisibility(View.VISIBLE);
////
////        findViewById(R.id.verify_email_button).setEnabled(!user.isEmailVerified());
//
//        } else {
//
//        mStatusTextView.setText("signed out");
//        mDetailTextView.setText(null);
//
//        findViewById(R.id.email_password_buttons).setVisibility(View.VISIBLE);
//        findViewById(R.id.email_password_fields).setVisibility(View.VISIBLE);
//        findViewById(R.id.signed_in_buttons).setVisibility(View.GONE);
//
//        }
//        }
//
//@Override
//public void onClick(View v) {
//        int i = v.getId();
//        if (i == R.id.email_create_account_button) {
//        createAccount(mEmailField.getText().toString(), mPasswordField.getText().toString());
//        } else if (i == R.id.email_sign_in_button) {
//        signIn(mEmailField.getText().toString(), mPasswordField.getText().toString());
//        } else if (i == R.id.sign_out_button) {
//        signOut();
//        } else if (i == R.id.verify_email_button) {
//        sendEmailVerification();
//        }
//        }
}