package com.example.leonardoof.appinfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/**
 * Created by leofazanaro on 24/11/2017.
 * Version 1.0
 * This class gets information from the applications installed on device.
 */

public class GetAppInfo {

    private Context context;
    private String[] packages;

    public GetAppInfo(Context context,String[] packages) {

        this.context = context;
        this.packages = packages;
    }



    public String[] getVersionName(){

        String[] infos = new String[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packages[i], 0);
                infos[i] = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = null;
            }
        }

        return infos;
    }

    public int[] getVersionCode(){

        int[] infos = new int[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packages[i], 0);
                infos[i] = packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = 0;
            }
        }

        return infos;
    }

    public String[] geAppName(){

        String[] infos = new String[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packages[i], 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;

                infos[i] = (String) applicationInfo.loadLabel(context.getPackageManager());

            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = null;
            }
        }

        return infos;
    }

    public Drawable[] getAppIcon(){

        Drawable[] infos = new Drawable[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {



                infos[i] = this.context.getPackageManager().getApplicationIcon(packages[i]);

            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = null;
            }
        }

        return infos;
    }

    public Long[] getLastUpdateTime(){

        Long[] infos = new Long[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packages[i], 0);
                infos[i] = packageInfo.lastUpdateTime;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = null;
            }
        }

        return infos;
    }

    public Long[] getFirstInstallTime(){

        Long[] infos = new Long[packages.length];

        for (int i = 0; i < packages.length;i++) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(packages[i], 0);
                infos[i] = packageInfo.firstInstallTime;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                infos[i] = null;
            }
        }

        return infos;
    }
}
