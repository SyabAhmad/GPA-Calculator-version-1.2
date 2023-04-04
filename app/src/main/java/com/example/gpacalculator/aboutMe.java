package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class aboutMe extends AppCompatActivity {

    private Button backFromAbout;
    private ImageButton toLinkedIN, toFacebook, toInstagram, toGithub, toTwitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        /// to Main Page
        backFromAbout = (Button) findViewById(R.id.backFromAbout);
        backFromAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(aboutMe.this, MainActivity.class));
                    finish();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // to LinkedIn

        toLinkedIN = (ImageButton) findViewById(R.id.linkedIN);

        toLinkedIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String url = "https://www.linkedin.com/in/syed-syab-ahmad-shah-776a421b7";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }


            }
        });

        toInstagram = (ImageButton) findViewById(R.id.Intagram);
        toInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://instagram.com/syed_syab_ahmad?igshid=ZDdkNTZiNTM=";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toFacebook = (ImageButton) findViewById(R.id.FaceBook);
        toFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://www.facebook.com/syed.syab?mibextid=ZbWKwL";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toGithub = (ImageButton) findViewById(R.id.github);
        toGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://www.github.com/SyabAhmad";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        toTwitter = (ImageButton) findViewById(R.id.twitter);
        toTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String url = "https://twitter.com/syab_ahmad?t=NsLGGTBKCXGCdIoVPQET5A&s=09";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}