# Conceitos de Git

Git é um sistema de controle de versão de arquivos distribuído. É gratuito e open source.

## Como Funciona O Git?

O Git é um Sistema Distribuído de Controle de Versão, o que quer dizer que não salva apenas as alterações mais recentes nos arquivos: na verdade, clientes duplicam localmente o repositório completo. Assim, se um servidor tiver problema, e esses sistemas estiverem colaborando por meio dele, qualquer um dos repositórios de clientes podem ser copiado de volta para o servidor para restaurá-lo. Cada clone é um backup completo dos dados.

Esse tipo de sistema funciona bem com vários repositórios remotos, permitindo a colaboração de diferentes grupos de pessoas de formas diferente ao mesmo tempo dentro do mesmo projeto.

### Git é um sistema seguro

O Git trata os dados de um repositório como _snapshots_ do sistema de arquivos em determinado ponto no tempo. Cada *commit* é uma "foto" de todos os arquivos, que armazena uma referência para esses conjunto. E se os arquivos não forem alterados, para ser eficiente, o Git não armazena o arquivo novamente, só um link para o arquivo idêntico armazenado anteriormente.

A maioria das operaçãos realizadas pelo Git são locais, nenhuma informação de outro computador na rede é necessária para sua execução. Todo a história do projeto fica armazenado mo disco local, em vez de apenas no servidor, então _commits_ podem ser realizados mesmo sem acesso à rede.

Além disso, quando o cliente faz algo no Git, quase sempre os dados são adicionados ao banco de dados, não removidos, o que torna difícil fazer algo no sistema que não seja reversível, or fazê-lo apagar dados. Como em qualquer sistema de versionamento, é sim possível perder alterações que ainda não tenham sido adicionadas em um *commit*, mas após esse *commit* ser feito, é muito difícil haver uma perda.

#### SHA-1

Tudo no Git passa por uma soma de verificações (*checksum*) antes de ser armazenado, e é referenciado pela mesma, o que torna impossível mudar o conteúdo de qualquer arquivo ou pasta sem que o Git saiba. Isso faz com que não seja possível perder informações ou receber um arquivo corrompido sem que o Git seja capaz de detectar.

O mecanismo pelo qual o Git faz essa operação é o **SHA-1** ("*Secure Hash Algorithm*"), um conjunto de funções criptográficas projetas pela Agência Nacional de Segurança dos Estados Unidos. Essa encriptação gera uma sequência de 40 caracteres hexadecimais, calculada com base no conteúdo de uma estrutura de arquivo ou diretório Git. O Git armazena tudo em seu banco de dados não pelo nome do arquivo, mas pelo valor hash de seu conteúdo.

### Estado de Arquivos

O Git tem três estados principais que os arquivos podem estar: committed, modified (modificado), e staged (preparado).

**Committed** quer dizer que os dados estão armazenados de forma seguras no banco de dados local. **Modified** indica que o arquivo foi alterado, mas ainda não foi feito o *commit* no banco de dados. **Staged** significa que a versão atual de um arquivo modificado foi marcada para fazer parte do próximo commit.

