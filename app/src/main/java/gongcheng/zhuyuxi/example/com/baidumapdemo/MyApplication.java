package gongcheng.zhuyuxi.example.com.baidumapdemo;

/**
 * Created by lenovo on 2017/5/16.
 */

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * 初始化sdk
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}