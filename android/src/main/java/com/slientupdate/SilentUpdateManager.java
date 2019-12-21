package com.slientupdate;

import android.content.Intent;
import android.util.Log;

import com.dlc.silentupdatelibrary.SilentUpdateListener;
import com.dlc.silentupdatelibrary.SilentUpdateUtil;

public class SilentUpdateManager {

    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static SilentUpdateManager instance;
    private UpdateCallBack updateCallback;

    //构造器私有化
    private SilentUpdateManager(){}

    //方法同步，调用效率低
    public static synchronized SilentUpdateManager getInstance(){
        if(instance==null){
            instance=new SilentUpdateManager();
        }
        return instance;
    }

    //设置监听
    public void setUpdateCallback(UpdateCallBack updateCallback) {
        this.updateCallback = updateCallback;

    }

    public void updateApk(String uri) {
        if (this.updateCallback!= null){
            this.updateCallback.onUpdateAPKCallback(uri);
        }
    }




    }
