[![DIO - Anotações](https://img.shields.io/badge/DIO-Anotações-e7c2ff?style=for-the-badge)](https://web.dio.me/course/variaveis-tipos-de-dados-e-operadores-matematicos-em-java/learning/d687771f-76cd-4379-9e1f-1c529c44e15b)

# Variáveis

Em programação, variável `variable` é um local de armazenamento na memória com nome simbólico (identificador), que contém uma informação (valores). Variáveis possuem nomes, e em certas linguagens (como Java), um tipo de dado `datatype` específico deve ser associado a uma variável quanto esta é declarada. Variáveis não possuem um valor fixo, e podem mudar conforme a execução do código.

|                                                     |                                           |
| :-------------------------------------------------- | ----------------------------------------- |
| variável **`variable`**                             | espaço reservado na memória para um valor |
| [identificador](#Identificadores) **`identifier`**  | nome simbólico de uma variável            |
| literal **`literal`**                               | representação de um valor em memória      |
| declaração de variável **`declaration statement`**  | associa uma variável com um tipo de dado  |
| declaração de atribuição **`assignment statement`** | associa um valor com uma variável         |



## Tipos de Variáveis em Java

Existem 3 tipos de variáveis em Java:  local `local`, instância `instance`, e estática `static`.

### Variáveis Locais

Uma variável definida dentro de um bloco `block`, método `method` (função `function`), ou constutor `constructor` é chamada de local `local variable`.

- Essas variáveis são criadas quando se entra em um bloco ou uma função é executada, e são destruídas após sair deste bloco ou quando a função retorna `return`.
- O escopo dessas variáveis engloba apenas o bloco onde a variável é declarada, ou seja, só podemos acessar a variável dentro de seu bloco.
- Uma variável local precisa ser inicializada antes de ser usada em seu determinado escopo.

#### Argumentos e Parâmetros

Um argumento `argument` é um valor passado para uma função na chamada da função `function call`. Um argumento passado com uma função substitui as variáveis usadas durante a definição da função e a função é então executada com esses valores.

Parâmetros `parameters` são variáveis usadas para definir um valor particular durante a definição de um método. Quando definimos uma função, introduzimos ao compilador algumas variáveis que serão utilizadas na execução dessa função.

```java
public class Exemplo{
    // as variáveis a e b são parâmetros

    public static int multiplicar (int a, int b){
        return a * b;
    }
    
    public static void main(String[] args){
        
        int x = 2;
        int y = 5;
        
        // as variáveis x e y são argumentos
        int produto = multiplicar(x,y);
        Sytem.out.println("PRODUTO: " + produto);
    }
}

```



### Variáveis Globais

Variáveis globais, também chamadas de variáveis de tipo instância `instance variables` são variáveis não-estáticas `non-static` e são declaradas fora de um método, construtor, ou bloco.

- Como são declaradas dentro da Classe, essas variáveis são criadas quando um objeto da classe é criado, e destruídas quando o objeto é destruído.
- Ao contrário das variáveis locais, variáveis instanciadas podem conter especificadores de acesso. Se um especificador de acesso `access specifier` não for definido, então o especificador padrão será utilizado.

```java
class Exemplo {
 
    public String instancia; // declaração da variável
 
   // Construtor padrão
    public Construtor(){
 
        this.instancia = "Variável Instância"; // inicialização da variável
    }
// Método Main
    public static void main(String[] args) {
       Construtor variavel = new Construtor(); // cria objeto
        System.out.println(variavel.instancia);
    }
}
```



### Variáveis Estáticas

Variáveis estáticas `static variables`, também chamadas de variáveis do tipo Classe `Class variables`, são declaradas usando a palavra-chave  `static`  dentro de uma classe `Class` e fora de um método, construtor, ou bloco.

- Diferente das variáveis instanciadas, apenas uma unidade dessas variáveis podem ser usadas por classe, independente de quantos objetos são criados.
- Variáveis estáticas são criadas no início da execução do programa e destruídas automaticamente quando acaba a execução.
- Inicialização de variáveis estáticas não é obrigatória. Seu valor inicial é 0.
- Se variáveis estáticas forem acessadas como variáveis instanciadas (através de um objeto), o compilador irá mostrar um aviso, o que não irá interromper o programa: o compilador substituirá o nome do objeto pelo nome da classe automaticamente.
- Se variáveis estáticas forem acessadas sem o nome da classe, o compilador irá automaticamente anexar o nome da classe.

```java
class Exemplo {
   
  public static String estatica = "Variável Estática"; // declara variável estática
   
    public static void main (String[] args) {
        
      //variável 'estatica' pode ser acessada sem criação de objeto
        System.out.println("Conteúdo da variável estática: " + Exemplo.estatica); // deve ser acessada com o nome da classe
    }
}
```

#### Diferenças entre variáveis de Instância e Classe

|          | Instância                                                    | Estática                                                     |
| -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Cópias   | Cada objeto possui sua cópia de uma variável                 | Cada variável é única por classe                             |
| Mudanças | Mudanças feitas na variável dentro de um objeto não afetam outros objetos, já que cada objeto possui apenas uma cópia | Mudanças irão refletir em todos os objetos, já que estáticas são comuns a todos objetos de uma classe |
| Acesso   | Podem ser acessadas através de referências de objeto         | Podem ser acessadas diretamente utilizando-se o nome da classe |



## Visibilidade e Modificadores

Variáveis (e métodos, etc) levam modificadores que determinam sua visibilidade e escopo.

### Modificadores de Acesso

Modificadores de acesso `access modifiers` determinam a visibilidade e o nível de acesso de entidades dentro do programa.

- **Padrão** `default`: se o nível de acesso não for especificado, então leva o nível 'default'. Seu escopo é dentro do pacote.
- **Pública** `pulbic`: é o nível mais comum de acesso. Quando esse modificador é usado com uma entidade, como uma variável, a mesma é acessível pelo programa de forma completa; dentro ou fora da classe, dentro ou fora do pacote, etc.
- **Protegida** `protected`: esse nível tem um escopo dentro do pacote, mas também é acessível fora do mesmo através de classes herdadas.
- **Privada** `private`: quando uma entidade é do tipo 

Podem ser resumidos através da seguinte tabela:

| Visibilidade |    Mesma Classe    |    Mesmo Pacote    | Pacote Diferente (subclasse) | Pacote Diferente (Sem subclasse) |
| :----------: | :----------------: | :----------------: | :--------------------------: | :------------------------------: |
|   Private    | :heavy_check_mark: |        :x:         |             :x:              |               :x:                |
|   Default    | :heavy_check_mark: | :heavy_check_mark: |             :x:              |               :x:                |
|  Protected   | :heavy_check_mark: | :heavy_check_mark: |      :heavy_check_mark:      |               :x:                |
|    Public    | :heavy_check_mark: | :heavy_check_mark: |      :heavy_check_mark:      |        :heavy_check_mark:        |

### Modificadores de Comportamento

Modificadores de comportamento providenciam informações sobre o comportamento de determinadas entidades dentro do progama a JVM. Os mais relevantes para variáveis são:

- **Estática** `static`: pertencem à classe e podem ser chamadas sem criar um objeto dessa classe.
- **Final** `final`: se referem a constantes, não podem ter o valor mudado.



## Padrões de Definição e Estilo

Variáveis em Java são definidas da seguinte forma:

`<visibilidade> <modificador> datatype identificador <=valorInicial>;`

Onde:

|                                                    | Descrição                                                    |
| -------------------------------------------------- | ------------------------------------------------------------ |
| [**Visibilidade**](#Modificadores de Acesso)       | Determina qual parte do programa pode acessar essa variável. `private` `public` `default` `protected` |
| [**Modificador**](#Modificadores de Comportamento) | Determina o comportamento dessa variável. `static` `final` `abstract` `transient` `volatile` `synchronized` `native` |
| [**Dataype**](./m3-02-tipos-dados.md)              | Determina o tipo de dado para o qual a variável aloca espaço na memória. |
| **[Identificador](#Identificadores)**              | Nome único simbólico da variável.                            |
| **ValorInicial**                                   | Valor inicial atribuído a variável, caso necessário.         |

Exemplo:

```java
int integer;
int velocidade = 3, tempo = 50;
private float privateFloat = 10.2f;
public static String string = "Minha String";
```

### Identificadores

Todas as variáveis devem se identificadas com um nome único. Identificadores podem ser nomes curtos (como x e y), ou nomes mais descritivos como (idade, soma, volumeTotal). Recomenda-se a utilização de nomes descritivos para que o código fique mais compreensível.

- Nomes podem conter letras, dígitos, underlines e cifrões.

- Nomes devem começar com uma letra

- Nomes não podem conter espaços em branco

- Nomes fazem distinção entre letras maiúsculas e minúsculas

- Não podem conter palavras reservadas do Java:

  ```
  abstract continue for new switch assert default goto package synchronized boolean do if private this break double case implements throw protected byte else import public throws enum instanceof return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while
  ```

<u>O guia de estilo do Java determina que variáveis sejam nomeadas de acordo com as seguintes regras:</u>

- Letra inicial minúscula, no estilo `camelCase`
- Variáveis do tipo `static final` são identificadas de forma única, utilizando `SCREAMING_SNAKE_CASE` 
- Embora seja permitido, nomes de variáveis não devem ser iniciadas com `_` ou `$`
- Nomes devem ser curtos mas significativos, devendo ser escolhidos para indicar ao observador casual a intenção em sua utilização
- Nomes com apenas um caracter devem ser evitados, exceto por situações envolvendo variáveis temporárias, por exemplo dentro de um incremento em um loop. Nomes comuns para essas variáveis são:
  - Números inteiros: `i j k m n`
  - Caracteres: `c d e`
