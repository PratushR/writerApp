package com.example.writerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        mTitleWindow.setText("INTRODUCTION TO ANDROID");
        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Android is a Linux based operating system it is designed primarily for touch screens mobile devices such as smartphones and tablet computers. The operating system has developed a lot in the last 15 years starting from black and white phones to recent smartphones or mini computers. One of the most widely used mobile OS   these days is android.  The android is software that was founded in Palo Alto of California in 2003Android development supports the full java programming language. Even other packages that are API and JSE are not supported. The first version 1.0 of the android development kit (SDK) was released in 2008 and the latest updated version is a jelly bean.Linux kernel:\n" +
                "The android uses the powerful Linux kernel and it supports a wide range of hardware drivers. The kernel is the heart of the operating system that manages input and output requests from the software. This provides basic system functionalities like process management, memory management, device management like camera, keypad, display etc the kernel handles all the things. Linux is really good at networking and it is not necessary to interface it to the peripheral hardware. The kernel itself does not interact directly with the user but rather interacts with the shell and other programs as well as with the hardware devices on the system.\n" +
                "\n" +
                "Libraries:\n" +
                "The on top of a Linux kennel there is a set of libraries including open-source web browsers such as WebKit, library libc. These libraries are used to play and record audio and video. The SQLite is a database that is useful for the storage and sharing of application data. The SSL libraries are responsible for internet security etc.Android Runtime:\n" +
                "The android runtime provides a key component called Dalvik Virtual Machine which is a kind of java virtual machine. It is specially designed and optimized for android. The Dalvik VM is the process virtual machine in the android operating system. It is a software that runs apps on android devices.\n" +
                "\n" +
                "The Dalvik VM makes use of Linux core features like memory management and multithreading which is in java language. The Dalvik VM enables every Android application to run its own process. The Dalvik VM  executes the files in the .dex format.Application framework:\n" +
                "The application framework layer provides many higher-level services to applications such as windows manager, view system, package manager, resource manager, etc. The application developers are allowed to make use of these services in their application.\n" +
                "\n" +
                "Applications and Features:\n" +
                "You will find all the android applications at the top layer and you will write your application and install it on this layer. Examples of such applications are contacts, books, browsers, services, etc. Each application performs a different role in the overall applications.\n" +
                "\n" +
                "Features:\n" +
                "\n" +
                "Headset layout\n" +
                "Storage\n" +
                "Connectivity: GSM/EDGE, IDEN, CDMA, Bluetooth, WI-FI, EDGE,3G,NFC, LTE,GPS.\n" +
                "Messaging: SMS, MMS, C2DM (could to device messaging), GCM (Google could messaging)\n" +
                "Multilanguage support\n" +
                "Multi-touch\n" +
                "Video calling\n" +
                "Screen capture\n" +
                "External storage\n" +
                "Streaming media support\n" +
                "Optimized graphics";
        stringBuilder.append(someMessage);
        mMessageWindow.setText(stringBuilder.toString());
    }
}