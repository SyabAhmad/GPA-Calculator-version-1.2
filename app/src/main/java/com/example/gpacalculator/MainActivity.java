package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button after2023GPA, finOldGpa, clearAllOld;
    private ImageButton toAboutPage, settingPage;
    private EditText ch1, ch2, ch3, ch4, ch5, ch6, m1, m2, m3, m4, m5, m6;
    private TextView finalGPAView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // go to the next page of new system
        after2023GPA = (Button) findViewById(R.id.after2023GPA);
        after2023GPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(MainActivity.this, newSystem.class));
                    finish();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });

        // got o about me
        toAboutPage = (ImageButton) findViewById(R.id.aboutMePage);
        toAboutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(MainActivity.this, aboutMe.class));
                    finish();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });


        finOldGpa = (Button) findViewById(R.id.findOldGPA);
        finOldGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    System.out.println(goToCalculation());
                    finalGPAView = (TextView) findViewById(R.id.FinalGPAView);
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    /// goto calculation function
                    double value = goToCalculation();
                    String value1 = String.valueOf(decimalFormat.format(value));

                    if (value >= 3.50) {
                        finalGPAView.setTextColor(Color.parseColor("#4CAF50"));
                    }
                    if (value <= 3.40 && value >= 2.80) {
                        finalGPAView.setTextColor(Color.parseColor("#CDDC39"));
                    }
                    if (value > 2.00 && value <= 2.80) {
                        finalGPAView.setTextColor(Color.parseColor("#792522"));
                    }
                    if (value < 2.00) {
                        finalGPAView.setTextColor(Color.parseColor("#F10B02"));

                    }
                    finalGPAView.setText(value1 + " GPA");

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        /// to clear all the fields
        clearAllOld = (Button) findViewById(R.id.clearAllOld);
        clearAllOld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    m1.setText("");
                    m2.setText("");
                    m3.setText("");
                    m4.setText("");
                    m5.setText("");
                    m6.setText("");

                    ch1.setText("");
                    ch2.setText("");
                    ch3.setText("");
                    ch4.setText("");
                    ch5.setText("");
                    ch6.setText("");

                    finalGPAView.setText("");
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        settingPage = (ImageButton) findViewById(R.id.settings);
        settingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                    finish();
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private double goToCalculation() {
        m1 = (EditText) findViewById(R.id.m1Old);
        m2 = (EditText) findViewById(R.id.m2Old);
        m3 = (EditText) findViewById(R.id.m3Old);
        m4 = (EditText) findViewById(R.id.m4Old);
        m5 = (EditText) findViewById(R.id.m5Old);
        m6 = (EditText) findViewById(R.id.m6Old);

        ch1 = (EditText) findViewById(R.id.ch1Old);
        ch2 = (EditText) findViewById(R.id.ch2Old);
        ch3 = (EditText) findViewById(R.id.ch3Old);
        ch4 = (EditText) findViewById(R.id.ch4Old);
        ch5 = (EditText) findViewById(R.id.ch5Old);
        ch6 = (EditText) findViewById(R.id.ch6Old);

        double gpa1 = 0.0;
        double gpa2 = 0.0;
        double gpa3 = 0.0;
        double gpa4 = 0.0;
        double gpa5 = 0.0;
        double gpa6 = 0.0;

        int totalCredits = 0;

        int credits1 = Integer.parseInt(String.valueOf(ch1.getText()));
        int credits2 = Integer.parseInt(String.valueOf(ch2.getText()));
        int credits3 = Integer.parseInt(String.valueOf(ch3.getText()));
        int credits4 = Integer.parseInt(String.valueOf(ch4.getText()));
        int credits5 = Integer.parseInt(String.valueOf(ch5.getText()));
        int credits6 = Integer.parseInt(String.valueOf(ch6.getText()));
        totalCredits = credits1 + credits2 + credits3 + credits4 + credits5 + credits6;

        int marks1 = Integer.parseInt(String.valueOf(m1.getText()));
        int marks2 = Integer.parseInt(String.valueOf(m2.getText()));
        int marks3 = Integer.parseInt(String.valueOf(m3.getText()));
        int marks4 = Integer.parseInt(String.valueOf(m4.getText()));
        int marks5 = Integer.parseInt(String.valueOf(m5.getText()));
        int marks6 = Integer.parseInt(String.valueOf(m6.getText()));


        ///For Mraks 1 Field
        if (marks1 >= 85 && marks1 <= 100) {
            gpa1 = 4.0;
        } else if (marks1 ==84) {
            gpa1 = 3.9;
        } else if (marks1 ==83) {
            gpa1 = 3.8;
        } else if (marks1 ==82) {
            gpa1 = 3.7;
        } else if (marks1 ==81) {
            gpa1 = 3.6;
        } else if (marks1 ==80) {
            gpa1 = 3.5;
        } else if (marks1 ==79) {
            gpa1 = 3.4;
        } else if (marks1 ==78) {
            gpa1 = 3.4;
        } else if (marks1 ==77) {
            gpa1 = 3.3;
        } else if (marks1 ==76) {
            gpa1 = 3.3;
        } else if (marks1 ==75) {
            gpa1 = 3.2;
        } else if (marks1 ==74) {
            gpa1 = 3.2;
        } else if (marks1 ==73) {
            gpa1 = 3.1;
        } else if (marks1 ==72) {
            gpa1 = 3.0;
        } else if (marks1 ==71) {
            gpa1 = 2.9;
        } else if (marks1 ==70) {
            gpa1 = 2.8;
        } else if (marks1 ==69) {
            gpa1 = 2.7;
        } else if (marks1 ==68) {
            gpa1 = 2.6;
        } else if (marks1 ==67) {
            gpa1 = 2.5;
        } else if (marks1 ==66) {
            gpa1 = 2.5;
        } else if (marks1 ==65) {
            gpa1 = 2.4;
        } else if (marks1 ==64) {
            gpa1 = 2.4;
        } else if (marks1 ==63) {
            gpa1 = 2.3;
        } else if (marks1 ==62) {
            gpa1 = 2.2;
        } else if (marks1 ==61) {
            gpa1 = 2.1;
        } else if (marks1 ==60) {
            gpa1 = 2.0;
        } else if (marks1 ==59) {
            gpa1 = 1.9;
        } else if (marks1 ==58) {
            gpa1 = 1.8;
        } else if (marks1 ==57) {
            gpa1 = 1.7;
        } else if (marks1 ==56) {
            gpa1 = 1.6;
        } else if (marks1 ==55) {
            gpa1 = 1.5;
        } else if (marks1 ==54) {
            gpa1 = 1.4;
        } else if (marks1 ==53) {
            gpa1 = 1.3;
        } else if (marks1 ==52) {
            gpa1 = 1.2;
        } else if (marks1 ==51) {
            gpa1 = 1.1;
        } else if (marks1 ==50) {
            gpa1 = 1.0;
        } else if (marks1 <=49 )
        {
            gpa1 = 0.0;
        }


        ///For Mraks 2 Field
        if (marks2 >= 85 && marks2 <= 100) {
            gpa2 = 4.0;
        } else if (marks2 ==84) {
            gpa2 = 3.9;
        } else if (marks2 ==83) {
            gpa2 = 3.8;
        } else if (marks2 ==82) {
            gpa2 = 3.7;
        } else if (marks2 ==81) {
            gpa2 = 3.6;
        } else if (marks2 ==80) {
            gpa2 = 3.5;
        } else if (marks2 ==79) {
            gpa2 = 3.9;
        } else if (marks2 ==78) {
            gpa2 = 3.4;
        } else if (marks2 ==77) {
            gpa2 = 3.3;
        } else if (marks2 ==76) {
            gpa2 = 3.3;
        } else if (marks2 ==75) {
            gpa2 = 3.2;
        } else if (marks2 ==74) {
            gpa2 = 3.2;
        } else if (marks2 ==73) {
            gpa2 = 3.1;
        } else if (marks2 ==72) {
            gpa2 = 3.0;
        } else if (marks2 ==71) {
            gpa2 = 2.9;
        } else if (marks2 ==70) {
            gpa2 = 2.8;
        } else if (marks2 ==69) {
            gpa2 = 2.7;
        } else if (marks2 ==68) {
            gpa2 = 2.6;
        } else if (marks2 ==67) {
            gpa2 = 2.5;
        } else if (marks2 ==66) {
            gpa2 = 2.5;
        } else if (marks2 ==65) {
            gpa2 = 2.4;
        } else if (marks2 ==64) {
            gpa2 = 2.4;
        } else if (marks2 ==63) {
            gpa2 = 2.3;
        } else if (marks2 ==62) {
            gpa2 = 2.2;
        } else if (marks2 ==61) {
            gpa2 = 2.1;
        } else if (marks2 ==60) {
            gpa2 = 2.0;
        } else if (marks2 ==59) {
            gpa2 = 1.9;
        } else if (marks2 ==58) {
            gpa2 = 1.8;
        } else if (marks2 ==57) {
            gpa2 = 1.7;
        } else if (marks2 ==56) {
            gpa2 = 1.6;
        } else if (marks2 ==55) {
            gpa2 = 1.5;
        } else if (marks2 ==54) {
            gpa2 = 1.4;
        } else if (marks2 ==53) {
            gpa2 = 1.3;
        } else if (marks2 ==52) {
            gpa2 = 1.2;
        } else if (marks2 ==51) {
            gpa2 = 1.1;
        } else if (marks2 ==50) {
            gpa2 = 1.0;
        }else if (marks2 <=49 )
        {
            gpa2 = 0.0;
        }
        ///For Mraks 3 Field
        if (marks3 >= 85 && marks3 <= 100) {
            gpa3 = 4.0;
        } else if (marks3 ==84) {
            gpa3 = 3.9;
        } else if (marks3 ==83) {
            gpa3 = 3.8;
        } else if (marks3 ==82) {
            gpa3 = 3.7;
        } else if (marks3 ==81) {
            gpa3 = 3.6;
        } else if (marks3 ==80) {
            gpa3 = 3.5;
        } else if (marks3 ==79) {
            gpa3 = 3.9;
        } else if (marks3 ==78) {
            gpa3 = 3.4;
        } else if (marks3 ==77) {
            gpa3 = 3.3;
        } else if (marks3 ==76) {
            gpa3 = 3.3;
        } else if (marks3 ==75) {
            gpa3 = 3.2;
        } else if (marks3 ==74) {
            gpa3 = 3.2;
        } else if (marks3 ==73) {
            gpa3 = 3.1;
        } else if (marks3 ==72) {
            gpa3 = 3.0;
        } else if (marks3 ==71) {
            gpa3 = 2.9;
        } else if (marks3 ==70) {
            gpa3 = 2.8;
        } else if (marks3 ==69) {
            gpa3 = 2.7;
        } else if (marks3 ==68) {
            gpa3 = 2.6;
        } else if (marks3 ==67) {
            gpa3 = 2.5;
        } else if (marks3 ==66) {
            gpa3 = 2.5;
        } else if (marks3 ==65) {
            gpa3 = 2.4;
        } else if (marks3 ==64) {
            gpa3 = 2.4;
        } else if (marks3 ==63) {
            gpa3 = 2.3;
        } else if (marks3 ==62) {
            gpa3 = 2.2;
        } else if (marks3 ==61) {
            gpa3 = 2.1;
        } else if (marks3 ==60) {
            gpa3 = 2.0;
        } else if (marks3 ==59) {
            gpa3 = 1.9;
        } else if (marks3 ==58) {
            gpa3 = 1.8;
        } else if (marks3 ==57) {
            gpa3 = 1.7;
        } else if (marks3 ==56) {
            gpa3 = 1.6;
        } else if (marks3 ==55) {
            gpa3 = 1.5;
        } else if (marks3 ==54) {
            gpa3 = 1.4;
        } else if (marks3 ==53) {
            gpa3 = 1.3;
        } else if (marks3 ==52) {
            gpa3 = 1.2;
        } else if (marks3 ==51) {
            gpa3 = 1.1;
        } else if (marks3 ==50) {
            gpa3 = 1.0;
        }else if (marks3 <=49 )
        {
            gpa3 = 0.0;
        }
        ///For Mraks 4 Field
        if (marks4 >= 85 && marks4 <= 100) {
            gpa4 = 4.0;
        } else if (marks4 ==84) {
            gpa4 = 3.9;
        } else if (marks4 ==83) {
            gpa4 = 3.8;
        } else if (marks4 ==82) {
            gpa4 = 3.7;
        } else if (marks4 ==81) {
            gpa4 = 3.6;
        } else if (marks4 ==80) {
            gpa4 = 3.5;
        } else if (marks4 ==79) {
            gpa4 = 3.9;
        } else if (marks4 ==78) {
            gpa4 = 3.4;
        } else if (marks4 ==77) {
            gpa4 = 3.3;
        } else if (marks4 ==76) {
            gpa4 = 3.3;
        } else if (marks4 ==75) {
            gpa4 = 3.2;
        } else if (marks4 ==74) {
            gpa4 = 3.2;
        } else if (marks4 ==73) {
            gpa4 = 3.1;
        } else if (marks4 ==72) {
            gpa4 = 3.0;
        } else if (marks4 ==71) {
            gpa4 = 2.9;
        } else if (marks4 ==70) {
            gpa4 = 2.8;
        } else if (marks4 ==69) {
            gpa4 = 2.7;
        } else if (marks4 ==68) {
            gpa4 = 2.6;
        } else if (marks4 ==67) {
            gpa4 = 2.5;
        } else if (marks4 ==66) {
            gpa4 = 2.5;
        } else if (marks4 ==65) {
            gpa4 = 2.4;
        } else if (marks4 ==64) {
            gpa4 = 2.4;
        } else if (marks4 ==63) {
            gpa4 = 2.3;
        } else if (marks4 ==62) {
            gpa4 = 2.2;
        } else if (marks4 ==61) {
            gpa4 = 2.1;
        } else if (marks4 ==60) {
            gpa4 = 2.0;
        } else if (marks4 ==59) {
            gpa4 = 1.9;
        } else if (marks4 ==58) {
            gpa4 = 1.8;
        } else if (marks4 ==57) {
            gpa4 = 1.7;
        } else if (marks4 ==56) {
            gpa4 = 1.6;
        } else if (marks4 ==55) {
            gpa4 = 1.5;
        } else if (marks4 ==54) {
            gpa4 = 1.4;
        } else if (marks4 ==53) {
            gpa4 = 1.3;
        } else if (marks4 ==52) {
            gpa4 = 1.2;
        } else if (marks4 ==51) {
            gpa4 = 1.1;
        } else if (marks4 ==50) {
            gpa4 = 1.0;
        }else if (marks4 <=49 )
        {
            gpa4 = 0.0;
        }
        ///For Mraks 5 Field
        if (marks5 >= 85 && marks5 <= 100) {
            gpa5 = 4.0;
        } else if (marks5 ==84) {
            gpa5 = 3.9;
        } else if (marks5 ==83) {
            gpa5 = 3.8;
        } else if (marks5 ==82) {
            gpa5 = 3.7;
        } else if (marks5 ==81) {
            gpa5 = 3.6;
        } else if (marks5 ==80) {
            gpa5 = 3.5;
        } else if (marks5 ==79) {
            gpa5 = 3.9;
        } else if (marks5 ==78) {
            gpa5 = 3.4;
        } else if (marks5 ==77) {
            gpa5 = 3.3;
        } else if (marks5 ==76) {
            gpa5 = 3.3;
        } else if (marks5 ==75) {
            gpa5 = 3.2;
        } else if (marks5 ==74) {
            gpa5 = 3.2;
        } else if (marks5 ==73) {
            gpa5 = 3.1;
        } else if (marks5 ==72) {
            gpa5 = 3.0;
        } else if (marks5 ==71) {
            gpa5 = 2.9;
        } else if (marks5 ==70) {
            gpa5 = 2.8;
        } else if (marks5 ==69) {
            gpa5 = 2.7;
        } else if (marks5 ==68) {
            gpa5 = 2.6;
        } else if (marks5 ==67) {
            gpa5 = 2.5;
        } else if (marks5 ==66) {
            gpa5 = 2.5;
        } else if (marks5 ==65) {
            gpa5 = 2.4;
        } else if (marks5 ==64) {
            gpa5 = 2.4;
        } else if (marks5 ==63) {
            gpa5 = 2.3;
        } else if (marks5 ==62) {
            gpa5 = 2.2;
        } else if (marks5 ==61) {
            gpa5 = 2.1;
        } else if (marks5 ==60) {
            gpa5 = 2.0;
        } else if (marks5 ==59) {
            gpa5 = 1.9;
        } else if (marks5 ==58) {
            gpa5 = 1.8;
        } else if (marks5 ==57) {
            gpa5 = 1.7;
        } else if (marks5 ==56) {
            gpa5 = 1.6;
        } else if (marks5 ==55) {
            gpa5 = 1.5;
        } else if (marks5 ==54) {
            gpa5 = 1.4;
        } else if (marks5 ==53) {
            gpa5 = 1.3;
        } else if (marks5 ==52) {
            gpa5 = 1.2;
        } else if (marks5 ==51) {
            gpa5 = 1.1;
        } else if (marks5 ==50) {
            gpa5 = 1.0;
        }else if (marks5 <=49 )
        {
            gpa5 = 0.0;
        }
        ///For Mraks 6 Field
        if (marks6 >= 85 && marks6 <= 100) {
            gpa6 = 4.0;
        } else if (marks6 ==84) {
            gpa6 = 3.9;
        } else if (marks6 ==83) {
            gpa6 = 3.8;
        } else if (marks6 ==82) {
            gpa6 = 3.7;
        } else if (marks6 ==81) {
            gpa6 = 3.6;
        } else if (marks6 ==80) {
            gpa6 = 3.5;
        } else if (marks6 ==79) {
            gpa6 = 3.9;
        } else if (marks6 ==78) {
            gpa6 = 3.4;
        } else if (marks6 ==77) {
            gpa6 = 3.3;
        } else if (marks6 ==76) {
            gpa6 = 3.3;
        } else if (marks6 ==75) {
            gpa6 = 3.2;
        } else if (marks6 ==74) {
            gpa6 = 3.2;
        } else if (marks6 ==73) {
            gpa6 = 3.1;
        } else if (marks6 ==72) {
            gpa6 = 3.0;
        } else if (marks6 ==71) {
            gpa6 = 2.9;
        } else if (marks6 ==70) {
            gpa6 = 2.8;
        } else if (marks6 ==69) {
            gpa6 = 2.7;
        } else if (marks6 ==68) {
            gpa6 = 2.6;
        } else if (marks6 ==67) {
            gpa6 = 2.5;
        } else if (marks6 ==66) {
            gpa6 = 2.5;
        } else if (marks6 ==65) {
            gpa6 = 2.4;
        } else if (marks6 ==64) {
            gpa6 = 2.4;
        } else if (marks6 ==63) {
            gpa6 = 2.3;
        } else if (marks6 ==62) {
            gpa6 = 2.2;
        } else if (marks6 ==61) {
            gpa6 = 2.1;
        } else if (marks6 ==60) {
            gpa6 = 2.0;
        } else if (marks6 ==59) {
            gpa6 = 1.9;
        } else if (marks6 ==58) {
            gpa6 = 1.8;
        } else if (marks6 ==57) {
            gpa6 = 1.7;
        } else if (marks6 ==56) {
            gpa6 = 1.6;
        } else if (marks6 ==55) {
            gpa6 = 1.5;
        } else if (marks6 ==54) {
            gpa6 = 1.4;
        } else if (marks6 ==53) {
            gpa6 = 1.3;
        } else if (marks6 ==52) {
            gpa6 = 1.2;
        } else if (marks6 ==51) {
            gpa6 = 1.1;
        } else if (marks6 ==50) {
            gpa6 = 1.0;
        }else if (marks6 <=49 )
        {
            gpa6 += 0.0;
        }

        return (gpa1*credits1+gpa2*credits2+gpa3*credits3+gpa4*credits4+gpa5*credits5+gpa6*credits6)/(credits1+credits2+credits3+credits4+credits5+credits6);

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // User clicked "Yes" button, so exit the application
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}