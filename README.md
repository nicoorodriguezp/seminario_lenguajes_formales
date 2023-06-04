# SEMINARIO DE LENGUAJES FORMALES
## TRABAJO FINAL
1. [Requerimientos](#REQUERIMIENTOS)
2. [Instalación](#INSTALACIÓN)
3. [Ejecución](#EJECUCIÓN)
4. [Gramáticas](#GRAMÁTICAS)
5. [Screenshots](#SCREENSHOTS)

### REQUERIMIENTOS
Generar un compilador (parser) capaz de detectar el lenguaje y palabras del bloque de código adjunto, utilizando ANTLR4.

#### Se pide:

1. Generar la gramática necesaria para que se validen correctamente los siguientes requerimientos:
* Calculadora que permita ingresar 2 números y generar las operaciones básicas (suma, resta, multiplicación, división, porcentaje)
* Validación de que si se ingresa un divisor igual a 0 y la operación es una división que solicite ingresar nuevamente el dato.
* Validar la acción de visualización del resultado.
2. Detectar los tokens
3. Generar el árbol de derivación.
4. Eliminar ambigüedades (conflictos)
5. Realizar las pruebas de verificación con el documento que se proporciona a tales fines.
6. Exportar los elementos generados por la herramienta.

### INSTALACIÓN
#### Python 3.11
> pip install antlr4-tools

### EJECUCIÓN
#### Visualizar el árbol de derivación generado
> antlr4-parse Calculadora.g4 start -gui grammars/grammar.py
> 
> antlr4-parse Calculadora.g4 start -gui grammars/grammar01.py

#### Generar el código del Lexer y del Parser
##### Python
> antlr4 -Dlanguage=Python3 Calculadora.g4

##### Java
> antlr4 Calculadora.g4

### GRAMÁTICAS
#### grammar.py
Contiene la primera gramática que se puede analizar.

Se puede notar que el "match case" está estructurado de la siguiente forma: +, -, *, /, %.
Además el parámetro del case está entre ""(comillas dobles).

#### grammar01.py
En esta gramática similar, se puede observar algunos cambios.

Primero, el "match case" de este archivo está estructurado para que analice en este orden: *, /, %, +, -.
Segundo, el parámetro del "case" está entre ''(comillas simples)

### SCREENSHOTS

![Derivation_Tree_Grammar_00](https://github.com/nicoorodriguezp/seminario_lenguajes_formales/blob/main/screenshots/parse_tree.png)

![Derivation_Tree_Grammar_00](https://github.com/nicoorodriguezp/seminario_lenguajes_formales/blob/main/screenshots/parse_tree_00.png)

![Derivation_Tree_Grammar_01](https://github.com/nicoorodriguezp/seminario_lenguajes_formales/blob/main/screenshots/parse_tree_01.png)

![Tokens_Hierarchy](https://github.com/nicoorodriguezp/seminario_lenguajes_formales/blob/main/screenshots/tokens_hierarchy.png)
