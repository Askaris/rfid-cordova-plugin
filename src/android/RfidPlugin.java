package android;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RfidPlugin extends CordovaPlugin {

	public static final String ACTION_SCAN_RFID_TAG = "scanRfidTag";

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
}