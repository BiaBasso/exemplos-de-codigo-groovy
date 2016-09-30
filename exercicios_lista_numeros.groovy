def lista = [1,6,5,4,3,4,7,8]
/*
// a)
    println lista.size()    
   
println "-" * 10
// b)
    println lista.findAll{it % 2 == 0}.size()
    
println "-" * 10
// c)
    println lista.sort{it}   
    
println "-" * 10     
// d)
   // soma separada dos números

       lista.each{ lista1 ->
           println lista1 + lista1}
           
println "-" * 10
           
    // ou todos
    println lista.sum()
    
println "-" * 10
// e)    
    def lista3 = lista.findAll{it > 3}
        println lista3
        
println "-" * 10
// f)    
    println lista.contains(8)
*/

// asserts das respostas acima
assert 8 == lista.size()

assert [6, 4, 4, 8].toString() == lista.findAll{it % 2 == 0}.toString()

assert lista.count {it % 2 == 0} == 4 // dá a quantidade de elementos que são multiplos por 2

assert lista.count(4) == 2 // Conta quantos elementos N tem na lista

assert lista.intersect([1, 4, 8, 10, 24]) == [1, 4, 8] // Verifica quais elementos repetidos há em ambas as listas

assert [1, 3, 4, 4, 5, 6, 7, 8] == lista.sort{it}

assert 38 == lista.sum()

assert [4, 4, 5, 6, 7, 8] == lista.findAll{it > 3}

assert true == lista.contains(8)

// Pegando o maior valor da lista
assert lista.max() == 8

// Pegando o menos valor da lista
assert lista.min() == 1

