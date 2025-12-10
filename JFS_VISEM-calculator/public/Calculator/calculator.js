function calc() {
 let num1 = parseFloat(document.getElementById("n1").value);
 let num2 = parseFloat(document.getElementById("n2").value);
 let choice = document.getElementById("op_choice").value;
 switch(choice) {
  case "Addition" : document.getElementById("result").value = (num1+num2); break;
  case "Subtraction" : document.getElementById("result").value = (num1-num2); break;
  case "Multiplication" : document.getElementById("result").value = (num1*num2); break;
  case "Division" : document.getElementById("result").value = (num1/num2).toFixed(2); break;
 }
}