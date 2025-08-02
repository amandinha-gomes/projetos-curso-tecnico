CREATE TABLE "tb_cliente" (
	"cliente_id" INTEGER,
	"nome" TEXT NOT NULL,
	"cnh" TEXT,
	"telefone" TEXT,
	PRIMARY KEY ("cliente_id" AUTOINCREMENT)
);

CREATE TABLE "tb_veiculo" (
	"veiculo_id" INTEGER,
	"modelo" TEXT NOT NULL,
	"ano" TEXT NOT NULL,
	"placa" TEXT NOT NULL,
	"disponibilidade" TEXT NOT NULL,
	PRIMARY KEY ("veiculo_id" AUTOINCREMENT)
);

CREATE TABLE "tb_aluguel" (
	"aluguel_id" INTEGER,
	"cliente_id" INTEGER NOT NULL,
	"veiculo_id" INTEGER NOT NULL,
	"data_inicio" TEXT NOT NULL,
	"data_fim" TEXT NOT NULL,
	PRIMARY KEY ("aluguel_id" AUTOINCREMENT),
	FOREIGN KEY ("cliente_id") REFERENCES tb_cliente ("cliente_id"),
	FOREIGN KEY ("veiculo_id") REFERENCES tb_veiculo ("veiculo_id")
);

---------------------------------------------------------------------

INSERT INTO "tb_cliente" (nome, cnh, telefone)
	VALUES
	('maria ferreira', '1234567890', '12345-6789'),
	('joao kleber', '1234567891', '12345-67891'),
	('mariana almeida', '1234567892', '12345-67892'),
	('suellen souza', '1234567893', '12345-67893'),
	('samanta alves', '1234567894', '12345-67894'),
	('rafael de gino', '1234567895', '12345-67895'),
	('estella dias', '1234567896', '12345-67896'),
	('yollanda moraes', '1234567897', '12345-67897');

INSERT INTO "tb_veiculo" (modelo, ano, placa, disponibilidade)
	VALUES
	('Audi', '2020', 'ABC-1234', 'disponível'),
	('BMW', '2021', 'DEF-5678', 'disponível'),
	('CAOA Chery', '2021', 'GHI-9123', 'alugado'),
	('Chevrolet', '2022', 'JKL-4567', 'disponível'),
	('Citroën', '2022', 'MNO-8912', 'alugado'),
	('Aston Martin', '2021', 'PQR-3456', 'alugado'),
	('Toyota', '2020', 'STU-7891', 'dispoível'),
	('Fiat', '2021', 'VWX-2345', 'alugado');

INSERT INTO "tb_aluguel" (cliente_id, veiculo_id, data_inicio, data_fim)
	VALUES
	('1', '1', '2023-09-03', '2023-09-03'),
	('2', '3', '2023-05-07', '2023-05-10'),
	('3', '1', '2023-10-04', '2023-10-10'),
	('4', '3', '2023-07-02', '2023-07-15'),
	('5', '4', '2022-08-03', '2023-08-03'),
	('6', '3', '2023-10-07', '2023-10-17'),
	('7', '2', '2022-05-03', '2023-05-23'),
	('8', '1', '2023-06-20', '2023-06-27'),
	('5', '2', '2022-05-03', '2023-05-23'),
	('8', '2', '2023-06-20', '2023-06-27');
    
---------------------------------------------------------------------

SELECT * FROM tb_cliente WHERE telefone = "12345-67892";

SELECT * FROM tb_cliente WHERE cnh = "1234567892";

SELECT nome, cnh FROM tb_cliente;

---------------------------------------------------------------------

SELECT * FROM tb_veiculo WHERE ano = "2021";

SELECT * FROM tb_veiculo WHERE veiculo_id = "3";

SELECT * FROM tb_veiculo WHERE disponibilidade = "disponível";

---------------------------------------------------------------------

SELECT
	tb_cliente.nome,
	tb_cliente.cnh,
	tb_veiculo.modelo,
	tb_veiculo.placa,
	tb_veiculo.disponibilidade,
	tb_aluguel.aluguel_id,
	tb_aluguel.data_inicio,
	tb_aluguel.data_fim
FROM
	tb_aluguel
INNER JOIN
	tb_cliente ON tb_cliente.cliente_id = tb_aluguel.cliente_id
INNER JOIN
	tb_veiculo ON tb_veiculo.veiculo_id = tb_aluguel.veiculo_id
    
---------------------------------------------------------------------

SELECT
	tb_cliente.nome,
	tb_cliente.cnh,
	tb_veiculo.modelo,
	tb_veiculo.placa,
	tb_veiculo.disponibilidade,
	tb_aluguel.aluguel_id,
	tb_aluguel.data_inicio,
	tb_aluguel.data_fim
FROM
	tb_aluguel
INNER JOIN
	tb_cliente ON tb_cliente.cliente_id = tb_aluguel.cliente_id
INNER JOIN
	tb_veiculo ON tb_veiculo.veiculo_id = tb_aluguel.veiculo_id
WHERE
	tb_veiculo.disponibilidade = "disponível";
    
    ---------------------------------------------------------------------
    
    SELECT
	tb_cliente.nome,
	tb_cliente.cnh,
	tb_veiculo.modelo,
	tb_veiculo.placa,
	tb_veiculo.disponibilidade,
	tb_aluguel.aluguel_id,
	tb_aluguel.data_inicio,
	tb_aluguel.data_fim
FROM
	tb_aluguel
INNER JOIN
	tb_cliente ON tb_cliente.cliente_id = tb_aluguel.cliente_id
INNER JOIN
	tb_veiculo ON tb_veiculo.veiculo_id = tb_aluguel.veiculo_id
WHERE
	tb_veiculo.disponibilidade = "alugado";
    
    ---------------------------------------------------------------------
    
UPDATE tb_cliente
SET telefone = "8928893"
WHERE cliente_id = 1;

UPDATE tb_cliente
SET telefone = "767687"
WHERE cliente_id = 2;

UPDATE tb_cliente
SET telefone = "023918"
WHERE cliente_id = 3;

UPDATE tb_cliente
SET telefone = "890993"
WHERE cliente_id = 4;

UPDATE tb_cliente
SET telefone = "0299308"
WHERE cliente_id = 5;

---------------------------------------------------------------------

UPDATE tb_veiculo
SET placa = "WOP-0987"
WHERE veiculo_id = 1;

UPDATE tb_veiculo
SET placa = "PAB-0917"
WHERE veiculo_id = 2;

UPDATE tb_veiculo
SET placa = "BGF-4576"
WHERE veiculo_id = 3;

UPDATE tb_veiculo
SET placa = "KOL-1093"
WHERE veiculo_id = 4;

UPDATE tb_veiculo
SET placa = "APL-0954"
WHERE veiculo_id = 5;

---------------------------------------------------------------------

DELETE FROM tb_aluguel WHERE aluguel_id = 1;
DELETE FROM tb_aluguel WHERE aluguel_id = 2;
DELETE FROM tb_aluguel WHERE aluguel_id = 3;
DELETE FROM tb_aluguel WHERE aluguel_id = 4;
DELETE FROM tb_aluguel WHERE aluguel_id = 5;
