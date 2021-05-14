function validaLogin(){
    let userTxt = localStorage.getItem("userLogged")

    if(!userTxt){
        window.location = "index.html"
    }
    let userJson = JSON.parse(userTxt)
    document.getElementById("user").innerHTML = `${userJson.nome} <b>( ${userJson.email} )</b>`
}

function logout(){
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function retrieveUsers(){

    fetch("http://localhost:8080/user/all").then(
        res => tratarJson(res)
    )
}

function tratarJson(retorno){
    if (retorno.status == 200){
        //document.getElementById("tabela").innerHTML = "Usuários Encontrados"
        retorno.json().then(res => exibirUsuarios(res))
        
    } 
    else{
        document.getElementById("tabela").innerHTML = "Nenhum usuário encontrado."
    }
}

function exibirUsuarios(listaUsuarios){
    let table = `<table>
    <tr>
    <td>Nome</td>
    <td>email</td>
    <td>CPF</td>
    </tr>`
   listaUsuarios.forEach(user => {
        table = table + `<tr>
        <td>${user.nome}</td>
        <td>${user.email}</td>
        <td>${user.cpf}</td>
        </tr>`
    });
    table = table + "</table>"
    document.getElementById("tabela").innerHTML = table
    createSelect(listaUsuarios)
}

function createSelect(listaUsuarios){
    var i = 0;
    if (document.getElementsByTagName("select").length == 0){
        document.getElementById("select").appendChild(document.createElement("select"))
        listaUsuarios.forEach(user => {
            document.getElementsByTagName("select")[0].appendChild(document.createElement("option"))  
            document.getElementsByTagName("option")[i].text = `${user.nome}`   
            i++;
        });
    }   
}
