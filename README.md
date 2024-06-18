# Oficina de Integração 2

## Configuração do Banco de Dados

Para executar o software corretamente, é imprescindível ter o MySQL instalado em sua máquina, pois ele foi desenvolvido com base nesse banco de dados. Siga as instruções abaixo criar o banco de dados e as tabelas necessárias:

1. Crie um novo banco de dados, com o nome `oficina_apoo`. Após, execute o seguinte script SQL no novo banco de dados para a criação das tabelas:
   
```
CREATE TABLE filme (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    data_lancamento VARCHAR(255) NOT NULL,
    elenco VARCHAR(255) NOT NULL,
    sinopse VARCHAR(255) NOT NULL,
    preco VARCHAR(255) NOT NULL
);

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    tipo_usuario VARCHAR(255) NOT NULL
);

CREATE TABLE compra (
    id INT AUTO_INCREMENT PRIMARY KEY,
    quantidade INT NOT NULL,
    usuario_id INT,
    filme_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (filme_id) REFERENCES filme(id)
);
