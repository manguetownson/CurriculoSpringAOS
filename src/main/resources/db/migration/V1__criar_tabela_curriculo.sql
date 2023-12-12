CREATE TABLE curriculo (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT,
    email VARCHAR(255) NOT NULL,
    phoneNumber INT,
    currentJob VARCHAR(255),
    expYears INT

);