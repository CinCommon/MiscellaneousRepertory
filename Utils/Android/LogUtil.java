package com.yinzifan.phonesafe.utils;

import android.util.Log;

/**
 * 日志輸出工具類
 * 
 * @author Cin
 *
 */
public class LogUtil {
	private static boolean is_debug = true;
	public static void i(String tag, String msg) {
		if (is_debug) {
			Log.i(tag, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (is_debug) {
			Log.e(tag, msg);
		}
	}

	public static void v(String tag, String msg) {
		if (is_debug) {
			Log.v(tag, msg);
		}
	}

	public static void d(String tag, String msg) {
		if (is_debug) {
			Log.i(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (is_debug) {
			Log.w(tag, msg);
		}
	}
}
