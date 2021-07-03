function foo(v){
	if (v== ''){
		document.getElementById("countCites").innerHTML='';
		return 0;
	}
	let url='http://localhost:8080/json/fetch/cites/'+v;
	let Http = new XMLHttpRequest();
	//url='https://jsonplaceholder.typicode.com/posts';
	Http.open("GET", url);
	Http.send();
	Http.onload = (e) => {
  	document.getElementById("countCites").innerHTML=Http.responseText;
			}
}
 function autocomplete(searchEle) {
      var currentFocus;
      searchEle.addEventListener("input", function(e) {
         var fieldVal = this.value;
         foo(fieldVal);
      });
  }
   autocomplete(document.getElementById("searchField"));
