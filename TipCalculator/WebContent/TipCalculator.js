function calcTip() {
	var subtotalElem = document.getElementById('subtotal');
	var tipElem = document.getElementById('tip');
	var totalElem = document.getElementById('total');
	var total =(subtotalElem.value)*(tipElem.value/100) ;
	totalElem.innerHTML = '$' + total;
}