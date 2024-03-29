
package com.slientupdate;

import android.util.Log;

import com.dlc.silentupdatelibrary.SilentUpdateUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNSilentUpdateModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSilentUpdateModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSilentUpdate";
  }

@ReactMethod
  public  void updateAPK(String uri){
  Log.d("TAG", "App uri: "+uri);

//  SilentUpdateUtil.getInstance().downloadAndInstall(uri);
  SilentUpdateManager.getInstance().updateApk(uri);
  }

}