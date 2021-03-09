/*function decorate(){
	alert("Hello World");
}*/

/*function decorates(){
	document.getElementById("sent").style.fontSize = "24px";
	
}*/

/*function blinky(){
	alert("hi");
}*/

function blinky1(){
	
	if(check.checked==1){
		document.getElementById("sent").style.fontWeight="bold";
		document.getElementById("sent").style.color="green";
		document.getElementById("sent").style.textDecoration="underline";
		document.body.style.backgroundImage="url('images/grey.png')";
	}
	else{
		document.getElementById("sent").style.fontWeight="normal";
		document.getElementById("sent").style.color="black";
		document.getElementById("sent").style.textDecoration="none";
		document.body.style.backgroundImage="none";
	}
}

function deco(){
	var el = document.getElementById("sent");
var style = window.getComputedStyle(el, null).getPropertyValue("font-size");
var fontSize = parseFloat(style); 
el.style.fontSize = (fontSize + 2) + "pt";
}

function decor(){
	setTimeout(deco,500);
}