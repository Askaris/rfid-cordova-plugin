var rfid = {
	scanTag : function() {
		cordova.exec(
				function(winParam) {},
				function(error) {},
				'com.askaris.drops.rfid.Rfid',
				'scanRfidTag',
				[ {
					"test1" : "wibble",
					"test2" : "wobble"
				} ] );
	}
};