def data = new Date()
    println data[Calendar.WEEK_OF_YEAR]

println "-" * 20
    
String dataFormatada = new Date().format("dd/MM/yyyy")
       println dataFormatada

println "-" * 20
    
String dataHoraFormatada = new Date().format("dd/MM/yyyy HH:mm:ss")
       println dataHoraFormatada 

println "-" * 20

def stringParaData = Date.parse('dd/MM/yyyy', '29/09/2016')

println stringParaData

println "-" * 20

// Data para String       
println new Date().getDateString()

println "-" * 20

println new Date().getTimeString()

println "-" * 20

println new Date().getDateTimeString()

println "-" * 20

def data1 = Date.parse('dd/MM/yyyy', '31/12/1980')
def data2 = Date.parse('dd/MM/yyyy', '31/12/1970')
    if (data1 > data2){
        println "Data 1 é maior"
    } else if (data1 == data2){
        println "Datas iguais"
    } else {
        println "Data 2 é maior"
    }