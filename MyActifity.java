package com.weebly.kidsnetapp.judomaster;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void onClick(View v) {
        EditText EditText = (EditText) findViewById(R.id.editText);
        String MoveName = EditText.getText().toString();
        // White Belt
        if (MoveName.matches("Tai Otoshi")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=KJ9EGSkcXnE", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Body Drop")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=KJ9EGSkcXnE", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kesa Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=9kcVWg6FMu0", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Scarf Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=9kcVWg6FMu0", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("O Goshi")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=ZmSML5kb65w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Major Hip Throw")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=ZmSML5kb65w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kata Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=85cEPxF0J1g", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Shoulder Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=85cEPxF0J1g", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Uki Goshi")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=5b2NVteIA4w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Minor Hip Throw")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=5b2NVteIA4w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kami Shiho Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=muwDcpio-ak", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Upper Four Quarter Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=muwDcpio-ak", TextView.BufferType.EDITABLE);
            // Yellow Belt
        } else if (MoveName.matches("Osoto Gari")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=1JL1Hw7M3cU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Major Outer Reaping Throw")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=1JL1Hw7M3cU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Yoko Shiho Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=EU1WkdqwDIY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Side Four Ouarter Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=EU1WkdqwDIY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Ippon Seoi Nage")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=rkLtsh3t2sk", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Single Arm Shoulder Throw")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=rkLtsh3t2sk", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kuzure Kesa Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=Q3PRbWeui8w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Broken Scarf Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=Q3PRbWeui8w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Morote Seol Nage")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=JXFUrzBtsrY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Two Arm Shoulder Throw")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=JXFUrzBtsrY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kuzure Yoko Shiho Gatame")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=0Sh1orRYe-w", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Broken Side Four Quarter Hold")) {
            EditText editText = (EditText) findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=0Sh1orRYe-w", TextView.BufferType.EDITABLE);
            // Orange Belt
        } else if (MoveName.matches("Ashi Guruma")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=0cCsllLrClY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Leg Wheel")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=0cCsllLrClY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Mune Gatame")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=sHszeDpg20Y", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Check Hold")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=sHszeDpg20Y", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Hiza Guruma")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=VDsiBURKj-s", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Knee Wheel")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=VDsiBURKj-s", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kuzure Kesa Shiho Gatame")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=gAixAWtXCIU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Broken Upper Four Quarter Hold")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=gAixAWtXCIU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Ouchi Gari")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=6OxoWzpwezo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Major Inner Reaping Throw")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=6OxoWzpwezo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Ushiro Kesa Gatame")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=oncQzkkTAgo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Reverse Scarf Hold")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=oncQzkkTAgo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("De Ashi Harai")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=I25HN3DE8hs", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Advancing Foot Sweep")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=I25HN3DE8hs", TextView.BufferType.EDITABLE);
            // Green Belt
        } else if (MoveName.matches("Harai Goshi")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=VxbiRC7BBeI", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Sweeping Hip Throw")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=VxbiRC7BBeI", TextView.BufferType.EDITABLE);
            // Hamster Easter Egg
        } else if (MoveName.matches("Sweeping Hamster Throw")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("A Hamster Was Here \uD83D\uDC39", TextView.BufferType.EDITABLE);
            // Back to normal moves
        } else if (MoveName.matches("Tate Shiho Gatame")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=IK0X4adRyeU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Over Hold")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=IK0X4adRyeU", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Ko Soto Gari")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=jkH26994RQ8", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Minor Outer Reaping Throw")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=jkH26994RQ8", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Ko Uchi Gari")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=-SuAzlYzpJk", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Minor Inner Reaping Throw")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=-SuAzlYzpJk", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Koshi Guruma")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=pJsQrgMhgk4", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Hip Wheel")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=pJsQrgMhgk4", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Seoi Otoshi")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=cS_XrgE0hNE", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Shoulder Drop")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=cS_XrgE0hNE", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Makura Kesa Gatame")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=RK6QnkHaa-E", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Pillow Hold") {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=RK6QnkHaa-E", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Sasae-TsuriKomi Ashi")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=lWtn1qEHyTo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Drawing Propping Ankle Sweep")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=lWtn1qEHyTo", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("O Guruma")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=jNf08NFlaUg", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Large Wheel")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=jNf08NFlaUg", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Okuri Ashi Harai")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=mUnkPZSgHCY", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Double Foot Sweep")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=mUnkPZSgHCY", TextView.BufferType.EDITABLE);
            //<EASTER_EGG>
        } else if (MoveName.matches("21")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=Drd-Fg-6uiY", TextView.BufferType.EDITABLE);
            //</EASTER_EGG>
        } else if (MoveName.matches("Uchi Mata")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=O93a4H5dEis", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Inner Thigh")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=O93a4H5dEis", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Hane Goshi")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=TTLgAT_uEis", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Spring Hip")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=TTLgAT_uEis", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Tani Otoshi")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=RqXZJ-xj6t4", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Valley Drop")) {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=RqXZJ-xj6t4", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Kata Guruma")) {
            EditText editText = (EditText)findViewById(R.id.ylurl);
            editText.setText("https://www.youtube.com/watch?v=hBSJoGYmEko", TextView.BufferType.EDITABLE);
        } else if (MoveName.matches("Shoulder Wheel") {
            EditText editText = (EditText)findViewById(R.id.yturl);
            editText.setText("https://www.youtube.com/watch?v=hBSJoGYmEko", TextView.BufferType.EDITABLE);
        }

    }
}
