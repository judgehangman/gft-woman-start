[![DIO - Anotações](https://img.shields.io/badge/DIO-Anotações-e7c2ff?style=for-the-badge)](https://web.dio.me/course/variaveis-tipos-de-dados-e-operadores-matematicos-em-java/learning/d687771f-76cd-4379-9e1f-1c529c44e15b)

# Tipos de Dados

Tipo de Dados (_data type_) são um conjunto de valores e um conjunto de operações sobre estes valores. Podem ser primitivos ou não-primitivos (compostos):

- **Primitivos:** são atômicos e, consequentemente, homogêneos
- **Não-primitivos (compostos): ** podem ser compostos de vários tipos primitivos

### Primitivos

Tipos primitivos são pré-determinados pela linguagem de programação, podendo conter um único tipo de valor. Ests tipos ão atômicos e homogêneos e guardam valores diretamente na memória.

|   Tipo    |                           Valores                            |   Espaço na Memória   | Default  |
| :-------: | :----------------------------------------------------------: | :-------------------: | -------- |
|  `char`   | caracteres ASCII, podendo também ser o código da tabela; deve ser colocado entre aspas simples `''` |        16 bits        | '\u0000' |
| `boolean` |                        `true` `false`                        | 8 bits (usa apenas 1) | false    |
|  `byte`   | ![img](https://latex.codecogs.com/png.image?\dpi{110}[-128,127]) |        8 bits         | 0        |
|  `short`  | ![img](https://latex.codecogs.com/png.image?\dpi{110}[-2^{15}, 2^{15}-1]) |        16 bits        | 0        |
|   `int`   | ![img](https://latex.codecogs.com/png.image?\dpi{110}[-2^{31}, 2^{31}-1]) |        32 bits        | 0        |
|  `long`   | ![img](https://latex.codecogs.com/png.image?\dpi{110}[-2^{63}, 2^{63}-1]) devem ser identificados com o sufixo `L` ou `l` |        64 bits        | 0L       |
|  `float`  | números reais com até 7 casas decimais, devem ser identificados com o sufixo `F` or `f` |        32 bits        | 0.0f     |
| `double`  | números reais com até 16 casas decimais, podem ser identificados com o sufixo `D` ou `d` |        64 bits        | 0.0d     |





### Não-primitivos (compostos)

Não são definidos pela linguagem de programação. Guardam um endereço de memória de valor variável, portanto não guardam valores diretamente na memória.

| Tipo   | Descrição                                                    | Default |
| ------ | ------------------------------------------------------------ | ------- |
| String | Guarda uma sequência de caracteres. Deve ser escrita entre duas aspas `" "` | null    |
| Array  | Um grupo de variáveis do mesmo tipo, referidas por um nome comum. PODE ser declarada como outras variáveis utilizando-se `[ ]` após o tipo a ser guardado. Variáveis dentro de um Array só podem ser do mesmo tipo. Exemplo: `Array array[] = {var, var2, var3}` OU `String stringArray[] = {"string", "string 2", "string 3"}`OU `int intArray[] = {1,2,3}` etc | null    |
| Class  | Um protótipo ou *blueprint* definida pelo usuário através da qual objetos são criados. Representa um conjunto de propriedades e métodos que são comuns a todos os objetos de um tipo. | null    |
| Object | Unidade básica da Programação Orientada a Objetos. Representa entidades "da vida real". Um objeto é composto por estado (atributos e propriedades), comportamento (métodos e respostas), e identidade (nome único que permite interação) | null    |

## Tipificação









Tipificação:

- Estática (forte) vs Dinâmica (fraca)
  - Java é uma linguagem fortemente tipada
- Primitivo vs Composto
  - Primitivo: são atômicos e, consequentemente, homogêneos
  - Composto: podem ser compostos de vários tipos primitivos



* Textual, numeral, lógico, objeto
