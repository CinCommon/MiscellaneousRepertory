package com.yinzifan.phonesafe.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * ͨ�^SharedPreferences���攵����XML�ļ���
 * 
 * @author Cin
 *
 */
public class CacheUtil {
	public static final String CONFIG_SP = "config_sp";// �ļ���������Ƿ��һ�ε�ꑵ���Ϣ,���λ��:/data/data/packageName/shared_prefes
	public static final String IS_FIRST_USE = "is_first_use";// �Ƿ��һ��ʹ��
	public static final String APK_UPDATE = "apk_update";// �Ƿ��x���ԄӸ�����ʾ��
	public static final String SIM = "sim";// SIM����̖�Ĵ惦
	public static final String PROTECT_SETTING = "protect_setting";// �Ƿ�������֙C���I���O��
	public static final String SAVE_PASSWORD = "save_password";// �����֙C���I���ܴa
	public static final String SAFE_NUM = "safe_num";// ���֙C̖�a���
	public static final String PROTECT_START = "protect_start";// �Ƿ��_�����֙C���I����
	public static final String TOAST_STYLE="toast_style";
	private static SharedPreferences mSharedPreferences;

	private static SharedPreferences getPreferences(Context context) {
		if (mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CONFIG_SP, Context.MODE_PRIVATE);
		}
		return mSharedPreferences;
	}

	// ����boolean����
	public static void putBoolean(Context context, String key, boolean value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putBoolean(key, value).commit();
	}

	// ȡboolean������ȱʡֵ
	public static boolean getBoolean(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getBoolean(key, false);
	}

	// ȡboolean����,Ĭ�J����false
	public static boolean getBoolean(Context context, String key, boolean defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getBoolean(key, defvalue);
	}

	// ����String����
	public static void putString(Context context, String key, String value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putString(key, value).commit();
	}

	// ȡString������ȱʡֵ
	public static String getString(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getString(key, null);
	}

	// ȡString������ȱʡֵ
	public static String getString(Context context, String key, String defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getString(key, defvalue);
	}

	// ����int����
	public static void putInt(Context context, String key, int value) {
		SharedPreferences sp = getPreferences(context);
		sp.edit().putInt(key, value).commit();
	}

	// ȡint������ȱʡֵ
	public static int getInt(Context context, String key) {
		SharedPreferences sp = getPreferences(context);
		return sp.getInt(key, 0);
	}

	// ȡint������ȱʡֵ
	public static int getInt(Context context, String key, int defvalue) {
		SharedPreferences sp = getPreferences(context);
		return sp.getInt(key, defvalue);
	}

}
