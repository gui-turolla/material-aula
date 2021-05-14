function fazerLogin(){
    let userTxt = document.getElementById("user").value;
    let senhaTxt = document.getElementById("password").value;
    let user = {
        email: userTxt,
        cpf: userTxt,
        senha: senhaTxt
    }
    let msg = {
        method: 'POST',
        body: JSON.stringify(user),
        headers: {
            'Content-type': 'application/json'
        }
    }
    fetch("http://localhost:8080/user/login", msg)
    .then(res => tratarRetorno(res))

    function tratarRetorno(retorno){
     if (retorno.status == 200){
        retorno.json().then( res => acessoPermitido(res))
     } else{
        document.getElementById("msgErro").innerHTML = "Falha ao realizar login."
     }  
    }
    
}

function acessoPermitido(user){
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "interna.html"
}