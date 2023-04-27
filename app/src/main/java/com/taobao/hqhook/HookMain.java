package com.taobao.hqhook;

import android.util.Log;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class HookMain implements IXposedHookLoadPackage {
    public static final String TAG = "BAIDU_HOOK";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

        Log.i(TAG, "packageName:" + lpparam.packageName);
        String nativeLibraryDir = lpparam.appInfo.nativeLibraryDir;
        ClassLoader classLoader = lpparam.classLoader;
        boolean isFirstApplication = lpparam.isFirstApplication;

        Log.i(TAG, "nativeLibraryDir: "+ nativeLibraryDir);
        Log.i(TAG, "classLoader: "+ classLoader);
        Log.i(TAG, "isFirstApplication: "+ isFirstApplication);


    }
}
