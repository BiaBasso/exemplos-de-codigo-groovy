//Exemplos Groovy com assert

// Multiple assignment
def (a, b, c) = [10, 20, 'foo']
assert a == 10 && b == 20 && c == 'foo'

def (int i, String j) = [10, 'foo']
assert i == 10 && j == 'foo'


def nums = [1, 3, 5]
def d, e, f
(d, e, f) = nums
assert d == 1 && e == 3 && f == 5

def map = [:]

map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

def firstname = "Homer"
map."Simson-${firstname}" = "Homer Simson"

assert map.'Simson-Homer' == "Homer Simson"