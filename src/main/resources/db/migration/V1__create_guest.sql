CREATE TABLE IF NOT EXISTS reward (
    id SERIAL,
    description VARCHAR(255) NOT NULL,
    minimum_days INT NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS guest (
    id SERIAL,
    full_name VARCHAR(155) NOT NULL,
    checkin_date DATE NOT NULL,
    checkout_date DATE,
    days_stayed INT,
    reward_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (reward_id) REFERENCES reward(id)
);
