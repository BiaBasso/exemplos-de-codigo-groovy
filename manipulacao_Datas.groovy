def data = new Date()
    println data[Calendar.WEEK_OF_YEAR]
    
String dataFormatada = new Date().format("dd/MM/yyyy")
       println dataFormatada
    
String dataHoraFormatada = new Date().format("dd/MM/yyyy HH:mm:ss")
       println dataHoraFormatada 
       
println new Date().getDateString()

println new Date().getTimeString()

println new Date().getDateTimeString()

def data1 = Date.parse('dd/MM/yyyy', '31/12/1980')
def data2 = Date.parse('dd/MM/yyyy', '31/12/1970')
    if (data1 > data2){
        println "Data 1 é maior"
    } else if (data1 == data2){
        println "Datas iguais"
    } else {
        println "Data 2 é maior"
    }