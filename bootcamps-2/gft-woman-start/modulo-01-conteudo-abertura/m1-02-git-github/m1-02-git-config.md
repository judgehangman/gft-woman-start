# m1-02-git-config

[![DIO - Anotações](https://img.shields.io/badge/DIO-Anota%C3%A7%C3%B5es-e7c2ff?style=for-the-badge)](https://web.dio.me/course/dominando-ides-java/learning/b0f1ae39-6af7-4a2c-8fc2-c73ae8463c84)

## :tools: Realizando a Instalação do Git

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

## :closed\_lock\_with\_key: Chaves SSH e Tokens

Chaves SSH e Tokens são maneiras de garantir a segurança do repositório de forma criptográfica.

#### Chaves SSH

A Chave SSH é uma forma de estabelecer uma conexão segura e confiável entre duas máquinas através da identificação de usuários conhecidos. Para isso, são utilizadas duas chaves, uma pública e uma privada, que identificam o usuário com base em um sistema de encriptação. A chave privada fica guardada pelo sistema original, e pode ser criptografada com uma senha, e a chave pública pode ser enviada para os servidores ou máquinas para os quais o usuário tem permissão de acessar. Dessa forma, o acesso a servidores e outras máquinas pode ser feito de forma mais segura do que utilizando login e senha, por exemplo.

### **Gerando uma chave SSH no Linux**

Antes de criar uma nova chave, é importante checar se já existem chaves no sistema:

```shell
ls -al ~/.ssh
```

O terminal irá retornar uma lista de todas as chaves existentes. Chaves públicas terminam em `.pub`. Tendo certeza de que nossa chave não está no sistema, podemos prosseguir para a criação da mesma. Dentro do terminal, executamos o seguinte comando para gerar as chaves:

```shell
ssh-keygen -t ed25519 -C exemplo@email.com
```

Depois das chaves serem geradas, será pedido o local onde se deve salvar a chave. Por padrão, essa será salva em C:/Usuários/Nome/.ssh/id\_ed25519, o que pode ser confirmado deixando o campo em branco. Além disso, será pedida uma senha (podendo deixar em branco, caso não queira que esta chave tenha senha), e então a confirmação dessa senha.

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

#### **Colocando Chaves SSH no GitHub**

Primeiro, é necessário copiar a chave. Para isso, pode-se abrir o arquivo `id_ed25519.pub` diretamente da pasta, ou, no terminal, podemos exibir o conteúdo do arquivo com o seguinte comando:

```shell
cat ~/.ssh/id_ed25519.pub
```

Após disso, é preciso copiar essa chave e registrá-la no site do GitHub. Isso é feito através do menu de Acesso na área de configurações, que pode ser acessada clicando na foto de perfil no canto superior da tela. Na área de Chaves SSH e GPG, podemos adicionar uma nova chave SSH e colar o conteúdo que copiamos dentro da caixa de texto, confirmando a senha se necessário.

### **Gerando uma chave SSH no Windows**

Dentro do GitBash, executamos o seguinte comando para criar as chaves:

```shell
ssh-keygen -t id_ed25519 -C exemplo@email.com
```

Se o sistema for antigo e não dar suporte às chaves ed25519, pode ser utilizado outro algoritmo:

```shell
ssh-keygen -t rsa -b 4096 -C "exemplo@email.com"
```

Depois das chaves serem geradas, será pedido o local onde se deve salvar a chave. Por padrão, essa será salva em C:/Usuários/Nome/.ssh/id\_ed25519, o que pode ser confirmado deixando o campo em branco. Além disso, será pedida uma senha (podendo deixar em branco, caso não queira que esta chave tenha senha), e então a confirmação dessa senha.

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

#### **Colocando Chaves SSH no GitHub**

Primeiro, é necessário copiar a chave. Para isso, pode-se abrir o arquivo `id_ed25519.pub` diretamente da pasta, ou podemos copiar o conteúdo do arquivo com o seguinte comando:

```shell
clip < ~/.ssh/id_ed25519.pub
```

Após disso, é preciso copiar essa chave e registrá-la no site do GitHub. Isso é feito através do menu de Acesso na área de configurações, que pode ser acessada clicando na foto de perfil no canto superior da tela. Na área de Chaves SSH e GPG, podemos adicionar uma nova chave SSH e colar o conteúdo que copiamos dentro da caixa de texto, confirmando a senha se necessário.

### Token de Acesso Pessoal

Os tokens de acesso pessoal são uma alternativa para as senhas, que podem ser utilizados dentro do GitHub (ou sistemas parecidos) ao utilizar a CLI or a API do GitHub. No GitHub é gerado através do área de desenvolvedores dentro do site.

## :gear: Configurando o Git

Para trabalhar com o Git, é preciso identificar o nome de usuário e endereço de email. Cada commit usa essa informação, que é carimbada de forma imutável nos commits.

```shell
git config --global user.name "Nome"
git config --global user.email nome@exemplo.br
```

É importante notar que utilizando configurações diferentes de nome e email, os _commits_ aparecerão com esses dados diferentes, e é impossível modificar. Para utilizar um nome e email diferente em um projeto específico, é possível fazer usando o mesmo comando, só que sem `--global`.

## :link: Links Úteis

* [Começando com Git](https://docs.github.com/en/get-started/getting-started-with-git) (GitHub)
* I[ntrodução às Chaves SSH](https://www.ssh.com/academy/ssh/ssh-key-basics) (SSH Academy)
