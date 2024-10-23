CREATE TABLE Paciente (
    ID_Paciente INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(255),
    CPF VARCHAR(11),
    Data_Nascimento DATE,
    Telefone VARCHAR(15)
);

CREATE TABLE Medico (
    ID_Medico INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(255),
    Especialidade VARCHAR(255),
    CRM VARCHAR(10),
    Telefone VARCHAR(15)
);

CREATE TABLE Consulta (
    ID_Consulta INT AUTO_INCREMENT PRIMARY KEY,
    Data DATE,
    Hora TIME,
    ID_Paciente INT,
    ID_Medico INT
);

CREATE TABLE Receita (
    ID_Receita INT AUTO_INCREMENT PRIMARY KEY,
    Descricao TEXT,
    ID_Consulta INT
);

CREATE TABLE Medicamento (
    ID_Medicamento INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(255),
    Descricao TEXT
);

CREATE TABLE Receita_Medicamento (
    ID_Receita INT,
    ID_Medicamento INT,
    PRIMARY KEY (ID_Receita, ID_Medicamento)
);


--GRUPOR FORMADO POR :Vinicius Souza, Breno, Beatriz e antonio ramos
