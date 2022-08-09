package com.example.flicker_test;

import io.flutter.embedding.android.FlutterActivity;
import static io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent;

import android.annotation.SuppressLint;
import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;


public class MainActivity extends FlutterActivity {
    private static final String INTENT_EXTRA_BACKGROUND_MODE = "background_mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // making the screen transparent but due to this the flickering happens
        getIntent().putExtra(INTENT_EXTRA_BACKGROUND_MODE, transparent.toString());
        super.onCreate(savedInstanceState);
    }
}
