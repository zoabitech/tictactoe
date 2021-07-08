package com.example.tictactoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secandabout);

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this, "home", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(about.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this, "message", Toast.LENGTH_SHORT).show();

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
        });
        ImageView imageView3 = findViewById(R.id.imageView4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this, "Share", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String body = "Download";
                String sub = "http://play.google.com";
                intent.putExtra(Intent.EXTRA_TEXT,body);
                intent.putExtra(Intent.EXTRA_TEXT,sub);
                startActivity(Intent.createChooser(intent,"share using"));
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    Toast.makeText(about.this, "home", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(about.this,MainActivity.class);
                    startActivity(intent);
                }
                if (item.getItemId() == R.id.nav_about) {
                    Toast.makeText(about.this, "About", Toast.LENGTH_SHORT).show();
                    DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if (item.getItemId() == R.id.nav_message) {
                    Toast.makeText(about.this, "message", Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(about.this, "Share", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String body = "Download";
                    String sub = "http://play.google.com";
                    intent.putExtra(Intent.EXTRA_TEXT,body);
                    intent.putExtra(Intent.EXTRA_TEXT,sub);
                    startActivity(Intent.createChooser(intent,"share using"));
                }

//                    Intent web = new Intent(Intent.ACTION_VIEW);
//                    web.setData(Uri.parse("https://www.youtube.com/"));
//
//                    if (web.resolveActivity(getPackageManager()) != null) {
//                        startActivity(web);
//                    }

                return true;
            }
        });

    }
}