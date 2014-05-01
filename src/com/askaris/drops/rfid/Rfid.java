package com.askaris.drops.rfid;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Rfid extends CordovaPlugin {

	public static final String ACTION_SCAN_RFID_TAG = "scanRfidTag";
	
	public Rfid() {
		super();
		System.out.println("RfidPlugin() constructor called");
	}
	
	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
	  super.initialize(cordova, webView);
	}
	
	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		try {
			if (ACTION_SCAN_RFID_TAG.equals(action)) {
				JSONObject arg_object = args.getJSONObject(0);
				System.err.println("IN THE RFID PLUGIN");
				return true;
			}
			callbackContext.error("Invalid action");
			return false;
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
	
	public void onResume(boolean multitasking) {
		System.out.println("RfidPlugin.onResume() called");
	}

	public void onPause(boolean multitasking) {
		System.out.println("RfidPlugin.onPause() called");
	}
}
