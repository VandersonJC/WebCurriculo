//const name = document.getElementById("header-name");

function cadPessoa(elem) {
	let id = elem.id;
	if (id == "" || id == null) {
		window.location.href = "cad-pessoa.jsp?name=" + name;
	} else {
		window.location.href = "cad-pessoa.jsp?name=" + name + "&id=" + id;
	}
}

function delPessoa(elem) {
	let id = elem.id
	if (confirm("Deseja realmente excluir a pessoa selecionada?")) {
		window.location.href = "cad-pessoa.jsp?name=" + name + "&delPessoa=" + id;
	}
}