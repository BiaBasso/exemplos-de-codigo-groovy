String converter = "33"
    println converter.toInteger()
    
String texto = "o rato roeu a roupa do rei de Roma"
    println texto.split(" ")
    
String palavra = "JavaScript"
    println palavra.toLowerCase()
    println palavra.toUpperCase()

    
String palavra1 = "Televisão"
    println palavra1.contains("v") //verifica se existe a letra "v" na string
    println palavra1.indexOf("v") // captura a posição do caracter "v" na string
    
// Convertendo uma lista para String    
def stringList = ["A", "B", "C"]
String result = stringList.join(",")
    println result