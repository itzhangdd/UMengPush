package com.soybean.notify.umeng.android;

import com.soybean.notify.umeng.AndroidNotification;

public class AndroidListcast extends AndroidNotification {
    public AndroidListcast(String appkey, String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "listcast");
    }

    public void setDeviceToken(String token) throws Exception {
        setPredefinedKeyValue("device_tokens", token);
    }

    public void setMiPush(Boolean mipush) throws Exception {
        setPredefinedKeyValue("mipush", mipush.toString());
    }

    public void setMiActivity(String miActivity) throws Exception {
        setPredefinedKeyValue("mi_activity", miActivity);
    }
}
