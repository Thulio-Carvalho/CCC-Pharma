let bt = document.getElementById("add_sub");
let mercado = document.getElementById("Mark");
let values = document.getElementById("Add_Form").elements;

bt.onclick = act;


function act(){
    let item = document.createElement("div");
    item.className = "Item";
    item.innerHTML = `
        <a class ="Nome">${values[0].value}</a> 
        <a class ="Categoria">${values[1].value}</a>
        <img src="imagens/itens/camisinha.jpg" class="Ilustracao">
        <a class= "Preco">por: R$ ${Number(values[3].value).toFixed(2)} </a>
        <button type="submit" class="btn"> <i class="fas fa-cart-plus"></i> </button>
    `;

    mercado.appendChild(item);
}

function getCat(){

    fetch('http://localhost:8000/Category.json').then(response => {
        return response.json();
    }).then(data => {
        let block = document.getElementById("side-bar");
        for(item = 0; item < data.length; item++){
            let jr = document.createElement("p");
            jr.className = "Category";
            jr.innerText = data[item].categoria;
            jr.style.borderLeftColor = data[item].cor;
            jr.style.setProperty("--actual", data[item].cor);
            block.appendChild(jr);
        }
    }).catch(err => {
        console.log("Deu merda");
    })
}

function getItems(){

    fetch('http://localhost:8000/Items.json').then(response => {
        return response.json();
    }).then(data => {
        let block = document.getElementById("Mark");
        for(item = 0; item < data.length; item++){
            let novo = document.createElement("div");
            novo.className = "Item";
            novo.innerHTML = `
                <a class ="Nome">${data[item].Nome}</a> 
                <a class ="Categoria">${data[item].Categoria}</a>
                <img src="Imagens/itens/camisinha.jpg" class="Ilustracao">
                <a class= "Preco">por: R$ ${Number(data[item].Preco).toFixed(2)} </a>
                <button type="submit" class="btn"> <i class="fas fa-cart-plus"></i> </button>
            `;
            
            let forma = {
                nome:data[item].Nome,
                categoria:data[item].Categoria,
                preco:Number(data[item].Preco).toFixed(2)
            };  
            
            novo.children[4].onclick = function (){
                console.log("clique");
                compras.push(forma);
                localStorage.setItem("Items", JSON.stringify(compras));
            };

            mercado.appendChild(novo);
        }
    }).catch(err => {
        console.log("Deu merda");
    })
}

getCat();
getItems();