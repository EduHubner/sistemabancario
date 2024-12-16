CREATE TABLE usuario (
idUsuario INT NOT NULL UNIQUE AUTO_INCREMENT,
nome VARCHAR(45) NOT NULL,
cpf VARCHAR(11) NOT NULL,
PRIMARY KEY (idUsuario));

CREATE TABLE conta (
numconta INT NOT NULL UNIQUE,
saldo DOUBLE NOT NULL,
agencia INT NOT NULL,
usuarioId INT NOT NULL,
usuarioNome VARCHAR (45),
PRIMARY KEY (numconta),	
FOREIGN KEY (usuarioId) references usuario(idUsuario));

CREATE TABLE cartao (
idcartao INT NOT NULL UNIQUE AUTO_INCREMENT,
numCartao INT NOT NULL UNIQUE,
tipo VARCHAR(15),
cvv INT NOT NULL,
validade DATE NOT NULL,
conta INT NOT NULL,
PRIMARY KEY (idcartao),
FOREIGN KEY (conta) REFERENCES conta(numconta));

CREATE TABLE transferencia (
idTransferencia INT NOT NULL UNIQUE AUTO_INCREMENT,
valor DOUBLE NOT NULL,
dataTransferencia DATE NOT NULL,
contaPaga INT NOT NULL,
contaRecebe INT NOT NULL,
PRIMARY KEY (idtransferencia),
FOREIGN KEY (contaPaga) REFERENCES conta(numconta),
FOREIGN KEY (contaRecebe) REFERENCES conta(numconta));

CREATE TABLE pagamento (
idPagamento INT NOT NULL UNIQUE AUTO_INCREMENT,
tipo VARCHAR(15) NOT NULL,
transferenciaId INT NOT NULL,
numContaPagante INT NOT NULL,
PRIMARY KEY (idPagamento),
FOREIGN KEY (transferenciaId) REFERENCES transferencia(idTransferencia),
FOREIGN KEY (numContaPagante) REFERENCES transferencia(contaPaga));




