// Strings
def firstName = 'John'
def lastName = 'Doe'
def a = 3
def b = 7
    
    println "${lastName}, ${firstName}" // ele interpreta a string assim, com aspas duplas (Doe, John)
    println "a + b = ${a + b}"
    println '${lastName}, ${firstName}' // ele imprime exatamente o que esta, sem interpretar, com aspas simples (${lastName}, ${firstName})
    println 'a + b = ${a + b}'
    
println "-" * 15

// Lists
def myList = [10, "John", new Integer(5), new Double(7.6d)]

println myList

println "-" * 15

def alist = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    println alist.findAll{it % 2 == 0}
    
println "-" * 15

def blist = [1, 2, 3, 4, 5]
    println blist.collect{it * 10} // cria uma nova lista e faz a multiplicação, sem mexer na lista original

println "-" * 15

def clist = ["Apple", "Basketball", "Championship"]
    println clist*.length() // criando uma nova lista e contando o tamanho de cada caracter da lista

println "-" * 15
  
// Maps é tipo uma lista, mas usa um parametro a mais como chave
def emptyMap = [ : ]
def mapWithValues = [fruit:'Apple', veggie:'Carrot']

def dlist = [fruit:'Apple', 'veggie':'Carrot']
    dlist ['car'] = 'Sedan'
    dlist.put('book', 'Novels')
    dlist << [pet:'Dog'] // acrescentando o valor na lista
    println dlist['fruit']
    println dlist.'veggie'
    println dlist.get('car')
    println dlist.get('book')
    println dlist.get('pet')
    
println "-" * 15

// Loops
    5.times {
        println "Hello"
    }
    
println "-" * 15

['cat', 'dog', 'hamster'].each { name ->
        println name
    }

println "-" * 15

(6..10).each { number ->
        println number
    }

println "-" * 15

[fruit:'Apple', veggie:'Carrot', car: 'Sedan'].each { key, value ->
        println "${key} = ${value}"
    }