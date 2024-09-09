package com.example.myvisitingcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String EMAIL_ADDRESS = "nasrin.stu2018@juniv.edu"; // Replace with your email address
    private static final String MOBILE_NUMBER = "01979520460"; // Replace with your mobile number
    private static final String WHATSAPP_NUMBER = "01979520460"; // Replace with your WhatsApp number
    private static final String DISCORD = "NASRIN_2211"; // Replace with your Discord username
    private static final String GITHUB_PROFILE = "https://github.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView emailLogo = findViewById(R.id.email_logo);
        ImageView mobileLogo = findViewById(R.id.mobile_logo);
        ImageView whatsappLogo = findViewById(R.id.whatsapp_logo);
        ImageView discordLogo = findViewById(R.id.discord_logo);
        ImageView githubLogo = findViewById(R.id.github_logo);

        emailLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + EMAIL_ADDRESS));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        mobileLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + MOBILE_NUMBER));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        whatsappLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                if (intent != null) {
                    startActivity(intent);
                } else {
                    // Open WhatsApp's Play Store page if not installed
                    Intent playStoreIntent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=com.whatsapp"));
                    startActivity(playStoreIntent);
                }
            }
        });

        discordLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.discord");
                if (intent != null) {
                    startActivity(intent);
                } else {
                    // Open Discord's Play Store page if not installed
                    Intent playStoreIntent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=com.discord"));
                    startActivity(playStoreIntent);
                }
            }
        });

        githubLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(GITHUB_PROFILE));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}











//package com.example.myvisitingcard;
//
//import android.os.Bundle;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//    private static final String EMAIL_ADDRESS = "nasrin.stu2018@juniv.edu"; // Replace with your email address
//    private static final String MOBILE_NUMBER = "01979520460"; // Replace with your mobile number
//    private static final String WHATSAPP_NUMBER = "01979520460";
//    private static final String DISCORD = "NASRIN_2211";
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
////            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
////            return insets;
////        });
//
//        ImageView emailLogo = findViewById(R.id.email_logo);
//        ImageView mobileLogo = findViewById(R.id.mobile_logo);
//        ImageView whatsappLogo = findViewById(R.id.whatsapp_logo);
//        ImageView discordLogo = findViewById(R.id.discord_logo);
//
//        emailLogo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/html");
//                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{EMAIL_ADDRESS});
//                startActivity(Intent.createChooser(intent, "Send Email"));
//            }
//        });
//
//        mobileLogo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:" + MOBILE_NUMBER));
//                startActivity(intent);
//            }
//        });
//    }
//}