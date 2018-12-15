let compras = localStorage.getItem("Items") ? JSON.parse(localStorage.getItem("Items")): [];

let buy = document.getElementsByClassName("Item");


function find(){
    console.log("hello");
    for(item = 0; item < buy.length; item++){
        let novo = {
            nome:buy[item].children[0].innerText,
            categoria:buy[item].children[1].innerText,
            preco:buy[item].children[3].innerText
        };

        buy[item].children[4].onclick = function (){
            console.log("clique");
            compras.push(novo);
            localStorage.setItem("Items", JSON.stringify(compras));
        };
    }
}

find();