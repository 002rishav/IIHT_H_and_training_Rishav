var z=0;
function mouseover() {
    document.getElementById("demo3").innerHTML = "Mouse Over";
    setTimeout(() => {
        document.getElementById("demo3").innerHTML = "";
    }, 500);
    
}