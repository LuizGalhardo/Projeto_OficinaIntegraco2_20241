# conecta-utfpr-oficina1

## Configuração do Banco de Dados

Para executar o software corretamente, é imprescindível ter o MySQL instalado em sua máquina, pois ele foi desenvolvido com base nesse banco de dados. Siga as instruções abaixo criar o banco de dados e as tabelas necessárias:

1. Crie um novo banco de dados, com o nome `oficina_apoo`. Após, execute o seguinte script SQL no novo banco de dados para a criação das tabelas:
   
```
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    campus VARCHAR(255) NOT NULL,
    tipo_usuario VARCHAR(255) NOT NULL
);

CREATE TABLE item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    local VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    situacao VARCHAR(255) NOT NULL,
    data_encontro VARCHAR(255) NOT NULL,
    criado_por INT,
    atualizado_por INT,
    FOREIGN KEY (criado_por) REFERENCES usuario (id),
    FOREIGN KEY (atualizado_por) REFERENCES usuario (id)
);
