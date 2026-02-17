-- creating master data of qualifications

CREATE TABLE qualifications(

    id BIGSERIAL PRIMARY KEY,
    code VARCHAR(50) NOT NULL UNIQUE ,
    name VARCHAR(100) NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by INTEGER,
    updated_at TIMESTAMP,
    updated_by INTEGER
);