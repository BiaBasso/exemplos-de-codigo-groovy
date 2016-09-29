def sampleMap = [thickness:10, color:'Blue', weight:500, shape:'Circle', price:150]

assert 500 == sampleMap.get('weight')

assert 'Circle' == sampleMap.get('shape')

assert 10 == sampleMap.get('thickness')

assert 150 == sampleMap.get('price')

assert 'Blue' == [shape:'blue'].get('color', 'Blue')

assert 'Red' == [color:'Red', shape:'blue'].get('color', 'Blue')

assert ['Apple':5, 'Banana':6, 'Cat':3] == ['Apple', 'Banana', 'Cat'].collectEntries{ [(it):it.length()] }

assert [p1:100, p2:200, p3:300, p4:400] == [p1:100, p2:200] + [p3:300, p4:400]

def map4 = [p1:100, p2:200, p3:300, p4:400, p5:500]

assert [p4:400, p5:500] == map4.intersect([p4:400, p5:500, p6:600])

//assert [100, 200, 300, 400, 500] == map4.values()

//assert ['p1', 'p2', 'p3', 'p4', 'p5'] == map4.keySet()

//assert ['p1'] == [p1:100, p2:200, p3:300, p4:400, p5:500].min {it.key}

/* Map Tutorial

def personDetails = [firstName:'John', lastName:'Doe', age:25]
    println "First Name: ${personDetails.firstName}"
    println "Last Name: ${personDetails.lastName}"
    println "Age: ${personDetails.age}"
    
println "-" * 15

// Map Basic
// Declaration

def emptyMap = [:]

def sampleMap1 = [color:'Blue', shape:'Circle'] // as Chaves são Strings por Default, então, não é necessário as colocar entre aspas simples ou duplas, apenas os valores precisam disso

    println sampleMap1
    
def sampleMap2 = [99:new Long(99), (BigDecimal.valueOf(5)):new Double(5)] // podemos declar mapas dess forma também, não precisa ser tudo string

    println sampleMap2
    
println "-" * 15

// Add value

def sampleMapAdd = [:]
    sampleMapAdd.put('thickness', 10) // pode usar o put para adicionar, pois os mapas de Groovy são uma instancia de java.util.Map
    sampleMapAdd['color'] = 'Blue' // pode adicionar valores colocando a chave entre colchetes
    sampleMapAdd.weight = 500 // usando a notação bean
    sampleMapAdd.'shape' = 'Circle' // vale como a notação bean
    sampleMapAdd << [price:150] // adicionar valores através de outro(os) mapa(as)
    
    println sampleMapAdd
 
println "-" * 15

// Remove Values

def sampleMapRemove = [thickness:10, color:'Blue', weight:500, shape:'Circle', price:150]
    sampleMapRemove.remove('color')
    sampleMapRemove = sampleMapRemove - ['shape':'Circle']
    sampleMapRemove -= [weight:500]

    println sampleMapRemove

println "-" * 15

// Lookup (seria uma recuperação de dados)

def sampleMap = [thickness:10, color:'Blue', weight:500, shape:'Circle', price:150]
    println "The color is: ${sampleMap.get('color')}"
    println "The weight is: ${sampleMap['weight']}"
    println "The shape is: ${sampleMap.shape}"
    println "The thickness is: ${sampleMap.'thickness'}"

println "-" * 15

// Map Magic (Mapa Mágico)
// Default Value

assert 'Red' == [color:'Red', shape:'blue'].get('color', 'Blue') // Aqui ele tráz o primeiro valor Red, porque tem a chave color
assert 'Blue' == [shape:'blue'].get('color', 'Blue') // Aqui ele tráz o valor default Blue, porque color não é uma chava

// collectEntries

def wordList = ['Apple', 'Banana', 'Cat']
def wordCountMap = wordList.collectEntries{ [(it):it.length()] } // Pegou a lista e criou um mapa, colocando as palavras como chaves e quantidade de caracteres é o valor

    println wordList
    println wordCountMap

println "-" * 15

// Count (para contar quantos elementos no mapa satisfazem a condição)

def wordListSample = ['Apple', 'Banana', 'Cat']
def wordCountMapSample = wordList.collectEntries{ [(it):it.length()] }
def longWords = wordCountMapSample.count {key, value ->
    value >= 4
}
    println "${longWords}"
    
println "-" * 15

// Union (podemos combinar os elementos dos mapas)

def map1 = [p1:100, p2:200]
def map2 = [p3:300, p4:200]
def map3 = map1 + map2

    println "${map3}"

println "-" * 15

// Intersect (pega o intersecção/cruzamento de dois mapas)

def map4 = [p1:100, p2:200, p3:300, p4:400, p5:500]
def map5 = [p4:400, p5:500, p6:600, p7:700]
def map6 = map4.intersect(map5)
    
    println "${map6}"

println "-" * 15

// Abaixo uso o map4 criado aqui em cima, para não precisar repetir os valores
// Get keys as list (pega as chaves do mapa de lista)
    
    println "${map4.keySet()}"

println "-" * 15

// Get values as list (pega os valores do mapa de lista)
    
    println "${map4.values()}"

println "-" * 15

// Min (pega o valor mínimo)

    println "${map4.min {it.key}}"
    println "${map4.min {it.value}}"

println "-" * 15

// Max (pega o valor máximo)
    
    println "${map4.max {it.key}}"
    println "${map4.max {it.value}}"
*/