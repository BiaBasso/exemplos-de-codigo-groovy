// Manipulação de Array
// Declarando um Array

def testArray = new String[3]
    testArray[0] = "A"
    testArray[1] = "B"
    testArray[2] = "C"

// Ou
String [] testArray1 = ["A", "B", "C"]

// Ou
def testArray2 = ["A", "B", "C"] as String[]

// Ou
def testArray3 = (String[]) ["A", "B", "C"]

// Ou 
def testArray4 = ["A", "B", "C"].toArray()

// Ou
def testArray5 = ["A", "B", "C"].toArray(new String[0])

// Array size
println testArray.length

println "-" * 15

println testArray.size()

println "-" * 15

// Array Access Element (os elementos podem ser pegos pelo [index] ou usando o getAt(index)

println testArray[0] // pelo [index]

println testArray.getAt(0) // pelo getAt(index)

println "-" * 15

println testArray[-1] // Pode usar numeros negativos como index

println testArray.getAt(-1) // Pode usar numeros negativos como index

println "-" * 15

// Pegando o valor minimo

Integer[] intArray = [200, 300, 100]
println intArray.min() 
       
String[] stringArray = ["A", "B", "C"]        
println stringArray.min()

println "-" * 15

// Pegando o valor máximo

Integer[] intArray1 = [200, 300, 100]
println intArray.max() 
       
String[] stringArray1 = ["A", "B", "C"]        
println stringArray.max()

println "-" * 15

// Array sort (deixa na ordem crescente)

Integer[] intArray2 = [200, 300, 100]
println intArray2

intArray2.sort()                
println intArray2

println "-" * 15
// Array reverse (deixa em ordem decrescente)

String[] stringArray2 = ["A", "B", "C"]
String[] reverseArray = stringArray2.reverse()

println stringArray2
println reverseArray

















