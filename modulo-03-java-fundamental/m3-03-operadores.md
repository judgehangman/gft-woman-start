[![DIO - Anotações](https://img.shields.io/badge/DIO-Anotações-e7c2ff?style=for-the-badge)](https://web.dio.me/course/variaveis-tipos-de-dados-e-operadores-matematicos-em-java/learning/d687771f-76cd-4379-9e1f-1c529c44e15b)

# Operadores

Operadores são símbolos especiais que são capazes de realizar ações específicas em um, dois, ou mais operandos e, em seguida, retornar um resultado.

| OPERADOR                     | FUNÇÃO                                          | SÍMBOLOS            |
| ---------------------------- | ----------------------------------------------- | ------------------- |
| Unário **`unary`**           | operação matemática em um operando              | `++` `--` `~` `!`   |
| Aritmético **`arithmetic`**  | operação matemática básica entre dois operandos | `+` `-` `/` `%` `*` |
| Relacional **`relational`**  | compara dois operandos                          | `<` `>` `<=` `=>`   |
| Bit-a-Bit **`bitwise`**      | operação a nível de bit                         | `& ` `^` `|` `~`    |
| Lógico **`logical`**         | operação lógica                                 | `&&` `||` `!`       |
| Ternário **`ternary`**       | operações condicionais                          | `?` `:`             |
| Atribuição* **`assignment`** | atribui valores a variáveis                     | `=`                 |

`* pode ser combinado com outros símbolos: += -= *= >>= &= etc`

## Operadores Unários

Exercem operações matemáticas em um único operando. Podem ser *pré-fixados* our *pós-fixados*.

| Operador | Operação                            | Pré ou Pós? |
| -------- | ----------------------------------- | ----------- |
| +        | representa um valor positivo        | Pré         |
| -        | representa um valor negativo        | Pré         |
| ++       | incrementa o valor da variável em 1 | Ambos       |
| --       | reduz o valor da variável em 1      | Ambos       |
| !        | inverte o valor da variável lógica  | Pré         |
| ~        | inverte of valor do bit             | Pré         |



## Operadores Aritméticos

Exercem operações matemáticas binárias.

| Operador | Operação                                          |
| -------- | ------------------------------------------------- |
| `+`      | Adição (também usado para concatenação de String) |
| `-`      | Subtração                                         |
| `*`      | Multiplicação                                     |
| `/`      | Divisão                                           |
| `%`      | Resto da Divisão                                  |



## Operadores Relacionais

Operadores relacionais são utilizados para comparar dois valores.

| Operador | Operação             |
| -------- | -------------------- |
| `>`      | Maior que            |
| `<`      | Menor que            |
| `>=`     | Maior ou igual a     |
| `<=`     | Menor ou igual a     |
| `==`     | Igual                |
| `!=`     | Não-igual, diferente |



## Operadores Bit-a-Bit

Operadores bit-a-bit fazem operações lógicas a nível de bits.

| Operador | Nome                                | Operação                                                     | Tipo    |
| -------- | ----------------------------------- | ------------------------------------------------------------ | ------- |
| `&`      | Conjunção bit-a-bit `AND`           | Retorna uma conjunção lógica bit-a-bit dos valores de um determinado input, ou seja, se ambos os bits forem 1, retorna 1, se não, retorna 0. | Binário |
| `|`      | Disjunção bit-a-bit`OR`             | Retorna uma disjunção lógica bit-a-bit dos valores de um determinado input, ou seja, se um dos bits correspondentes for 1, retorna 1, se não, retorna 0. | Binário |
| `^`      | Disjunção exclusiva bit-a-bit `XOR` | Retorna uma disjunção exclusiva bit-a-bit dos valores de um determinado input, ou seja, se os bits correspondentes forem diferentes, retorna 1, se não, retorna 0. | Binário |
| `~`      | Complemento                         | Retorna o complemento de um determinado input, ou seja, inverte o valor de cada bit, fazendo cada 1 se tornar 0 e cada 0 se tornar 1. | Unário  |



## Operadores Lógicos

Operadores lógicos fazem operações lógicas.

| Operador | Nome      | Operação                                                     |
| -------- | --------- | ------------------------------------------------------------ |
| `&&`     | Conjunção | Retorna uma conjunção lógica de determinadas condições, ou seja, se ambas condições forem verdadeiras, retorna verdadeiro, se não, retorna falso. |
| `||`     | Disjunção | Retorna uma disjunção lógica de determinadas condições, ou seja, se qualquer uma das condições forem verdadeiras, retorna verdadeiro, se não, retorna falso. |
| `!`      | Negação   | Retorna verdadeiro se a condição for falsa, e falso se a condição for verdadeira. Também inverte o valor da variável lógica. É o mesmo que o operador de negação unário lógico. |



## Operadores Ternários

Operadores ternários fazem parte de uma condicional que leva três operandos dentro de uma mesma linha.

```java
variavel = expressaoUm ? expressaoDois : expressaoTres;

// Isso é o mesmo que:

if(expressaoUm){
    variavel = expressaoDois;
}else{
    variavel = expressaoTres;
}

// Exemplo:

if(num1>num2){
    resultado = num1+num2;
}else{
    resultado = num1-num2;
}

// O que é o mesmo que:

resultado = (num1>num2) ? (num1+num2): (num1-num2);

// Então, se dermos os valores
// num 1 = 10;
// num 2 = 20;
// Nossa variável resultado retornará a segunda operação:
// res = num1-num2 = -10;
// Já que neste caso num1<num2
```

Onde `?` é o valor da variável caso a condição seja verdadeira, e `:` é o valor da variável caso a condição seja falsa.



## Operadores de Atribuição

Operadores de atribuição atribuem um valor a uma variável.

| Operador | Operação                                                     |
| -------- | ------------------------------------------------------------ |
| =        | Atribui um valor literal a uma variável.                     |
| +=       | Adiciona um valor ao valor atual de uma variável.            |
| -=       | Subtrai um valor ao valor atual de uma variável.             |
| *=       | Multiplica um valor pelo o valor atual de uma variável.      |
| /=       | Divide o valor atual de uma variável por um valor.           |
| %=       | Retorna o resto da divisão do valor atual de uma variável por um valor. |
