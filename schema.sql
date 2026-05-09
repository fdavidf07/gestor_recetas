CREATE TABLE IF NOT EXISTS receta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    categoria VARCHAR(100),
    tiempo_preparacion INT,
    dificultad VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS ingrediente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    cantidad VARCHAR(100),
    tipo VARCHAR(100),
    es_alergeno BOOLEAN
);