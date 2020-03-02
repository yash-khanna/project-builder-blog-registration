//get the add button value to 
let addBlog=document.getElementById("addBlog");

console.log(addBlog);

addBlog.onclick = () =>{
	console.log("onclick");
	document.getElementById('popup').style.display = "block";
} 

/*
//Function To Display Popup
function div_show() {
document.getElementById('abc').style.display = "block";
}*/
//Function to Hide Popup
function div_hide(){
document.getElementById('popup').style.display = "none";
}