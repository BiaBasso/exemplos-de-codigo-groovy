def mapa = [1:"Nome",2:"Sexo",3:"Idade"]

def estados = ["SP":"São Paulo","RJ":"Rio de Janeiro","MG":"Minas Gerais"]

// percorrendo um mapa
estados.each{ sigla, nome ->
    sigla + " - " + nome
}

// pegando um Estado de três formas:
assert "São Paulo" == estados.get("SP")

assert "São Paulo" == estados["SP"]

assert "São Paulo" == estados.SP

// adicionando um elemento no mapa de duas formas
estados.putAt("ES","Espírito Santo")

estados += ["ES": "Espírito Santo"] // Para adicionar vários elementos, usa esse metodo

// removendo um elemento no mapa
estados.remove("SP")

//extraindo as chaves do mapa de duas formas
assert ["RJ", "MG", "ES"].toString() == estados.keySet().toString()

assert ["RJ", "MG", "ES"].toString() == estados.collect{it.key}.toString()

// Verificando se o valor existe ou não
assert true == estados.containsValue("Minas Gerais")

assert false == estados.containsKey("SP")

// Ordenando o Mapa na ordem crescente
assert ["ES":"Espírito Santo","MG":"Minas Gerais", "RJ":"Rio de Janeiro"] == estados.sort{it.value}

assert ["ES":"Espírito Santo","MG":"Minas Gerais", "RJ":"Rio de Janeiro"] == estados.sort{it.key}

// Exemplo usando first e unique em uma lista com sub-lista dentro
assert [[1,2,3,3,3,3,4]].first().unique() == [1, 2, 3, 4]
