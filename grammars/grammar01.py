def Calcular(x, y, op):
    match(op):
        case '*':
            return x * y
        case '/':
            if (y != 0):
                return x / y
            else:
                while(y == 0):
                    y = int( input( 'Ingrese un numero que no sea 0' ) )
                return x / y
        case '%':
            return x * ( y / 100 )
        case '+':
            return x + y
        case '-':
            return x - y
        case _:
            raise Exception('Operación inválida')