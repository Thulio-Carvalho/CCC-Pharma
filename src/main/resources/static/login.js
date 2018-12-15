let login_button = document.getElementById("Login_button");
let register_button = document.getElementById("Register_button");
let add_button = document.getElementById("add_button");
let exit_button = document.getElementById("Exit_button");

let block = document.getElementById("Login");
let register = document.getElementById("Register_Form");
let addi = document.getElementById("Add_Form");
let login = document.getElementById("Login_Form");

login_button.onclick = function (){
    block.style.display = "block";
    register.style.display = "none";
    login.style.display = "block";
    addi.style.display = "none";
};

register_button.onclick = function (){
    block.style.display = "block";
    register.style.display = "block";
    login.style.display = "none";
    addi.style.display = "none";
};

add_button.onclick = function (){
    block.style.display = "block";
    register.style.display = "none";
    login.style.display = "none";
    addi.style.display = "block";
};

exit_button.onclick = function (){
    block.style.display = "none";
    register.style.display = "none";
    login.style.display = "none";
    addi.style.display = "none";
};
