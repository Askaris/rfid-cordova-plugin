module.exports = {
	scanTag : function() {
		console.log('In plugin JS file.');
		cordova.exec(
				function(winParam) {console.log('Plugin Success.');},
				function(error) {console.log('Plugin Error.');},
				'Rfid',
				'scanRfidTag',
				[ {
					"test1" : "wibble",
					"test2" : "wobble"
				} ] );
	}
};