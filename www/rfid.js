var rfidPlugin = {
	scanTag : function() {
		cordova.exec(
				function(winParam) {},
				function(error) {},
				'com.askaris.drops.rfid.RfidPlugin',
				'scanRfidTag',
				[ {
					"test1" : "wibble",
					"test2" : "wobble"
				} ] );
	}
}