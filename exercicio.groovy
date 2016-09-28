def lista = [1, 5, 6, 9, 10, 100, 20, 13, 75]

    println lista*.findAll{it % 3 == 0}
    
println "-" * 20    

    println lista.collect{it + 10}
    
println "-" * 20    

    println lista.sum()
    
println "-" * 20

def nomes = ['Adriano', 'Gustavo', 'Bianca', 'Christopher']

    println nomes*.toLowerCase()
    
println "-" * 20    

    println nomes*.toUpperCase()
    
println "-" * 20
    
def novoNome = []    
    
    nomes.each{ nomeNormal ->
        novoNome.add(nomeNormal.toLowerCase())
    }
        
def segundoCaractereMaiusculo = []
    
    novoNome.each{ segCaractere ->
        segundoCaractereMaiusculo.add(segCaractere.replace(segCaractere.substring(1,2), segCaractere.substring(1,2).toUpperCase()))
    }
                
    println segundoCaractereMaiusculo
        
println "-" * 20

def nomesUltimaLetra = []
   
    novoNome.each{ ultimoCaractere ->
        nomesUltimaLetra.add(ultimoCaractere.replace(ultimoCaractere.substring(ultimoCaractere.length()-1, ultimoCaractere.length()), ultimoCaractere.substring(ultimoCaractere.length()-1,ultimoCaractere.length()).toUpperCase()))
    }
    
    println nomesUltimaLetra
    
println "-" * 20  
