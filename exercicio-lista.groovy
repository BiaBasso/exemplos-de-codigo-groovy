//assert 1 == 2

def lista = [1, 5, 6, 9, 10, 100, 20, 13, 75]

assert [6, 9, 75] == lista.findAll{it % 3 == 0}

assert [11, 15, 16, 19, 20, 110, 30, 23, 85] == lista.collect{it + 10}

assert 239 == lista.sum()

def nomes = ['Adriano', 'Gustavo', 'Bianca', 'Christopher']

assert ['adriano', 'gustavo', 'bianca', 'christopher'] == nomes.collect{it.toLowerCase()}

assert ['ADRIANO', 'GUSTAVO', 'BIANCA', 'CHRISTOPHER'] == nomes.collect{it.toUpperCase()}

def nomesMinusculos = []    
    
    nomes.each{ 
        nomesMinusculos << it.toLowerCase()
    }

assert ['aDriano', 'gUstavo', 'bIanca', 'cHristopher'] == nomesMinusculos.collect{it.substring(0,1) + it.substring(1,2).toUpperCase() + it.substring(2, it.length())}

assert ['adrianO', 'gustavO', 'biancA', 'christopheR'] == nomesMinusculos.collect{it.substring(0, it.length()-1) + it.substring(it.length()-1, it.length()).toUpperCase()}

/*
    println lista.collect{it % 3 == 0}
    
println "-" * 20    

    println lista.collect{it + 10}
    
println "-" * 20    

    println lista.sum()
    
println "-" * 20

    println nomes*.toLowerCase()
    
    println nomes.collect{it.toLowerCase()} // Melhor usar esse meio
    
println "-" * 20    

    println nomes.collect{it.toUpperCase()}
    
println "-" * 20
    
def nomesMinusculos = []    
    
    nomes.each{ 
        nomesMinusculos << it.toLowerCase()
    }
        
def deixandoSegundoCaractereDaListaNomesMaiusculo = []

    nomesMinusculos.each{ 

    deixandoSegundoCaractereDaListaNomesMaiusculo << it.substring(0,1) + it.substring(1,2).toUpperCase() + it.substring(2, it.length())

    }
                
    println deixandoSegundoCaractereDaListaNomesMaiusculo
        
println "-" * 20

def deixandoUltimoCaractereDaListaNomesMaiusculo = []
   
    nomesMinusculos.each{
    
    deixandoUltimoCaractereDaListaNomesMaiusculo << it.substring(0, it.length()-1) + it.substring(it.length()-1, it.length()).toUpperCase()
    
    }
    
    println deixandoUltimoCaractereDaListaNomesMaiusculo
    
println "-" * 20 */