def listaPalavras = ["123","groovy","java","php","python","javascript"]

// a)
    println listaPalavras[-2]
    println listaPalavras[-3]
    
       println "*" * 10     
// b)
    println listaPalavras*.length()
    
       println "*" * 10     
// c)    
     listaPalavras.each{ listaPalavra ->
        println listaPalavra.isNumber()}
        
// d)
// inserindo numa nova lista os valores do each
//    def novaLista = []    
    
//    listaPalavras.each{ listaNormal ->
//      novaLista.add(listaNormal.replaceAll("a","ow"))
//      }
        
//        println novaLista
        
    
// pegando a posição e substituindo na lista de acordo com a posição   (muda a lista original) 
//    listaPalavras.eachWithIndex{ listaNormal, i ->
        // "${i + 1}° ${listaNormal.replaceAll('a','ow')}"
//        println listaPalavras[i] = listaNormal.replaceAll("a", "ow")
//      }

// essa é a forma mais legal, pois gera uma nova lista e subtitui os valores
   println "*" * 10     
   println listaPalavras.collect{ 
         it.replaceAll("a","ow")
      }
   println listaPalavras     


   