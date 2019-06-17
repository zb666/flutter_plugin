package com.jetpack.flutter_plugin_example

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.app.FlutterPluginRegistry
import io.flutter.plugins.FlutterTestPlugin
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    FlutterTestPlugin.registerWith(this)
  }
}
