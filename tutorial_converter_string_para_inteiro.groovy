// Converter String para Integer
// Using toInteger()

def strNumber = "5500"
def intValue = strNumber.toInteger() // forma simples de converter

// Ou
def intValue1 = strNumber.isInteger() ? strNumber.toInteger() : null // para não haver exceptions

// Using as int

def intValue2 = strNumber as int // forma simples de converter

// Ou
def intValue3 = strNumber.isInteger() ? (strNumber as int) : null // para não haver exceptions

// Using Integer.parseInt()

def intValue4 = Integer.parseInt(strNumber)

// Using Integer.valueOf()

def intValue5 = Integer.valueOf(strNumber)

// Using toDouble() para numero decimal

def decimalValue = strNumber.toDouble()