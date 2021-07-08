package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {


    ImageView bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    private String startGame = "X";
    int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, xcount = 0, ocount = 0, i = 0;
    private TextView scorex, scoreo;
    private Button reset;

//    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.nav_activity_main);
////---------------------main code-------------------------///////////////

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();

                    DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if (item.getItemId() == R.id.nav_about) {
                    Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,about.class);
                    startActivity(intent);
                }
                if (item.getItemId() == R.id.nav_message) {
                    Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();

                    Intent sendEmail = new Intent(Intent.ACTION_SEND);
                    sendEmail.setData(Uri.parse("mailto:"));
                    sendEmail.setType("message/rfc822");
                    sendEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{
                            "Rukaya.er@gmail.com"
                    });
                    sendEmail.putExtra(Intent.EXTRA_SUBJECT, "My App");
                    sendEmail.putExtra(Intent.EXTRA_TEXT, "Thank you for downloading my app");
                    startActivity(sendEmail);

                }
                if (item.getItemId() == R.id.nav_share) {
                    Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String body = "Download";
                    String sub = "http://play.google.com";
                    intent.putExtra(Intent.EXTRA_TEXT,body);
                    intent.putExtra(Intent.EXTRA_TEXT,sub);
                    startActivity(Intent.createChooser(intent,"share using"));
                }
                return true;
            }
        });

        bt1 = findViewById(R.id.buttonimage1);
        bt2 = findViewById(R.id.buttonimage2);
        bt3 = findViewById(R.id.buttonimage3);
        bt4 = findViewById(R.id.buttonimage4);
        bt5 = findViewById(R.id.buttonimage5);
        bt6 = findViewById(R.id.buttonimage6);
        bt7 = findViewById(R.id.buttonimage7);
        bt8 = findViewById(R.id.buttonimage8);
        bt9 = findViewById(R.id.buttonimage9);

        scorex = findViewById(R.id.scorex);
        scoreo = findViewById(R.id.scorey);

        reset = findViewById(R.id.restart);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                bt1.setImageDrawable(null);
                bt2.setImageDrawable(null);
                bt3.setImageDrawable(null);
                bt4.setImageDrawable(null);
                bt5.setImageDrawable(null);
                bt6.setImageDrawable(null);
                bt7.setImageDrawable(null);
                bt8.setImageDrawable(null);
                bt9.setImageDrawable(null);
//                for (int i = 0; i < bt.length; i++) {
//                    bt[i].setImageDrawable(null);
//                }
                xcount = 0;
                ocount = 0;
                resetValues();
                scorex.setText("Score x : " + String.valueOf(xcount));
                scoreo.setText("Score O : " + String.valueOf(ocount));
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt1.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                         bt1.setImageResource(R.drawable.clear);

                        b1 = 1;
                        i++;

                    } else {
                        bt1.setImageResource(R.drawable.circle);
                        b1 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt2.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt2.setImageResource(R.drawable.clear);
                        b2 = 1;
                        i++;
                    } else {
                        bt2.setImageResource(R.drawable.circle);
                        b2 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt3.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt3.setImageResource(R.drawable.clear);
                        b3 = 1;
                        i++;
                    } else {
                        bt3.setImageResource(R.drawable.circle);
                        b3 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt4.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt4.setImageResource(R.drawable.clear);
                        b4 = 1;
                        i++;
                    } else {
                        bt4.setImageResource(R.drawable.circle);
                        b4 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt5.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt5.setImageResource(R.drawable.clear);
                        b5 = 1;
                        i++;
                    } else {
                        bt5.setImageResource(R.drawable.circle);
                        b5 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt6.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt6.setImageResource(R.drawable.clear);
                        b6 = 1;
                        i++;
                    } else {
                        bt6.setImageResource(R.drawable.circle);
                        b6 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt7.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt7.setImageResource(R.drawable.clear);
                        b7 = 1;
                        i++;
                    } else {
                        bt7.setImageResource(R.drawable.circle);
                        b7 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt8.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt8.setImageResource(R.drawable.clear);
                        b8 = 1;
                        i++;
                    } else {
                        bt8.setImageResource(R.drawable.circle);
                        b8 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bt9.getDrawable() == null) {
                    if (startGame.equalsIgnoreCase("X")) {
                        bt9.setImageResource(R.drawable.clear);
                        b9 = 1;
                        i++;
                    } else {
                        bt9.setImageResource(R.drawable.circle);
                        b9 = 0;
                        i++;
                    }
                    choosePlayer();
                    winningGame();
                }
            }
        });
    }

    private void winningGame() {

        if (b1 == 1 && b2 == 1 && b3 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                     bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b4 == 1 && b5 == 1 && b6 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b7 == 1 && b8 == 1 && b9 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                     bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b1 == 1 && b4 == 1 && b7 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b2 == 1 && b5 == 1 && b8 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                     bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b3 == 1 && b6 == 1 && b9 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b1 == 1 && b5 == 1 && b9 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b3 == 1 && b5 == 1 && b7 == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xcount++;
            scorex.setText("Score x : " + String.valueOf(xcount));
        } else if (b1 == 0 && b2 == 0 && b3 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b4 == 0 && b5 == 0 && b6 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b7 == 0 && b8 == 0 && b9 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b1 == 0 && b4 == 0 && b7 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b2 == 0 && b5 == 0 && b8 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b3 == 0 && b6 == 0 && b9 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b1 == 0 && b5 == 0 && b9 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else if (b3 == 0 && b5 == 0 && b7 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            ocount++;
            scoreo.setText("Score O : " + String.valueOf(ocount));
        } else {
            if (i == 9) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No one wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        bt1.setImageDrawable(null);
                        bt2.setImageDrawable(null);
                        bt3.setImageDrawable(null);
                        bt4.setImageDrawable(null);
                        bt5.setImageDrawable(null);
                        bt6.setImageDrawable(null);
                        bt7.setImageDrawable(null);
                        bt8.setImageDrawable(null);
                        bt9.setImageDrawable(null);
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void choosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    private void resetValues() {

        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;
        i = 0;
    }

}