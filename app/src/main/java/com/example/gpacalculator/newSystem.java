package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class newSystem extends AppCompatActivity {

    private Button before2023GPA, findNewGPA, clearAllNew;
    private ImageButton toAboutPage, settingPage;
    private EditText Nch1, Nch2, Nch3, Nch4, Nch5, Nch6, Nm1, Nm2, Nm3, Nm4, Nm5, Nm6;
    private TextView finalNewGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsystem);
        // go to the next page of Old system
        before2023GPA = (Button) findViewById(R.id.before2023GPA);
        before2023GPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(newSystem.this, MainActivity.class));
                    finish();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        /// got to about me page
        toAboutPage = (ImageButton) findViewById(R.id.aboutMePage);
        toAboutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(newSystem.this, aboutMe.class));
                    finish();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        findNewGPA = (Button) findViewById(R.id.findNEwGPA);
        findNewGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    System.out.println(goToNewCalculation());
                    finalNewGPA = (TextView) findViewById(R.id.FinalGPAViewNew);
                    double value = goToNewCalculation();
                    String value1 = String.valueOf(value);
                    finalNewGPA.setText(value1 + " GPA");
//                System.out.println(value1);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });

        /// to clear all the fields
        clearAllNew = (Button) findViewById(R.id.clearAllNew);
        clearAllNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Nm1.setText("");
                    Nm2.setText("");
                    Nm3.setText("");
                    Nm4.setText("");
                    Nm5.setText("");
                    Nm6.setText("");

                    Nch1.setText("");
                    Nch2.setText("");
                    Nch3.setText("");
                    Nch4.setText("");
                    Nch5.setText("");
                    Nch6.setText("");

                    finalNewGPA.setText("");
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        settingPage = (ImageButton) findViewById(R.id.settings);
        settingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(newSystem.this, SettingsActivity.class));
                    finish();
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private double goToNewCalculation() {
        Nm1 = (EditText) findViewById(R.id.Nm1);
        Nm2 = (EditText) findViewById(R.id.Nm2);
        Nm3 = (EditText) findViewById(R.id.Nm3);
        Nm4 = (EditText) findViewById(R.id.Nm4);
        Nm5 = (EditText) findViewById(R.id.Nm5);
        Nm6 = (EditText) findViewById(R.id.Nm6);

        Nch1 = (EditText) findViewById(R.id.Nch1);
        Nch2 = (EditText) findViewById(R.id.Nch2);
        Nch3 = (EditText) findViewById(R.id.Nch3);
        Nch4 = (EditText) findViewById(R.id.Nch4);
        Nch5 = (EditText) findViewById(R.id.Nch5);
        Nch6 = (EditText) findViewById(R.id.Nch6);

        double Ngpa1 = 0.0;
        double Ngpa2 = 0.0;
        double Ngpa3 = 0.0;
        double Ngpa4 = 0.0;
        double Ngpa5 = 0.0;
        double Ngpa6 = 0.0;

        int totalCredits = 0;

        int Ncredits1 = Integer.parseInt(String.valueOf(Nch1.getText()));
        int Ncredits2 = Integer.parseInt(String.valueOf(Nch2.getText()));
        int Ncredits3 = Integer.parseInt(String.valueOf(Nch3.getText()));
        int Ncredits4 = Integer.parseInt(String.valueOf(Nch4.getText()));
        int Ncredits5 = Integer.parseInt(String.valueOf(Nch5.getText()));
        int Ncredits6 = Integer.parseInt(String.valueOf(Nch6.getText()));

        totalCredits = Ncredits1 + Ncredits2 + Ncredits3 + Ncredits4 + Ncredits5 + Ncredits6;

        int Nmarks1 = Integer.parseInt(String.valueOf(Nm1.getText()));
        int Nmarks2 = Integer.parseInt(String.valueOf(Nm2.getText()));
        int Nmarks3 = Integer.parseInt(String.valueOf(Nm3.getText()));
        int Nmarks4 = Integer.parseInt(String.valueOf(Nm4.getText()));
        int Nmarks5 = Integer.parseInt(String.valueOf(Nm5.getText()));
        int Nmarks6 = Integer.parseInt(String.valueOf(Nm6.getText()));


        ///For Mraks 1 Field
        if (Nmarks1 == 100) {
            Ngpa1 = 4.0;
        } else if (Nmarks1 ==99) {
            Ngpa1 = 3.98;
        } else if (Nmarks1 ==98) {
            Ngpa1 = 3.96;
        } else if (Nmarks1 ==97) {
            Ngpa1 = 3.97;
        } else if (Nmarks1 ==96) {
            Ngpa1 = 3.91;
        } else if (Nmarks1 ==95) {
            Ngpa1 = 3.89;
        } else if (Nmarks1 ==94) {
            Ngpa1 = 3.87;
        } else if (Nmarks1 ==93) {
            Ngpa1 = 3.85;
        } else if (Nmarks1 ==92) {
            Ngpa1 = 3.82;
        } else if (Nmarks1 ==91) {
            Ngpa1 = 3.80;
        } else if (Nmarks1 ==90) {
            Ngpa1 = 3.78;
        } else if (Nmarks1 ==89) {
            Ngpa1 = 3.76;
        } else if (Nmarks1 ==88) {
            Ngpa1 = 3.74;
        } else if (Nmarks1 ==87) {
            Ngpa1 = 3.71;
        } else if (Nmarks1 ==86) {
            Ngpa1 = 3.69;
        } else if (Nmarks1 ==85) {
            Ngpa1 = 3.37;
        } else if (Nmarks1 ==84) {
            Ngpa1 = 3.66;
        } else if (Nmarks1 ==83) {
            Ngpa1 = 3.58;
        } else if (Nmarks1 ==82) {
            Ngpa1 = 3.50;
        } else if (Nmarks1 ==81) {
            Ngpa1 = 3.48;
        } else if (Nmarks1 ==80) {
            Ngpa1 = 3.34;
        } else if (Nmarks1 ==79) {
            Ngpa1 = 3.33;
        } else if (Nmarks1 ==78) {
            Ngpa1 = 3.25;
        } else if (Nmarks1 ==77) {
            Ngpa1 = 3.17;
        } else if (Nmarks1 ==76) {
            Ngpa1 = 3.09;
        } else if (Nmarks1 ==75) {
            Ngpa1 = 3.01;
        } else if (Nmarks1 ==74) {
            Ngpa1 = 3.00;
        } else if (Nmarks1 ==73) {
            Ngpa1 = 2.89;
        } else if (Nmarks1 ==72) {
            Ngpa1 = 2.78;
        } else if (Nmarks1 ==71) {
            Ngpa1 = 2.67;
        } else if (Nmarks1 ==70) {
            Ngpa1 = 2.66;
        } else if (Nmarks1 ==69) {
            Ngpa1 = 2.50;
        } else if (Nmarks1 ==68) {
            Ngpa1 = 2.34;
        } else if (Nmarks1 ==67) {
            Ngpa1 = 2.33;
        } else if (Nmarks1 ==66) {
            Ngpa1 = 2.22;
        } else if (Nmarks1 ==65) {
            Ngpa1 = 2.12;
        }else if (Nmarks1 ==64) {
            Ngpa1 = 2.01;
        }else if (Nmarks1 ==63) {
            Ngpa1 = 2.00;
        }else if (Nmarks1 ==62) {
            Ngpa1 = 1.84;
        }else if (Nmarks1 ==61) {
            Ngpa1 = 1.67;
        }else if (Nmarks1 ==60) {
            Ngpa1 = 1.66;
        }else if (Nmarks1 ==59) {
            Ngpa1 = 1.49;
        }else if (Nmarks1 ==58) {
            Ngpa1 = 1.31;
        }else if (Nmarks1 ==57) {
            Ngpa1 = 1.30;
        }else if (Nmarks1 ==56) {
            Ngpa1 = 1.20;
        }else if (Nmarks1 ==55) {
            Ngpa1 = 1.12;
        }else if (Nmarks1 ==54) {
            Ngpa1 = 1.01;
        }else if (Nmarks1 ==53) {
            Ngpa1 = 1.00;
        }else if (Nmarks1 ==52) {
            Ngpa1 = 0.70;
        }else if (Nmarks1 ==51) {
            Ngpa1 = 0.40;
        }else if (Nmarks1 ==50) {
            Ngpa1 = 0.10;
        } else if (Nmarks1 <=49 )
        {
            Ngpa1 = 0.00;
        }


        ///For Mraks 2 Field
        if (Nmarks2 == 100) {
            Ngpa2 = 4.0;
        } else if (Nmarks2 ==99) {
            Ngpa2 = 3.98;
        } else if (Nmarks2 ==98) {
            Ngpa2 = 3.96;
        } else if (Nmarks2 ==97) {
            Ngpa2 = 3.97;
        } else if (Nmarks2 ==96) {
            Ngpa2 = 3.91;
        } else if (Nmarks2 ==95) {
            Ngpa2 = 3.89;
        } else if (Nmarks2 ==94) {
            Ngpa2 = 3.87;
        } else if (Nmarks2 ==93) {
            Ngpa2 = 3.85;
        } else if (Nmarks2 ==92) {
            Ngpa2 = 3.82;
        } else if (Nmarks2 ==91) {
            Ngpa2 = 3.80;
        } else if (Nmarks2 ==90) {
            Ngpa2 = 3.78;
        } else if (Nmarks2 ==89) {
            Ngpa2 = 3.76;
        } else if (Nmarks2 ==88) {
            Ngpa2 = 3.74;
        } else if (Nmarks2 ==87) {
            Ngpa2 = 3.71;
        } else if (Nmarks2 ==86) {
            Ngpa2 = 3.69;
        } else if (Nmarks2 ==85) {
            Ngpa2 = 3.37;
        } else if (Nmarks2 ==84) {
            Ngpa2 = 3.66;
        } else if (Nmarks2 ==83) {
            Ngpa2 = 3.58;
        } else if (Nmarks2 ==82) {
            Ngpa2 = 3.50;
        } else if (Nmarks2 ==81) {
            Ngpa2 = 3.48;
        } else if (Nmarks2 ==80) {
            Ngpa2 = 3.34;
        } else if (Nmarks2 ==79) {
            Ngpa2 = 3.33;
        } else if (Nmarks2 ==78) {
            Ngpa2 = 3.25;
        } else if (Nmarks2 ==77) {
            Ngpa2 = 3.17;
        } else if (Nmarks2 ==76) {
            Ngpa2 = 3.09;
        } else if (Nmarks2 ==75) {
            Ngpa2 = 3.01;
        } else if (Nmarks2 ==74) {
            Ngpa2 = 3.00;
        } else if (Nmarks2 ==73) {
            Ngpa2 = 2.89;
        } else if (Nmarks2 ==72) {
            Ngpa2 = 2.78;
        } else if (Nmarks2 ==71) {
            Ngpa2 = 2.67;
        } else if (Nmarks2 ==70) {
            Ngpa2 = 2.66;
        } else if (Nmarks2 ==69) {
            Ngpa2 = 2.50;
        } else if (Nmarks2 ==68) {
            Ngpa2 = 2.34;
        } else if (Nmarks2 ==67) {
            Ngpa2 = 2.33;
        } else if (Nmarks2 ==66) {
            Ngpa2 = 2.22;
        } else if (Nmarks2 ==65) {
            Ngpa2 = 2.12;
        }else if (Nmarks2 ==64) {
            Ngpa2 = 2.01;
        }else if (Nmarks2 ==63) {
            Ngpa2 = 2.00;
        }else if (Nmarks2 ==62) {
            Ngpa2 = 1.84;
        }else if (Nmarks2 ==61) {
            Ngpa2 = 1.67;
        }else if (Nmarks2 ==60) {
            Ngpa2 = 1.66;
        }else if (Nmarks2 ==59) {
            Ngpa2 = 1.49;
        }else if (Nmarks2 ==58) {
            Ngpa2 = 1.31;
        }else if (Nmarks2 ==57) {
            Ngpa2 = 1.30;
        }else if (Nmarks2 ==56) {
            Ngpa2 = 1.20;
        }else if (Nmarks2 ==55) {
            Ngpa2 = 1.12;
        }else if (Nmarks2 ==54) {
            Ngpa2 = 1.01;
        }else if (Nmarks2 ==53) {
            Ngpa2 = 1.00;
        }else if (Nmarks2 ==52) {
            Ngpa2 = 0.70;
        }else if (Nmarks2 ==51) {
            Ngpa2 = 0.40;
        }else if (Nmarks2 ==50) {
            Ngpa2 = 0.10;
        } else if (Nmarks2 <=49 )
        {
            Ngpa2 = 0.00;
        }





        ///For Mraks 3 Field
        if (Nmarks3 == 100) {
            Ngpa3 = 4.0;
        } else if (Nmarks3 ==99) {
            Ngpa3 = 3.98;
        } else if (Nmarks3 ==98) {
            Ngpa3 = 3.96;
        } else if (Nmarks3 ==97) {
            Ngpa3 = 3.97;
        } else if (Nmarks3 ==96) {
            Ngpa3 = 3.91;
        } else if (Nmarks3 ==95) {
            Ngpa3 = 3.89;
        } else if (Nmarks3 ==94) {
            Ngpa3 = 3.87;
        } else if (Nmarks3 ==93) {
            Ngpa3 = 3.85;
        } else if (Nmarks3 ==92) {
            Ngpa3 = 3.82;
        } else if (Nmarks3 ==91) {
            Ngpa3 = 3.80;
        } else if (Nmarks3 ==90) {
            Ngpa3 = 3.78;
        } else if (Nmarks3 ==89) {
            Ngpa3 = 3.76;
        } else if (Nmarks3 ==88) {
            Ngpa3 = 3.74;
        } else if (Nmarks3 ==87) {
            Ngpa3 = 3.71;
        } else if (Nmarks3 ==86) {
            Ngpa3 = 3.69;
        } else if (Nmarks3 ==85) {
            Ngpa3 = 3.37;
        } else if (Nmarks3 ==84) {
            Ngpa3 = 3.66;
        } else if (Nmarks3 ==83) {
            Ngpa3 = 3.58;
        } else if (Nmarks3 ==82) {
            Ngpa3 = 3.50;
        } else if (Nmarks3 ==81) {
            Ngpa3 = 3.48;
        } else if (Nmarks3 ==80) {
            Ngpa3 = 3.34;
        } else if (Nmarks3 ==79) {
            Ngpa3 = 3.33;
        } else if (Nmarks3 ==78) {
            Ngpa3 = 3.25;
        } else if (Nmarks3 ==77) {
            Ngpa3 = 3.17;
        } else if (Nmarks3 ==76) {
            Ngpa3 = 3.09;
        } else if (Nmarks3 ==75) {
            Ngpa3 = 3.01;
        } else if (Nmarks3 ==74) {
            Ngpa3 = 3.00;
        } else if (Nmarks3 ==73) {
            Ngpa3 = 2.89;
        } else if (Nmarks3 ==72) {
            Ngpa3 = 2.78;
        } else if (Nmarks3 ==71) {
            Ngpa3 = 2.67;
        } else if (Nmarks3 ==70) {
            Ngpa3 = 2.66;
        } else if (Nmarks3 ==69) {
            Ngpa3 = 2.50;
        } else if (Nmarks3 ==68) {
            Ngpa3 = 2.34;
        } else if (Nmarks3 ==67) {
            Ngpa3 = 2.33;
        } else if (Nmarks3 ==66) {
            Ngpa3 = 2.22;
        } else if (Nmarks3 ==65) {
            Ngpa3 = 2.12;
        }else if (Nmarks3 ==64) {
            Ngpa3 = 2.01;
        }else if (Nmarks3 ==63) {
            Ngpa3 = 2.00;
        }else if (Nmarks3 ==62) {
            Ngpa3 = 1.84;
        }else if (Nmarks3 ==61) {
            Ngpa3 = 1.67;
        }else if (Nmarks3 ==60) {
            Ngpa3 = 1.66;
        }else if (Nmarks3 ==59) {
            Ngpa3 = 1.49;
        }else if (Nmarks3 ==58) {
            Ngpa3 = 1.31;
        }else if (Nmarks3 ==57) {
            Ngpa3 = 1.30;
        }else if (Nmarks3 ==56) {
            Ngpa3 = 1.20;
        }else if (Nmarks3 ==55) {
            Ngpa3 = 1.12;
        }else if (Nmarks3 ==54) {
            Ngpa3 = 1.01;
        }else if (Nmarks3 ==53) {
            Ngpa3 = 1.00;
        }else if (Nmarks3 ==52) {
            Ngpa3 = 0.70;
        }else if (Nmarks3 ==51) {
            Ngpa3 = 0.40;
        }else if (Nmarks3 ==50) {
            Ngpa3 = 0.10;
        } else if (Nmarks3 <=49 )
        {
            Ngpa3 = 0.00;
        }



        ///For Mraks 4 Field
        if (Nmarks4 == 100) {
            Ngpa4 = 4.0;
        } else if (Nmarks4 ==99) {
            Ngpa4 = 3.98;
        } else if (Nmarks4 ==98) {
            Ngpa4 = 3.96;
        } else if (Nmarks4 ==97) {
            Ngpa4 = 3.97;
        } else if (Nmarks4 ==96) {
            Ngpa4 = 3.91;
        } else if (Nmarks4 ==95) {
            Ngpa4 = 3.89;
        } else if (Nmarks4 ==94) {
            Ngpa4 = 3.87;
        } else if (Nmarks4 ==93) {
            Ngpa4 = 3.85;
        } else if (Nmarks4 ==92) {
            Ngpa4 = 3.82;
        } else if (Nmarks4 ==91) {
            Ngpa4 = 3.80;
        } else if (Nmarks4 ==90) {
            Ngpa4 = 3.78;
        } else if (Nmarks4 ==89) {
            Ngpa4 = 3.76;
        } else if (Nmarks4 ==88) {
            Ngpa4 = 3.74;
        } else if (Nmarks4 ==87) {
            Ngpa4 = 3.71;
        } else if (Nmarks4 ==86) {
            Ngpa4 = 3.69;
        } else if (Nmarks4 ==85) {
            Ngpa4 = 3.37;
        } else if (Nmarks4 ==84) {
            Ngpa4 = 3.66;
        } else if (Nmarks4 ==83) {
            Ngpa4 = 3.58;
        } else if (Nmarks4 ==82) {
            Ngpa4 = 3.50;
        } else if (Nmarks4 ==81) {
            Ngpa4 = 3.48;
        } else if (Nmarks4 ==80) {
            Ngpa4 = 3.34;
        } else if (Nmarks4 ==79) {
            Ngpa4 = 3.33;
        } else if (Nmarks4 ==78) {
            Ngpa4 = 3.25;
        } else if (Nmarks4 ==77) {
            Ngpa4 = 3.17;
        } else if (Nmarks4 ==76) {
            Ngpa4 = 3.09;
        } else if (Nmarks4 ==75) {
            Ngpa4 = 3.01;
        } else if (Nmarks4 ==74) {
            Ngpa4 = 3.00;
        } else if (Nmarks4 ==73) {
            Ngpa4 = 2.89;
        } else if (Nmarks4 ==72) {
            Ngpa4 = 2.78;
        } else if (Nmarks4 ==71) {
            Ngpa4 = 2.67;
        } else if (Nmarks4 ==70) {
            Ngpa4 = 2.66;
        } else if (Nmarks4 ==69) {
            Ngpa4 = 2.50;
        } else if (Nmarks4 ==68) {
            Ngpa4 = 2.34;
        } else if (Nmarks4 ==67) {
            Ngpa4 = 2.33;
        } else if (Nmarks4 ==66) {
            Ngpa4 = 2.22;
        } else if (Nmarks4 ==65) {
            Ngpa4 = 2.12;
        }else if (Nmarks4 ==64) {
            Ngpa4 = 2.01;
        }else if (Nmarks4 ==63) {
            Ngpa4 = 2.00;
        }else if (Nmarks4 ==62) {
            Ngpa4 = 1.84;
        }else if (Nmarks4 ==61) {
            Ngpa4 = 1.67;
        }else if (Nmarks4 ==60) {
            Ngpa4 = 1.66;
        }else if (Nmarks4 ==59) {
            Ngpa4 = 1.49;
        }else if (Nmarks4 ==58) {
            Ngpa4 = 1.31;
        }else if (Nmarks4 ==57) {
            Ngpa4 = 1.30;
        }else if (Nmarks4 ==56) {
            Ngpa4 = 1.20;
        }else if (Nmarks4 ==55) {
            Ngpa4 = 1.12;
        }else if (Nmarks4 ==54) {
            Ngpa4 = 1.01;
        }else if (Nmarks4 ==53) {
            Ngpa4 = 1.00;
        }else if (Nmarks4 ==52) {
            Ngpa4 = 0.70;
        }else if (Nmarks4 ==51) {
            Ngpa4 = 0.40;
        }else if (Nmarks4 ==50) {
            Ngpa4 = 0.10;
        } else if (Nmarks4 <=49 )
        {
            Ngpa4 = 0.00;
        }



        ///For Mraks 5 Field
        if (Nmarks5 == 100) {
            Ngpa5 = 4.0;
        } else if (Nmarks5 ==99) {
            Ngpa5 = 3.98;
        } else if (Nmarks5 ==98) {
            Ngpa5 = 3.96;
        } else if (Nmarks5 ==97) {
            Ngpa5 = 3.97;
        } else if (Nmarks5 ==96) {
            Ngpa5 = 3.91;
        } else if (Nmarks5 ==95) {
            Ngpa5 = 3.89;
        } else if (Nmarks5 ==94) {
            Ngpa5 = 3.87;
        } else if (Nmarks5 ==93) {
            Ngpa5 = 3.85;
        } else if (Nmarks5 ==92) {
            Ngpa5 = 3.82;
        } else if (Nmarks5 ==91) {
            Ngpa5 = 3.80;
        } else if (Nmarks5 ==90) {
            Ngpa5 = 3.78;
        } else if (Nmarks5 ==89) {
            Ngpa5 = 3.76;
        } else if (Nmarks5 ==88) {
            Ngpa5 = 3.74;
        } else if (Nmarks5 ==87) {
            Ngpa5 = 3.71;
        } else if (Nmarks5 ==86) {
            Ngpa5 = 3.69;
        } else if (Nmarks5 ==85) {
            Ngpa5 = 3.37;
        } else if (Nmarks5 ==84) {
            Ngpa5 = 3.66;
        } else if (Nmarks5 ==83) {
            Ngpa5 = 3.58;
        } else if (Nmarks5 ==82) {
            Ngpa5 = 3.50;
        } else if (Nmarks5 ==81) {
            Ngpa5 = 3.48;
        } else if (Nmarks5 ==80) {
            Ngpa5 = 3.34;
        } else if (Nmarks5 ==79) {
            Ngpa5 = 3.33;
        } else if (Nmarks5 ==78) {
            Ngpa5 = 3.25;
        } else if (Nmarks5 ==77) {
            Ngpa5 = 3.17;
        } else if (Nmarks5 ==76) {
            Ngpa5 = 3.09;
        } else if (Nmarks5 ==75) {
            Ngpa5 = 3.01;
        } else if (Nmarks5 ==74) {
            Ngpa5 = 3.00;
        } else if (Nmarks5 ==73) {
            Ngpa5 = 2.89;
        } else if (Nmarks5 ==72) {
            Ngpa5 = 2.78;
        } else if (Nmarks5 ==71) {
            Ngpa5 = 2.67;
        } else if (Nmarks5 ==70) {
            Ngpa5 = 2.66;
        } else if (Nmarks5 ==69) {
            Ngpa5 = 2.50;
        } else if (Nmarks5 ==68) {
            Ngpa5 = 2.34;
        } else if (Nmarks5 ==67) {
            Ngpa5 = 2.33;
        } else if (Nmarks5 ==66) {
            Ngpa5 = 2.22;
        } else if (Nmarks5 ==65) {
            Ngpa5 = 2.12;
        }else if (Nmarks5 ==64) {
            Ngpa5 = 2.01;
        }else if (Nmarks5 ==63) {
            Ngpa5 = 2.00;
        }else if (Nmarks5 ==62) {
            Ngpa5 = 1.84;
        }else if (Nmarks5 ==61) {
            Ngpa5 = 1.67;
        }else if (Nmarks5 ==60) {
            Ngpa5 = 1.66;
        }else if (Nmarks5 ==59) {
            Ngpa5 = 1.49;
        }else if (Nmarks5 ==58) {
            Ngpa5 = 1.31;
        }else if (Nmarks5 ==57) {
            Ngpa5 = 1.30;
        }else if (Nmarks5 ==56) {
            Ngpa5 = 1.20;
        }else if (Nmarks5 ==55) {
            Ngpa5 = 1.12;
        }else if (Nmarks5 ==54) {
            Ngpa5 = 1.01;
        }else if (Nmarks5 ==53) {
            Ngpa5 = 1.00;
        }else if (Nmarks5 ==52) {
            Ngpa5 = 0.70;
        }else if (Nmarks5 ==51) {
            Ngpa5 = 0.40;
        }else if (Nmarks5 ==50) {
            Ngpa5 = 0.10;
        } else if (Nmarks5 <=49 )
        {
            Ngpa5 = 0.00;
        }



        ///For Mraks 6 Field
        if (Nmarks6 == 100) {
            Ngpa6 = 4.0;
        } else if (Nmarks6 ==99) {
            Ngpa6 = 3.98;
        } else if (Nmarks6 ==98) {
            Ngpa6 = 3.96;
        } else if (Nmarks6 ==97) {
            Ngpa6 = 3.97;
        } else if (Nmarks6 ==96) {
            Ngpa6 = 3.91;
        } else if (Nmarks6 ==95) {
            Ngpa6 = 3.89;
        } else if (Nmarks6 ==94) {
            Ngpa6 = 3.87;
        } else if (Nmarks6 ==93) {
            Ngpa6 = 3.85;
        } else if (Nmarks6 ==92) {
            Ngpa6 = 3.82;
        } else if (Nmarks6 ==91) {
            Ngpa6 = 3.80;
        } else if (Nmarks6 ==90) {
            Ngpa6 = 3.78;
        } else if (Nmarks6 ==89) {
            Ngpa6 = 3.76;
        } else if (Nmarks6 ==88) {
            Ngpa6 = 3.74;
        } else if (Nmarks6 ==87) {
            Ngpa6 = 3.71;
        } else if (Nmarks6 ==86) {
            Ngpa6 = 3.69;
        } else if (Nmarks6 ==85) {
            Ngpa6 = 3.37;
        } else if (Nmarks6 ==84) {
            Ngpa6 = 3.66;
        } else if (Nmarks6 ==83) {
            Ngpa6 = 3.58;
        } else if (Nmarks6 ==82) {
            Ngpa6 = 3.50;
        } else if (Nmarks6 ==81) {
            Ngpa6 = 3.48;
        } else if (Nmarks6 ==80) {
            Ngpa6 = 3.34;
        } else if (Nmarks6 ==79) {
            Ngpa6 = 3.33;
        } else if (Nmarks6 ==78) {
            Ngpa6 = 3.25;
        } else if (Nmarks6 ==77) {
            Ngpa6 = 3.17;
        } else if (Nmarks6 ==76) {
            Ngpa6 = 3.09;
        } else if (Nmarks6 ==75) {
            Ngpa6 = 3.01;
        } else if (Nmarks6 ==74) {
            Ngpa6 = 3.00;
        } else if (Nmarks6 ==73) {
            Ngpa6 = 2.89;
        } else if (Nmarks6 ==72) {
            Ngpa6 = 2.78;
        } else if (Nmarks6 ==71) {
            Ngpa6 = 2.67;
        } else if (Nmarks6 ==70) {
            Ngpa6 = 2.66;
        } else if (Nmarks6 ==69) {
            Ngpa6 = 2.50;
        } else if (Nmarks6 ==68) {
            Ngpa6 = 2.34;
        } else if (Nmarks6 ==67) {
            Ngpa6 = 2.33;
        } else if (Nmarks6 ==66) {
            Ngpa6 = 2.22;
        } else if (Nmarks6 ==65) {
            Ngpa6 = 2.12;
        }else if (Nmarks6 ==64) {
            Ngpa6 = 2.01;
        }else if (Nmarks6 ==63) {
            Ngpa6 = 2.00;
        }else if (Nmarks6 ==62) {
            Ngpa6 = 1.84;
        }else if (Nmarks6 ==61) {
            Ngpa6 = 1.67;
        }else if (Nmarks6 ==60) {
            Ngpa6 = 1.66;
        }else if (Nmarks6 ==59) {
            Ngpa6 = 1.49;
        }else if (Nmarks6 ==58) {
            Ngpa6 = 1.31;
        }else if (Nmarks6 ==57) {
            Ngpa6 = 1.30;
        }else if (Nmarks6 ==56) {
            Ngpa6 = 1.20;
        }else if (Nmarks6 ==55) {
            Ngpa6 = 1.12;
        }else if (Nmarks6 ==54) {
            Ngpa6 = 1.01;
        }else if (Nmarks6 ==53) {
            Ngpa6 = 1.00;
        }else if (Nmarks6 ==52) {
            Ngpa6 = 0.70;
        }else if (Nmarks6 ==51) {
            Ngpa6 = 0.40;
        }else if (Nmarks6 ==50) {
            Ngpa6 = 0.10;
        } else if (Nmarks6 <=49 )
        {
            Ngpa6 = 0.00;
        }

        return (Ngpa1*Ncredits1+Ngpa2*Ncredits2+Ngpa3*Ncredits3+Ngpa4*Ncredits4+Ngpa5*Ncredits5+Ngpa6*Ncredits6)/(Ncredits1+Ncredits2+Ncredits3+Ncredits4+Ncredits5+Ncredits6);

    }

}