
function render_bar(){
    let hbar = document.getElementById("Home-Bar");
    hbar.innerHTML = `     
        <a href="index.html">CCCPharma</a>
        <a id="Login_button"><i class="fas fa-user"></i></a>
        <a id="Register_button"><i class="far fa-id-card"></i></a>
        <a id="Cart_button" href="cart.html"><i class="fas fa-shopping-basket"></i></a>
        <a id="Logout_button"><i class="fas fa-sign-out-alt"></i></a>
        <a id="welcome">welcome, caralho</a>
    `
}

function render_fb(){
    let blk = document.getElementById("Login");
    blk.innerHTML = `
        <div id="Block"> 
            <a id="Exit_button"><i class="fas fa-plus-circle"></i></a>
            <form id="Login_Form" class="Form">
                <a>Usuário</a> <br>
                <input type="text" placeholder ="Usuário"> <br>
                <a>Senha</a> <br>
                <input type="password" placeholder ="Senha"> <br>
                <input type="submit" placeholder ="Enviar" id="login_sub"> <br>
            </form>

            <form id="Register_Form" class="Form">
                <a>E-Mail</a> <br>
                <input type="email" placeholder ="login@algo.com"> <br>
                <a>Usuário</a> <br>
                <input type="text" placeholder ="Usuario"> <br>
                <a>Senha</a> <br>
                <input type="password" placeholder ="Senha"> <br>
                <a>Confirme sua senha</a> <br>
                <input type="password" placeholder ="senha"> <br>
                <input type="submit" placeholder ="Enviar"> <br>
            </form>

            <form id="Add_Form" class="Form">
                <a>Nome do Item</a> <br>
                <input type="text" placeholder ="Item"> <br>
                <a>Categoria</a> <br>
                <input type="text" placeholder ="Categoria"> <br>
                <a>Codigo de Barras</a> <br>
                <input type="text" placeholder ="Codigo de Barra"> <br>
                <a>Preço</a> <br>
                <input type="number" step="0.01" placeholder ="00.00"> <br>
                <a>Quantidade</a> <br>
                <input type="number" placeholder ="0"> <br>
                <input type="submit" placeholder ="Criar" id="add_sub"> <br>
            </form>
        </div>
    `
}
render_bar();
render_fb();
