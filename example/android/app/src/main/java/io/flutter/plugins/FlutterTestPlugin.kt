package io.flutter.plugins

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

//class FlutterPlugin: MethodCallHandler {
//  companion object {
//    @JvmStatic
//    fun registerWith(registrar: Registrar) {
//      val channel = MethodChannel(registrar.messenger(), "flutter_plugin")
//      channel.setMethodCallHandler(FlutterPlugin())
//    }
//  }
//
//  override fun onMethodCall(call: MethodCall, result: Result) {
//    if (call.method == "getPlatformVersion") {
//      result.success("Android ${android.os.Build.VERSION.RELEASE}")
//    } else {
//      result.notImplemented()
//    }
//  }
//}

open class FlutterTestPlugin:MethodCallHandler{

  companion object {
    fun registerWith(register: Registrar) {
      val methodChannel = MethodChannel(register.messenger(), "flutter_plugin")
      methodChannel.setMethodCallHandler(FlutterTestPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall?, result: Result?) {
    if (call?.method.equals("getPlatformVersion")){
      result?.success("Android "+android.os.Build.VERSION.RELEASE)
    }else{
      result?.notImplemented()
    }
  }

}