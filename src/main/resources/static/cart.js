let ul = document.getElementById("Cart");
let compras = localStorage.getItem("Items") ? JSON.parse(localStorage.getItem("Items")): [];
let clear_button = document.getElementById("clear_button");

document.getElementById("add_button").style.display = "none";
function insert(){

    for(item = 0; item < compras.length; item++){
        let novo = document.createElement("li");
        novo.innerHTML = `
            <i class="fas fa-capsules"></i>
            <h1> ${compras[item].nome}</h1> 
            <h2>${compras[item].categoria}</h2>
            <a> R$ ${compras[item].preco} </a>
        `;

        ul.appendChild(novo);
    }
}

clear_button.onclick = function (){
    localStorage.removeItem("Items");

    while(ul.firstChild){
        ul.removeChild(ul.firstChild);
    }
};

insert();