BEGIN TRANSACTION;
DROP TABLE IF EXISTS patient_data;
-- Create a new table named patient_data
CREATE TABLE patient_data (
	gender VARCHAR(10),
	age float,
	hypertension INTEGER,
	heart_disease INTEGER,
	smoking_history VARCHAR(20),
	bmi NUMERIC(5,2),
	HbA1c_level NUMERIC(4,2),
	blood_glucose_level INTEGER,
	diabetes INTEGER
);

COPY patient_data(gender, age, hypertension, heart_disease, smoking_history, bmi, HbA1c_level, blood_glucose_level, diabetes)
FROM 'diabetes_prediction_dataset.csv'
WITH (FORMAT CSV, HEADER);

COMMIT TRANSACTION;