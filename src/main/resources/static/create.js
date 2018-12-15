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
        <a class= "Preco">por: R$ ${values[3].value} </a>
        <button type="submit" class="btn"> <i class="fas fa-cart-plus"></i> </button>
    `;

    mercado.appendChild(item);
}

let Cats = {"Medicamento e Saude": "red",
            "Cuidados Pessoais e Beleza": "pink",
            "Dermocosmético": "purple",
            "Putaria":"blue",
            "45 de braço": "green"};

function getCat(){
    let block = document.getElementById("side-bar");
    for(let categoria in Cats){
        let jr = document.createElement("p");
        jr.className = "Category";
        jr.innerText = categoria;
        jr.style.borderLeftColor = Cats[categoria];
        block.appendChild(jr);
    }
}

getCat();