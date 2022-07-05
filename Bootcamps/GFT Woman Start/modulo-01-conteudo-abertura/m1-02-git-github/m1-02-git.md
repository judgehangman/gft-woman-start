# m1-02-git-conceitos

[![DIO - Anotações](https://img.shields.io/badge/DIO-Anota%C3%A7%C3%B5es-e7c2ff?style=for-the-badge)](https://web.dio.me/course/dominando-ides-java/learning/b0f1ae39-6af7-4a2c-8fc2-c73ae8463c84)

## Conceitos de Git

Git é um sistema de controle de versão de arquivos distribuído. É gratuito e open source.

### :question: Como Funciona O Git?

O Git é um Sistema Distribuído de Controle de Versão, o que quer dizer que não salva apenas as alterações mais recentes nos arquivos: na verdade, clientes duplicam localmente o repositório completo. Assim, se um servidor tiver problema, e esses sistemas estiverem colaborando por meio dele, qualquer um dos repositórios de clientes podem ser copiado de volta para o servidor para restaurá-lo. Cada clone é um backup completo dos dados.

Esse tipo de sistema funciona bem com vários repositórios remotos, permitindo a colaboração de diferentes grupos de pessoas de formas diferente ao mesmo tempo dentro do mesmo projeto.

#### Git é um sistema seguro

O Git trata os dados de um repositório como _snapshots_ do sistema de arquivos em determinado ponto no tempo. Cada _commit_ é uma "foto" de todos os arquivos, que armazena uma referência para esses conjunto. E se os arquivos não forem alterados, para ser eficiente, o Git não armazena o arquivo novamente, só um link para o arquivo idêntico armazenado anteriormente.

A maioria das operaçãos realizadas pelo Git são locais, nenhuma informação de outro computador na rede é necessária para sua execução. Todo a história do projeto fica armazenado mo disco local, em vez de apenas no servidor, então _commits_ podem ser realizados mesmo sem acesso à rede.

Além disso, quando o cliente faz algo no Git, quase sempre os dados são adicionados ao banco de dados, não removidos, o que torna difícil fazer algo no sistema que não seja reversível, or fazê-lo apagar dados. Como em qualquer sistema de versionamento, é sim possível perder alterações que ainda não tenham sido adicionadas em um _commit_, mas após esse _commit_ ser feito, é muito difícil haver uma perda.

**SHA-1**

Tudo no Git passa por uma soma de verificações (_checksum_) antes de ser armazenado, e é referenciado pela mesma, o que torna impossível mudar o conteúdo de qualquer arquivo ou pasta sem que o Git saiba. Isso faz com que não seja possível perder informações ou receber um arquivo corrompido sem que o Git seja capaz de detectar.

O mecanismo pelo qual o Git faz essa operação é o **SHA-1** ("_Secure Hash Algorithm_"), um conjunto de funções criptográficas projetas pela Agência Nacional de Segurança dos Estados Unidos. Essa encriptação gera uma sequência de 40 caracteres hexadecimais, calculada com base no conteúdo de uma estrutura de arquivo ou diretório Git. O Git armazena tudo em seu banco de dados não pelo nome do arquivo, mas pelo valor hash de seu conteúdo.

#### Estado de Arquivos

O Git tem três estados principais que os arquivos podem estar: committed, modified (modificado), e staged (preparado).

**Committed** quer dizer que os dados estão armazenados de forma seguras no banco de dados local. **Modified** indica que o arquivo foi alterado, mas ainda não foi feito o _commit_ no banco de dados. **Staged** significa que a versão atual de um arquivo modificado foi marcada para fazer parte do próximo commit.

![Diretório de trabalho, área de preparo, e o diretório Git.](https://git-scm.com/book/en/v2/images/areas.png)

O diretório Git é onde o Git armazena os metadados e o banco de dados de objetosde seu projeto. Esta é a parte mais importante do Git, e é o que é copiado quando o repositório é clonado de outro computadodor.

_Working directory_ ou diretório de trabalho é uma cópia de uma versão do projeto. Esses arquivos são pegos do banco de dados compactado no diretório Git e colocados no disco para você poder usar ou modificar.

_Staging area_ ou área de preparo é um arquivo, geralmente dentro do diretório Git, que armazana informações sobre o que vai entrar em seu próximo commit, ou seja, arquivos que estão no estado _staged_.

#### Objetos do Git

O armazenamento do Git é feito através de chave-valor. Isso quer dizer que qualquer conteúdo pode ser inserido, e o Git lhe devolverá uma chave que pode ser utilizada para recuprar o conteúdo a qualquer momento. Essas chaves são feitas através de uma encriptação SHA1, e dependem das chaves dos arquivos presentes em níveis mais baixos na hierarquia, de forma que, se um arquivo de nível mais baixo for alterado (e, consequentemente, a sua chave), então a chave dos arquivos de nível mais alto serão alteradas também.

**Blobs**

_Blobs_ contém um conteúdo arbitrário em arquivo binário. É o objeto mais básico do Git, para armzenar dados comprimidos e uma sequência de metadados, sendo composto pela palavra `blob` + o tamanho do conteúdo + um delimitador `\0`. Não guarda o nome do arquivo, apenas seu conteúdo.

**Trees**

_Trees_ apontam para _blobs_. Contém o conteúdo em seu interior + o tamanho desse conteúdo + metadados e o nome do arquivo + o delimitador `\0`. Essas trees são responsáveis pela estrutra do sistema de arquivos, e representam os snapshots dos arquivos rastreados pelo Git.

![Versão simples do modelo de dados do Git.](https://git-scm.com/book/en/v2/images/data-model-1.png)

**Commits**

_Commits_ apontam para a _tree_ de nível mais alto e para um _parent_ (ou seja, um _commit_ anterior). Armazena o autor, uma mensagem e uma _timestamp_.

![Todos os objetos no seu diretório do Git.](https://git-scm.com/book/en/v2/images/data-model-3.png)

## :link: Links Úteis

* [O Que É Git e GitHub?](https://www.youtube.com/watch?v=DqTITcMq68k) (YouTube)
* [Git Pro Book: Básicos do Git](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) (Git)
