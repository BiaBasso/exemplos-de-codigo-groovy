def lista = [1,6,5,4,3,4,7,8]

// a)
    println lista.size()
    
            println "*" * 10
// b)
    println lista.findAll{it % 2 == 0}.size()
    
            println "*" * 10
// c)
    println lista.sort{it}   
    
        println "*" * 10     
// d)
   // soma separada dos números
   def listas = [1,6,5,4,3,4,7,8]
       listas.each{ lista1 ->
           println lista1 + lista1}
           
                   println "*" * 10
           
    // ou todos
    println lista.sum()
    
         println "*" * 10
// e)    
    def lista3 = lista.findAll{it > 3}
        println lista3
        
        println "*" * 10
// f)    
    println lista.contains(8)