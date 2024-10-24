# yasTell-Bungee

![Version](https://img.shields.io/badge/version-1.0-brightgreen.svg)
![Minecraft](https://img.shields.io/badge/Minecraft-1.19+-blue.svg)

## Descrição

**yasTell-Bungee** é um plugin de mensagem privada para Minecraft BungeeCord que permite aos jogadores enviar mensagens diretas uns aos outros. Com uma interface simples e intuitiva, os jogadores podem se comunicar facilmente em um servidor BungeeCord.

## Funcionalidades

- **Mensagens Privadas**: Permite que os jogadores enviem mensagens diretas entre si.
- **Formato de Mensagem Personalizável**: Mensagens formatadas com cores personalizadas usando `&` para cores.
- **Verificações de Segurança**: Impede que jogadores se enviem mensagens para si mesmos.

## Comandos

### `/tell <jogador> <mensagem>`

Envie uma mensagem privada para outro jogador.

#### Uso:

```plaintext
/tell <jogador> <mensagem>
```

#### Exemplo:

```plaintext
/tell jogador2 Olá, como você está?
```

### Mensagens de Erro:

- `Uso: /tell <jogador> <mensagem>`: Mostrado quando os argumentos não estão corretos.
- `Apenas jogadores podem usar este comando.`: Mostrado se um não-jogador tentar usar o comando.
- `O jogador não está online.`: Mostrado se o jogador especificado não estiver online.
- `Você não pode enviar mensagens para si mesmo.`: Mostrado se um jogador tentar enviar uma mensagem para si mesmo.

## Instalação

1. Baixe o arquivo JAR do plugin `yasTell-Bungee`.
2. Coloque o arquivo JAR na pasta `plugins` do seu servidor BungeeCord.
3. Reinicie o servidor BungeeCord.

## Dependências

- **BungeeCord API**: O plugin depende da API do BungeeCord para funcionar corretamente.

## Contribuição

Se você gostaria de contribuir para o desenvolvimento deste plugin, sinta-se à vontade para abrir um pull request ou um issue no [repositório GitHub](https://github.com/nikolaikiev/yasTell-Bungee).

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato

Para mais informações ou suporte, entre em contato com o autor:

- **Nome**: Nikolai Kiev
- **Email**: [nikolaikiev@protonmail.com](mailto:nikolaikiev@protonmail.com)

```
