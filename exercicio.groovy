def lista = [1, 5, 6, 9, 10, 100, 20, 13, 75]

    println lista.collect{it % 3 == 0}
    
println "-" * 20    

    println lista.collect{it + 10}
    
println "-" * 20    

    println lista.sum()
    
println "-" * 20

def nomes = ['Adriano', 'Gustavo', 'Bianca', 'Christopher']

    println nomes*.toLowerCase()
    
    println nomes.collect{it.toLowerCase()} // Melhor usar esse meio
    
println "-" * 20    

    println nomes.collect{it.toLowerCase()}
    
println "-" * 20
    
def nomesMinusculos = []    
    
    nomes.each{ 
        nomesMinusculos << it.toLowerCase()
    }
        
def deixandoSegundoCaractereDeNomesMaiusculo = []

    nomesMinusculos.each{ 

    deixandoSegundoCaractereDeNomesMaiusculo << it.substring(0,1) + it.substring(1,2).toUpperCase() + it.substring(2, it.length())

    }
                
    println deixandoSegundoCaractereDeNomesMaiusculo
        
println "-" * 20

def deixandoUltimoCaractereDeNomesMaiusculo = []
   
    nomesMinusculos.each{
    
    deixandoUltimoCaractereDeNomesMaiusculo << it.substring(0, it.length()-1) + it.substring(it.length()-1, it.length()).toUpperCase()
    
    }
    
    println deixandoUltimoCaractereDeNomesMaiusculo
    
println "-" * 20 
