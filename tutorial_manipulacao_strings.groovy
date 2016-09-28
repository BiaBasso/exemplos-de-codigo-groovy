// Strings basico:
def firstName = 'John'
def lastName = 'Doe'

println 'ABCDEF'.length() // imprime a quantidade de caracteres
println 'ABCDEF'.substring(1) // pega as letras da posição que você colocou
println 'ABCDEF'.indexOf('C') // retorna a posição do caracter
println 'ABCDEF'.replace('CD', 'XX') // pega um caracter e substituiu por outro
println 'ABCDEF'.toLowerCase() // deixa tudo minusculo (o oposto é toUpperCase())

println "-" * 15

println "Hello " + firstName + " and welcome" // concatenando strings

println "-" * 15

// Operações com Strings:
println 'ABC' - 'B' // removendo a letra B
println 'ABBC' - 'B' // removendo apenas 1 B
println 'ABBC' - 'BB' // removendo os 2 Bs
println 'ABC' * 2 // escrevendo duas vezes a mesma coisa
println 'ABC' * 3 // escrevendo três vezes a mesma coisa

println "-" * 15

// Escape com Strings: (Barra invertida é usada para escapar caracteres especiais)
println 'Hello\tWorld' // \t da um grande espaço
println 'Hi\\There' // imprimiu uma barra para separar
println 'Hi\'There' // imprimiu um apostrofe
println 'Hi\"There' // imprimiu as aspas

println "-" * 15

// Multiplas linhas com String:
def str1 = """#1 Hello
    This is a multi line
    String example
    """
    println str1
    
def str2 = '''#2
    This is
    Another multi line
    string sammple
    '''
    println str2
    
def str3 = '#3 This is\
    a sample with\
    backslash'
    println str3
    
def str4 = '\n#4 Another example\n\
    with backslash\n\
    and next line'
    println str4
    
println "-" * 15

// Padding com String: (Para deixar uma string com um comprimento em particular)
def str = 'ABC'.padLeft(5)
    println str
    println str.length()

    println 'ABC'.padLeft(5, '+') // acrescentando caracteres especiais, ao inves de apenas espaços em branco
    println 'ABC'.padLeft(10, '123')
    println 'ABC'.padLeft(8, '+')
    println 'ABC'.padRight(8, '+')
    println 'ABC'.center(8,'+')

println "-" * 15

// Tokenize com String: (transforma em uma lista a string, cada espaço entre as palavras, gera um elemento da lista, por default, espaços, tab e próxima linha geram vários elementos)
def list1 = 'i am john'.tokenize() // isso <-
def lista1 = ['i', 'am', 'john'] // é a mesma coisa que isso <-

    println list1
    println lista1

def a = 'i,am,john'.tokenize() // faz com que tudo seja apenas um unico elemento na tabela
def b = 'i,am-john'.tokenize(',-') // posso passar parametros, por exemplo isso faz com que as virgulas e hifens, se desmembrem e faça cada palavra ser um elemento

    println a
    println b

println "-" * 15

// Clouse com String:
//find retorna apenas um elemento que ele encontra com os requisitos passados
//findAll retorna, em uma lista, todos os elementos que ele encontra com os requisitos passados
println 'grails'.find{it > 'i'}
println 'grails'.findAll{it > 'i'}
println 'grails'.findAll{it >= 's'}

println "-" * 15
// every testa cada caracter e retorna true se todos estiverem correspondentes ao criterio, senão, ele retorna false (ambas as linhas, fazem a mesma coisa)
def c = 'abc'.every{it > 'b'}
def d = 'abc'[0] > 'b' && 'abc'[1] > 'b' && 'abc'[2] > 'b'
    println c
    println d

println "-" * 15
// any testa cada caracter e retorna true se algum estiver correspondente ao criterio, senão, ele retorna false (ambas as linhas, fazem a mesma coisa)
def e = 'abc'.any{it > 'b'}
def f = 'abc'[0] > 'b' || 'abc'[1] > 'b' || 'abc'[2] > 'b'
    println e
    println f
    
println "-" * 15
// collect constroi uma nova lista enquanto manipula os caracteres, sem alterar a lista original
println 'abc'.collect{ it }
println 'abc'.collect{ it + '.' }
println 'abc'.collect{ 'test-' + it }
println 'abc'.collect{ it * 3 }
