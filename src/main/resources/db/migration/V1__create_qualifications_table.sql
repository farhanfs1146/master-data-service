CREATE TABLE qualifications
(
    id         SERIAL PRIMARY KEY,
    code       VARCHAR(50) UNIQUE NOT NULL,
    name       VARCHAR(100)       NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);