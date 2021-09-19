//const name = document.getElementById("header-name");

function cadPessoa(elem) {
	let id = elem.id;
	if (id == "" || id == null) {
		window.location.href = "cad-pessoa.jsp";
	} else {
		window.location.href = "cad-pessoa.jsp?id="+id;
	}
}

function delPessoa(elem) {
	let id = elem.id
	if (confirm("Deseja realmente excluir a pessoa selecionada?")) {
		window.location.href = "acaoPessoa?delPessoa=" + id;
	}
}

function limparCampos(){
	document.getElementById("nome_busca").value = "";
}

function buscaPessoa(){
	
	let busca = document.getElementById("nome_busca").value;
	
	if(busca === "" || busca === null){
		alert("Digite um nome para buscar");
	}else{
		//Fazer a BUSCA
	}
	
}