CREATE TABLE "tb_passageiros" (
    "CPF" INTEGER,
    "nome" TEXT NOT NULL,
    "tataNascimento" TEXT NOT NULL,
    "telefone1" TEXT NOT NULL,
    "telefone2" TEXT NOT NULL,
    "rua" TEXT NOT NULL,
    "numero" TEXT NOT NULL,
    "CEP" TEXT NOT NULL,
    "complemento" TEXT NOT NULL,
    "bairro" TEXT NOT NULL,
    "cidade" TEXT NOT NULL,
    "estado" TEXT NOT NULL,
    PRIMARY KEY ("CPF" AUTOINCREMENT)
);

CREATE TABLE "tb_rotas" (
    "rota_id" INTEGER,
    "origem" TEXT NOT NULL,
    "destino" TEXT NOT NULL,
	PRIMARY KEY ("rota_id" AUTOINCREMENT)
);

CREATE TABLE "tb_voos" (
    "numeroVoo" INTEGER,
    "rota_id" INTEGER,
    "dataPartida" TEXT,
    "dataChegada" TEXT,
    "aviao" TEXT,
    PRIMARY KEY ("numeroVoo" AUTOINCREMENT),
	FOREIGN KEY ("rota_id") REFERENCES "tb_rotas"("rota_id")
);

CREATE TABLE "tb_reservas" (
    "reserva_id" INTEGER,
    "passageiro_id" INTEGER,
    "NumeroVoo_id" INTEGER,
    "NumeroAssento" TEXT,
	PRIMARY KEY ("reserva_id" AUTOINCREMENT),
    FOREIGN KEY ("passageiro_id") REFERENCES "tb_passageiro"("passageiro_id"),
    FOREIGN KEY ("NumeroVoo_id") REFERENCES "tb_voos"("NumeroVoo_id")
);

-------------------------------------------------------------

INSERT INTO "tb_rotas" (origem, destino)
VALUES
	('eua', 'espanha'), 
	('sp-brazil', 'ohio-eua'), 
	('china', 'coreia'), 
	('marrocos', 'noruega'),
	('espanha', 'brazil');
    
    