![Diretório de trabalho, área de preparo, e o diretório Git.](https://git-scm.com/book/en/v2/images/areas.png)



O diretório Git é onde o Git armazena os metadados e o banco de dados de objetosde seu projeto. Esta é a parte mais importante do Git, e é o que é copiado quando o repositório é clonado de outro computadodor.

*Working directory* ou diretório de trabalho é uma cópia de uma versão do projeto. Esses arquivos são pegos do banco de dados compactado no diretório Git e colocados no disco para você poder usar ou modificar.

*Staging area* ou área de preparo é um arquivo, geralmente dentro do diretório Git, que armazana informações sobre o que vai entrar em seu próximo commit, ou seja, arquivos que estão no estado *staged*.

### Objetos do Git

O armazenamento do Git é feito através de chave-valor. Isso quer dizer que qualquer conteúdo pode ser inserido, e o Git lhe devolverá uma chave que pode ser utilizada para recuprar o conteúdo a qualquer momento. Essas chaves são feitas através de uma encriptação SHA1, e dependem das chaves dos arquivos presentes em níveis mais baixos na hierarquia, de forma que, se um arquivo de nível mais baixo for alterado (e, consequentemente, a sua chave), então a chave dos arquivos de nível mais alto serão alteradas também.

#### Blobs

*Blobs* contém um conteúdo arbitrário em arquivo binário. É o objeto mais básico do Git, para armzenar dados comprimidos e uma sequência de metadados, sendo composto pela palavra `blob` + o tamanho do conteúdo + um delimitador `\0`. Não guarda o nome do arquivo, apenas seu conteúdo.

#### Trees

*Trees* apontam para *blobs*. Contém o conteúdo em seu interior + o tamanho desse conteúdo + metadados e o nome do arquivo + o delimitador `\0`. Essas trees são responsáveis pela estrutra do sistema de arquivos, e representam os snapshots dos arquivos rastreados pelo Git.

![Versão simples do modelo de dados do Git.](https://git-scm.com/book/en/v2/images/data-model-1.png)

#### Commits

*Commits* apontam para a *tree* de nível mais alto e para um *parent* (ou seja, um *commit* anterior). Armazena o autor, uma mensagem e uma *timestamp*.

![Todos os objetos no seu diretório do Git.](https://git-scm.com/book/en/v2/images/data-model-3.png)

## Realizando a Instalação do Git

A instalação do Git é feita através dos downloads disponíveis no [site oficial](https://git-scm.com/).

### Windows

Os passos de instalação no windows são como qualquer outro programa. É importante verificar se tanto a opção "Git Bash Here" e "Git GUI Here" estão selecionadas na hora da instalação. Quando for escolher o editor padrão, é recomendável utilizar o Vim, próprio do Git, que é a opção padrão.

### Linux

Dentro do Linux, a instalação é feita pelo terminal (como a maior parte das outras instalações dentro desse sistema). Os comandos diferem entre as distros do Linux.

No Ubuntu, podemos pegar o repositório da versão estável mais recente do Git e efetuar a instalação através destes comandos:

```shell
sudo add-apt-repository ppa:git-core/ppa
sudo apt update
sudo apt install git
```

## Chaves SSH e Tokens

Chaves SSH e Tokens são maneiras de garantir a segurança do repositório de forma criptográfica.

### Chaves SSH

A Chave SSH é uma forma de estabelecer uma conexão segura e confiável entre duas máquinas através da identificação de usuários conhecidos. Para isso, são utilizadas duas chaves, uma pública e uma privada, que identificam o usuário com base em um sistema de encriptação. A chave privada fica guardada pelo sistema original, e pode ser criptografada com uma senha, e a chave pública pode ser enviada para os servidores ou máquinas para os quais o usuário tem permissão de acessar. Dessa forma, o acesso a servidores e outras máquinas pode ser feito de forma mais segura do que utilizando login e senha, por exemplo.

#### Gerando uma chave SSH no Linux

Dentro do terminal, executamos o seguinte comando para gerar as chaves:

```shell
ssh-keygen -t id_ed25519 -C exemplo@email.com
```

Depois das chaves serem geradas, será pedido o local onde se deve salvar a chave. Por padrão, essa será salva em C:/Usuários/Nome/.ssh/id_ed25519, o que pode ser confirmado deixando o campo em branco. Além disso, será pedida uma senha (podendo deixar em branco, caso não queira que esta chave tenha senha), e então a confirmação dessa senha.

Para visualizar o conteúdo dessa chave para que a mesma possa ser adicionada ao GitHub, devemos navegar para a pasta onde a chave foi salva e executar o comando:

```shell
cat id_25519.pub
```

Em seguida, é preciso inicializar o _ssh agent_, um processo executado em plano de fundo que lida com as chaves ssh dentro do sistema. Para isso, dentro da nossa CLI (neste caso, GitBash), executamos esse comando:

```shell
eval $(ssh-agent -s)
```

Quando o agente for inicializado, será exibido seu pid (ID de processo, que é forma pela qual o sistema identifica e rastreia os processos executados). Após sua inicialização, devemos entregar a nossa chave ssh ao agente:

```shell
ssh-add id_ed25519.pub
```

Lembrando que onde está `id_ed25519.pub` se refere ao local onde o arquivo da chave está salvo, então para executar este comando somente pelo nome do arquivo, devemos estar dentro do diretório certo no terminal.

#### Gerando uma chave SSH no Windows

Dentro do [GitBash](#Windows), executamos o seguinte comando para criar as chaves:

```shell
ssh-keygen -t id_ed25519 -C exemplo@email.com
```

Depois das chaves serem geradas, será pedido o local onde se deve salvar a chave. Por padrão, essa será salva em C:/Usuários/Nome/.ssh/id_ed25519, o que pode ser confirmado deixando o campo em branco. Além disso, será pedida uma senha (podendo deixar em branco, caso não queira que esta chave tenha senha), e então a confirmação dessa senha.

Para visualizar o conteúdo dessa chave para que a mesma possa ser adicionada ao GitHub, devemos navegar para a pasta onde a chave foi salva e executar o comando:

```shell
cat id_25519.pub
```

Em seguida, é preciso inicializar o _ssh agent_, um processo executado em plano de fundo que lida com as chaves ssh dentro do sistema. Para isso, dentro da nossa CLI (neste caso, GitBash), executamos esse comando:

```shell
eval $(ssh-agent -s)
```

Quando o agente for inicializado, será exibido seu pid (ID de processo, que é forma pela qual o sistema identifica e rastreia os processos executados). Após sua inicialização, devemos entregar a nossa chave ssh ao agente:

```shell
ssh-add id_ed25519.pub
```

Lembrando que onde está `id_ed25519.pub` se refere ao local onde o arquivo da chave está salvo, então para executar este comando somente pelo nome do arquivo, devemos estar dentro do diretório certo na nossa CLI.

### Token de Acesso Pessoal

Os tokens de acesso pessoal são uma alternativa para as senhas, que podem ser utilizados dentro do GitHub (ou sistemas parecidos) ao utilizar a CLI or a API do GitHub. No GitHub é gerado através do área de desenvolvedores dentro do site.

## Configurando o Git

Para trabalhar com o Git, é preciso identificar o nome de usuário e endereço de email. Cada commit usa essa informação, que é carimbada de forma imutável nos commits.

```shell
git config --global user.name "Nome"
git config --global user.email nome@exemplo.br
```

É importante notar que utilizando configurações diferentes de nome e email, seus *commits* aparecerão com esses dados diferentes, e é impossível modificar. Se quiser utilizar um nome e email diferente em um projeto específico, é possível fazer usando o mesmo comando, só que sem `--global`.