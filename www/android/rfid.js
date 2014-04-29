var rfidPlugin = {
	scanTag : function() {
		cordova.exec(
				function(winParam) {}, // success callback function
				function(error) {},
				'RfidPlugin',
				'scanRfidTag',
				[ {
					"test1" : "wibble",
					"test2" : "wobble"
				} ]);
	}
}