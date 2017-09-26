package com.yinzifan.phonesafe.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 通過SharedPreferences緩存數據到XML文件中
 * 
 * @author Cin
 *
 */
public class CacheUtil {
	public static final String CONFIG_SP = "config_sp";// 文件名，存放是否第一次登陸等信息,存放位置:/data/data/packageName/shared_prefes
	public static final String IS_FIRST_USE = "is_first_use";// 是否第一次使用
	public static final String APK_UPDATE = "apk_update";// 是否選中自動更新提示框
	public static final String SIM = "sim";// SIM卡串號的存儲
	public static final String PROTECT_SETTING = "protect_setting";// 是否完成了手機防盜的設置
	public static final String SAVE_PASSWORD = "save_password";// 保存手機防盜的密碼
	public static final String SAFE_NUM = "safe_num";// 報警手機號碼存放
	public static final String PROTECT_START = "protect_start";// 是否開啓了手機防盜功能
	public static final String TOAST_STYLE="toast_style";
	private static SharedPreferences mSharedPreferences;

	private static SharedPreferences getPreferences(Context context) {
		if (mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CONFIG_SP, Context.MODE_PRIVATE);
		}
		return mSharedPreferences;
	}

	// 保存boolean數據
	public static void putBoolean(Context context, String key, boolean value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putBoolean(key, value).commit();
	}

	// 取boolean數據，缺省值
	public static boolean getBoolean(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getBoolean(key, false);
	}

	// 取boolean數據,默認返回false
	public static boolean getBoolean(Context context, String key, boolean defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getBoolean(key, defvalue);
	}

	// 保存String數據
	public static void putString(Context context, String key, String value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putString(key, value).commit();
	}

	// 取String數據，缺省值
	public static String getString(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getString(key, null);
	}

	// 取String數據，缺省值
	public static String getString(Context context, String key, String defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getString(key, defvalue);
	}

	// 保存int數據
	public static void putInt(Context context, String key, int value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putInt(key, value).commit();
	}

	// 取int數據，缺省值
	public static int getInt(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getInt(key, 0);
	}

	// 取int數據，缺省值
	public static int getInt(Context context, String key, int defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getInt(key, defvalue);
	}

}
