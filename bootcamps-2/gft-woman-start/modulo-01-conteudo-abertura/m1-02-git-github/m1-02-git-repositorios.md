# m1-02-git-repositorios

[![DIO - Anotações](https://img.shields.io/badge/DIO-Anota%C3%A7%C3%B5es-e7c2ff?style=for-the-badge)](https://web.dio.me/course/dominando-ides-java/learning/b0f1ae39-6af7-4a2c-8fc2-c73ae8463c84)

## :gear: Repositórios

Um _repositório,_ em termos de Git, é simplesmente o local onde os arquivos são guardados. Repositórios locais são pastas dentro de sua máquina local, ao qual o Git tem acesso. Repositórios remotos são guardados dentro de um servidor. O sistema de versionamento Git aponta um repositório remoto para um repositório local, e vice-versa.

Nesse curso, utilizamos of GitHub para nossos repositórios remotos. Esses repositórios podem ser acessados através de sua URL, e esta URL é associada com um nome. _Pushes_ só podem ser feitos para dois tipos the endereços URL:

* Uma URL HTTPS, como `https://github.com/user/repo.git`
* Uma URL SSH, como `git@github.com:user/repo.git`

### Criando um Repositório Vazio

Antes de adicionarmos um repositório remoto, devemos criar nosso repositório local. Para isso, é necessário inicializar o sistema de versionamento Git dentro da pasta que queremos que o Git monitore.

```bash
git init
```

Para associar uma URL remota com um nome, usamos seguinte comando no terminal:

```shell
git remote add origin  <REMOTE_URL> 
```

No exemplo, estamos associando o nome `origin` com a URL remota `REMOTE_URL`.

Para mudar essa URL, podemos utilizar o comando `git remote set-url`.

### Clonando Repositórios Existentes

Existem várias maneiras de se clonar repositórios disponíveis no GitHub. Nesse caso, veremos como clonar repositórios dentro de terminal através de suas URLs.

Dentro da página do GitHub, devemos clicar no botão `clone`, o que nos deixa ver as maneiras de se clonar repositórios. É importante lembrar que é preferível clonar os repositórios utilizando a URL SSH, em vez de HTTPS.

Para isso, utilizamos:

```bash
git clone <REMOTE_URL>
```

Onde `<REMOTE_URL>` é a URL do repositório a ser clonado.

## :link: Links Úteis

* [Sobre Repositórios Remotos](https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories) (GitHub)
* [Gerenciando Repositórios Remotos](https://docs.github.com/en/get-started/getting-started-with-git/managing-remote-repositories) (GitHub)
