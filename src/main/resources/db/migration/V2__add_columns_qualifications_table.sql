ALTER TABLE qualifications
    ADD COLUMN created_by INTEGER;

ALTER TABLE qualifications
    ADD COLUMN updated_at TIMESTAMP;

ALTER TABLE qualifications
    ADD COLUMN updated_by INTEGER;

ALTER TABLE qualifications
    ADD COLUMN is_active BOOLEAN NOT NULL DEFAULT TRUE;