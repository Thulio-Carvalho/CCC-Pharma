let login_button = document.getElementById("Login_button");
let register_button = document.getElementById("Register_button");
let add_button = document.getElementById("add_button");
let exit_button = document.getElementById("Exit_button");
let cart_button = document.getElementById("Cart_button");
let logout_button = document.getElementById("Logout_button");

let block = document.getElementById("Login");
let register = document.getElementById("Register_Form");
let addi = document.getElementById("Add_Form");
let login = document.getElementById("Login_Form");
let log_sub = document.getElementById("login_sub");

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

logout_button.onclick = function (){
    console.log("passando aqui");
    localStorage.setItem("Logged", "false");
    log();
};

exit_button.onclick = close;

login_sub.onclick = function (){
    let values = document.getElementById("Login_Form").elements;
    localStorage.setItem("User", values[0].value);
    localStorage.setItem("Logged", "true");
    log();
    close();
};

function close (){
    block.style.display = "none";
    register.style.display = "none";
    login.style.display = "none";
    addi.style.display = "none";
};

function log(){
    if(localStorage.getItem("Logged") === "true"){
        document.getElementById("welcome").style.display = "block";
        document.getElementById("welcome").innerText = "Welcome, " + localStorage.getItem("User");
        
        if(localStorage.getItem("User") === "admin"){
            add_button.style.display = "block";
        }else add_button.style.display = "none";
        
        cart_button.style.display = "block";
        logout_button.style.display = "block";

        login_button.style.display = "none";
        register_button.style.display = "none";
    }else{
        document.getElementById("welcome").style.display = "none";
        cart_button.style.display = "none";
        logout_button.style.display = "none";
        add_button.style.display = "none";

        login_button.style.display = "block";
        register_button.style.display = "block";
    }
}

log();