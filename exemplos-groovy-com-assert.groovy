//Exemplos Groovy com assert

// são formas de comprar uma string com o valor do igual, então, se você comprar a com 10, será true, porque a é 10
def (a, b, c) = [10, 20, 'foo']
assert a == 10 && b == 20 && c == 'foo'

def (int i, String j) = [10, 'foo']
assert i == 10 && j == 'foo'


def nums = [1, 3, 5]
def d, e, f
(d, e, f) = nums
assert d == 1 && e == 3 && f == 5

// Pode se dizer que ambas as linhas, são as mesmas
def map = [:]

map."an identifier with a space and double quotes" = "ALLOWED" 
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

// Quando se usa interpolação, ela vem por ultimo na string
def firstname = "Homer"
map."Simson-${firstname}" = "Homer Simson"

assert map.'Simson-Homer' == "Homer Simson"

// Da para usar interpolação dessa forma também, pegando o nome do metodo e seus atributos e usando na interpolação
//Desta forma abaixo, ele só aceita ponto final, não aceita parentese, colchetes, chaves, etc
def person = [name: 'Guillaume', age: 36]
assert "$person.name is $person.age years old" == 'Guillaume is 36 years old'


// Usando três aspas duplas, segue o mesmo processo de usar apenas aspas duplas, a diferença, que com três se torna multi linhas
def name = 'Groovy'
def template = """
    Dear Mr ${name},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
"""

assert template.toString().contains('Groovy')

//multiplas linhas apenas usando as barras, ao inveś de três aspas duplas
def multilineSlashy = /one
    two
    three/

assert multilineSlashy.contains('\n')

// As barras também podem ser usadas com interpolação
def color = 'blue'
def interpolatedSlashy = /a ${color} car/

assert interpolatedSlashy == 'a blue car'

// Pegando um elemento de uma lista e usando o assert, para ver se foi verdade
def list = [5, 6, 7, 8]
assert list.get(2) == 7
assert list[2] == 7
assert list instanceof java.util.List

def emptyList = []
assert emptyList.size() == 0
emptyList.add(5)
assert emptyList.size() == 1

// Clonando listas e verificando com Assert
def listaA = [7, 8, 9, 7, 1, 0, 5]
def listaClonada = listaA.clone()
assert listaClonada == listaA

// Usando comparando multiplicações
assert [1, 2, 3]*.multiply(2) == [1, 2, 3].collect { it.multiply(2) }

// Exemplos de como organizar por ordem crescente de acordo com uma condição
def listas = ['abc', 'z', 'xyzuvw', 'Hello', '321']
assert listas.sort {
    it.size()
} == ['z', 'abc', '321', 'Hello', 'xyzuvw']

// O primeiro, compara as chaves e os valores usando o entrySet e o segundo, compra as chaves pelo keySet as Set
def maps = [1:'a', 2:'b', 3:'c']

def entries = maps.entrySet()
entries.each { entry ->
  assert entry.key in [1,2,3]
  assert entry.value in ['a','b','c']
}

def keys = maps.keySet()
assert keys == [1,2,3] as Set
